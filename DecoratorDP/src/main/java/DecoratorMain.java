// Shape interface
interface Shape {
    void draw();
}

// Concrete implementation of Shape - Circle
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}

// Concrete implementation of Shape - Rectangle
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}

// Decorator abstract class
abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}

// Concrete decorator - RedShapeDecorator
class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}

// Concrete decorator - BlueShapeDecorator
class BlueShapeDecorator extends ShapeDecorator {
    public BlueShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBlueBorder(decoratedShape);
    }

    private void setBlueBorder(Shape decoratedShape) {
        System.out.println("Border Color: Blue");
    }
}

// Main class
public class DecoratorMain {
    public static void main(String[] args) {
        // Creating a plain circle
        Shape circle = new Circle();
        System.out.println("Plain Circle:");
        circle.draw();

        // Decorating the circle with red border
        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("\nCircle with Red Border:");
        redCircle.draw();

        // Decorating the rectangle with blue border
        Shape blueRectangle = new BlueShapeDecorator(new Rectangle());
        System.out.println("\nRectangle with Blue Border:");
        blueRectangle.draw();
    }
}
