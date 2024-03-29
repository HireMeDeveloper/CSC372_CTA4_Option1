public class Sphere extends Shape{
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surface_area() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
