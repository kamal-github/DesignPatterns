// Law of Demeter (LoD) or principle of least knowledge is a design guideline for developing software,
// particularly object-oriented programs.
// Allowed calls are
// - object's own methods (methods on this)
// - methods on parameter/s passed to M as they become local to M
// - methods on O's instance variable. For example, friend.N() is allowed.
// - method on an object which is initialized in M, as they become local to M
//
// The return type also should not return the object of another class. For example, anotherFriend.
// Should not call method using pass through. For example, anotherFriend.getFriendOfFriend().NotAllowed() is not allowed.
public class LawOfDemeterMain {
    public static void main(String[] args) {
        O o = new O();
        Friend friend = new Friend();
        o.M(friend);
    }
}

class Friend {
    private final FriendOfFriend friendOfFriend;

    public Friend() {
        this.friendOfFriend = new FriendOfFriend();
    }

    public FriendOfFriend getFriendOfFriend() {
        return friendOfFriend;
    }

    public void N() {
        System.out.println("N() called");
    }
}

class FriendOfFriend {
    public void NotAllowed() {
        System.out.println("!!! FriendOfFriend pass through NotAllowed() called");
    }
}

class O {
    private final Friend friend;

    public O() {
        this.friend = new Friend();
    }

    public void M(Friend anotherFriend) {
        L(); // allowed
        friend.N(); // allowed
        anotherFriend.N(); // allowed
        anotherFriend.getFriendOfFriend().NotAllowed(); // not allowed
    }

    private void L() {
        System.out.println("O's local method L() called");
    }
}
