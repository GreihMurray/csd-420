//Greih Murray, 6/16/2023, Assignment 5
//Work with sets

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try{
            File input = new File("collection_of_words.txt");
            Scanner scan = new Scanner(input);

            Set<String> words = new HashSet<>();

            while(scan.hasNextLine()){
                //Add lowercase words to avoid sorting issues
                words.add(scan.nextLine().toLowerCase());
            }

            //Sort list from z to a
            List<String> sortedWords = words.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());

            printer("ASCENDING ORDER:", sortedWords);

            //sort from a to z
            sortedWords = words.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());

            printer("DESCENDING ORDER:", sortedWords);

        } catch (Exception e){
            System.out.println("Encountered an error");
        }
    }

    public static void printer(String title, List<String> words){
        System.out.println("\n\n" + title);

        for(String word : words){
            System.out.println(word);
        }
    }
}