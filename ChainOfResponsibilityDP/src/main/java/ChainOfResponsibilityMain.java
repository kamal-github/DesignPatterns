import java.util.Optional;

// Step 1: Define the Handler Interface
abstract class Handler {
    protected Handler nextHandler;
    Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    abstract void handleRequest(Request request);
}

// Step 2: Implement Concrete Handlers
class ConcreteHandler1 extends Handler {

    ConcreteHandler1(Handler next) {
        super(next);
    }

    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.TYPE1)) {
            System.out.println("Handled by ConcreteHandler1");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

class ConcreteHandler2 extends Handler {
    ConcreteHandler2(Handler next) {
        super(next);
    }

    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.TYPE2)) {
            System.out.println("Handled by ConcreteHandler2");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

// Step 3: Define the Request and RequestType
class Request {
    private final RequestType type;

    public Request(RequestType type) {
        this.type = type;
    }

    public RequestType getType() {
        return type;
    }
}

enum RequestType {
    TYPE1, TYPE2
}

// Step 4: Client code to use the Chain of Responsibility Pattern
// Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers.
// Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in
// the chain.
//
// As an example, think of as `Fallback pattern`, when origin remote call fails, we can try to call another remote
// or finally returns the default response.
public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        Handler second = new ConcreteHandler2(null);
        Handler first = new ConcreteHandler1(second);

        // Create requests
        Request request1 = new Request(RequestType.TYPE1);
        Request request2 = new Request(RequestType.TYPE2);

        // Process requests
        first.handleRequest(request1); // Output: Handled by ConcreteHandler1
        first.handleRequest(request2); // Output: Handled by ConcreteHandler2
    }
}
