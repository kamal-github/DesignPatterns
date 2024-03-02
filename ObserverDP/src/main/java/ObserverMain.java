import java.util.ArrayList;

public class ObserverMain {
    public static void main(String[] args) {
        Channel channel = new Channel("Channel 1", "Live");
        Follower follower1 = new Follower("Follower 1");
        Follower follower2 = new Follower("Follower 2");
        Follower follower3 = new Follower("Follower 3");

        channel.registerObserver(follower1);
        channel.registerObserver(follower2);
        channel.registerObserver(follower3);

        channel.setStatus("Live");
    }
}

interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}

class Channel implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String channelName;
    private String status;

    public Channel(String channelName, String status) {
        this.channelName = channelName;
        this.status = status;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(this.status);
        }
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}

interface Observer {
    public void update(String status);
}

class Follower implements Observer {

    private String followerName;

    public Follower(String followerName) {
        this.followerName = followerName;
    }

    public String getFollowerName() {
        return followerName;
    }

    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }

    public void update(String status) {
        //send message to followers that Channel is live.
        play(status);
    }

    public void play(String status) {
        //play channel

        System.out.println(followerName + " is notified that Channel is " + status);
    }
}
