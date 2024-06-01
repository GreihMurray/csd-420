//Greih Murray 6/1/2024
// Write random arrays to file

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Writer {
    public static void main(String[] args) throws IOException {
        int[] ints = new int[5];
        double[] doubles = new double[5];
        Date date = new Date();

        Random rand = new Random();

        for(int i = 0; i < 5; i++){
            ints[i] = rand.nextInt();
            doubles[i] = rand.nextDouble();
        }

        FileWriter fileWriter = new FileWriter("datafile.dat");
        BufferedWriter writer = new BufferedWriter(fileWriter);

        writer.write(Arrays.toString(ints) + "\n");
        writer.write(Arrays.toString(doubles)  + "\n");
        writer.write(date.toString());

        writer.close();
    }
}