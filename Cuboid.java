public class Cuboid {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }

    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public String toString() {
        return "Cuboid [panjang : " + length + ", lebar : " + width + ", tinggi : " + height + "]";
    }
}
