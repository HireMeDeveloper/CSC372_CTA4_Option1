public abstract class Shape {
    public abstract double surface_area();
    public  abstract double volume();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{" +
                "surface_area=" + surface_area() +
                "volume=" + volume() +
                '}';
    }
}
