import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_soal2 {
    public static void main(String[] args) {
        String inputFilePath = "UAS_PL/src/new_data.txt";
        String outputFilePath = "hasil .txt";

        List<Cuboid_soal2> cuboids = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dimensions = line.split("\t");
                double length = Double.parseDouble(dimensions[0]);
                double width = Double.parseDouble(dimensions[1]);
                double height = Double.parseDouble(dimensions[2]);

                Cuboid_soal2 cuboid = new Cuboid_soal2(length, width, height);
                cuboids.add(cuboid);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(cuboids);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (Cuboid_soal2 cuboid : cuboids) {
                bw.write(String.format("luas permukaan : %.2f", cuboid.getSurfaceArea()));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
