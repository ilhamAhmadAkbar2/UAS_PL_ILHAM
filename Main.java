import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "UAS_PL/src/new_data.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                String[] dimensions = line.split("\t");
                double length = Double.parseDouble(dimensions[0]);
                double width = Double.parseDouble(dimensions[1]);
                double height = Double.parseDouble(dimensions[2]);

                Cuboid cuboid = new Cuboid(length, width, height);

                System.out.println("Cuboid " + (++count));
                System.out.println(cuboid);
                System.out.println("Volume : " + cuboid.getVolume());
                System.out.println("luas permukaan " + cuboid.getSurfaceArea());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
