//Greih Murray, Module 3, 6/6/2024
//Use generics to remove duplicates

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> fullInts = new ArrayList<>();

        for(int i = 0; i < 50; i++){
            fullInts.add(rand.nextInt(1, 20));
        }

        var newList = removeDuplicates(fullInts);

        System.out.println("Original: " + fullInts.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList()));
        System.out.println("New List: " + newList.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList()));
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> newList = new ArrayList<E>();

        for(E item : list){
            if(!newList.contains(item)){
                newList.add(item);
            }
        }

        return newList;
    }
}