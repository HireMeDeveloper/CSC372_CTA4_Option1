// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ShapeArray {
    public static void main(String[] args) {
        var sphere = new Sphere(5.0);
        var cylinder = new Cylinder(5.0, 5);
        var cone = new Cone(5.0, 5);

        var shapeArray = new Shape[] { sphere, cylinder, cone };

        for ( var shape : shapeArray ) {
            System.out.println(shape.toString());
        }
    }
}