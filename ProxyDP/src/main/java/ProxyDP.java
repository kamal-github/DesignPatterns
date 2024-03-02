// Client class using the ProxyImage to display images
// ---------- Difference b/w Decorator and Proxy -------
//
// Proxy pattern provides a surrogate or placeholder for another object to control access to it.
// it lazily creates the real object only when it is needed or proxy is called for ex.
// a file or a socket resource which is expensive to create and should be lazily created and
// controlled by the proxy and adds controlling behaviour by implementing access control mechanisms
// or for debugging, auditing, or performance monitoring purposes.
//
// Decorator on the other hand is used to add new functionality to an object without changing its structure.
// it also uses composition to already instantiated object and adds new functionality to it.
// https://stackoverflow.com/questions/18618779/differences-between-proxy-and-decorator-pattern
public class ProxyDP {
    public static void main(String[] args) {
        // Using ProxyImage to display images
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.png");

        // Displaying images (loading will be logged)
        image1.display();
        image2.display();
    }
}

// Image interface
interface Image {
    void display();
}

// RealImage class representing a real image
class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename + " from disk");
    }
}

// ProxyImage class providing a proxy for RealImage with logging functionality
class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
        logImageLoaded();
    }

    private void logImageLoaded() {
        System.out.println("Logged: Image " + filename + " loaded at " + java.time.LocalTime.now());
    }
}
