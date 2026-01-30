/**
 * Triangle class that extends Shape.
 * Note: Created manually via terminal as Android Studio was not allowing class creation.
 * Used ChatGPT to generate the correct Java syntax and structure.
 */
public class Triangle extends Shape {
    private int base;
    private int height;
    
    public Triangle(int x, int y, int base, int height) {
        super(x, y);  // Call parent constructor
        this.base = base;
        this.height = height;
    }
    
    public double getArea() {
        return 0.5 * base * height;
    }
}
