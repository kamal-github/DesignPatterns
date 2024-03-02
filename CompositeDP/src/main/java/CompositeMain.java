import java.util.ArrayList;
import java.util.List;


public class CompositeMain {
//    The Composite Design Pattern is a structural design pattern that allows you
//    to compose objects into tree-like structures to represent part-whole hierarchies.
//    This pattern lets clients treat individual objects and compositions of objects uniformly.
//    Here's how it works:
//    `Component`: This is the base interface or abstract class for all the objects in the composition. It declares the
//    common interface for all the objects, including methods like add, remove, getChild, etc.

//    `Leaf`: This represents the "leaf" objects in the composition, i.e., objects that don't have any children.
//    They implement the behavior defined by the component interface.

//    `Composite`: This represents the complex objects in the composition, i.e., objects that have children.
//    It implements the component interface and stores child components such as leaf and other composite.
//    It provides methods to add, remove, and access child components.

//    The Composite pattern is useful in scenarios where you need to treat individual objects and compositions of
//    objects uniformly. For example, consider a scenario where you have a directory structure with files and
//    subdirectories. Each directory can contain files as well as subdirectories.
    public static void main(String[] args) {
        // Create leaf objects
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        // Create composite object
        Directory dir1 = new Directory("Directory 1");
        dir1.addComponent(file1);
        dir1.addComponent(file2);

        // Create another leaf object
        File file3 = new File("file3.txt");

        // Create another composite object
        Directory dir2 = new Directory("Directory 2");
        dir2.addComponent(file3);
        dir2.addComponent(dir1); // Adding another directory inside

        // Show details
        dir2.showDetails();
    }
}


// README: Leaf and Composite classes implement the component interface
// and makes up a bigger Composite structure and are treated uniformly by
// the Component interface.

// Component
interface FileSystemComponent {
    void showDetails();
}

// Leaf
class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}

// Composite
class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}

