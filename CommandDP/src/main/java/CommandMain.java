// Command Design pattern is used to encapsulate a request as an object,
// thereby allowing for parameterization of clients with queues, requests,
// and operations. It also allows for the support of undoable operations.
// The command pattern is a behavioral design pattern in which an object is
// used to encapsulate all information needed to perform an action or
// trigger an event at a later time.
//
// Invoker/Sender could directly call the receiver to perform the action,
// but for decoupling the invoker and receiver and using the same actions
// as commands wrapped in an object make it more flexible and reusable and
// allows later execution of the action, putting them into queues, logs, etc.
public class CommandMain {
    public static void main(String[] args) {
        Document d = new Document();
        int x = 10;
        int y = 20;
        Command copyCommand = new CopyCommand(d, x, y, "ram");
        Command pasteCommand = new PasteCommand(d, x+1, y+1, "kamal");

        Invoker invoker = new Invoker();

        invoker.setCommand(copyCommand);
        invoker.executeCommand();
        invoker.setCommand(pasteCommand);
        invoker.executeCommand();
    }
}

