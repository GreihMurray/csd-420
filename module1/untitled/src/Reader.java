//Greih Murray 6/1/2024
// Read data from file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("datafile.dat");
        Scanner reader = new Scanner(inputFile);

        while(reader.hasNextLine()){
            String data = reader.nextLine();
            System.out.println(data);
        }

        reader.close();
    }
}
