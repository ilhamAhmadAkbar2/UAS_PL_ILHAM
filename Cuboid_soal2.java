public class Cuboid_soal2 implements Comparable<Cuboid_soal2> {
    private double length;
    private double width;
    private double height;

    public Cuboid_soal2(double length, double width, double height) {
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
    public int compareTo(Cuboid_soal2 other) {
        return Double.compare(this.getSurfaceArea(), other.getSurfaceArea());
    }

    @Override
    public String toString() {
        return "Cuboid_soal2 [panjang : " + length + ", lebar : " + width + ", tinggi : " + height + "]";
    }
}
