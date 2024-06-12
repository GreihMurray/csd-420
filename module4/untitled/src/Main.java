//Greih Murray, 6/12/2024, Assignment 4
//Compare performance of access methods for linkedlists

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //WARMUP RUNS
        runTests(50000, false);
        runTests(50000, false);
        runTests(50000, false);
        runTests(500000, false);
        runTests(500000, false);
        runTests(500000, false);
        runTests(500000, false);

        System.out.println("50,000 values");
        runTests(50000, true);

        System.out.println("\n500,000 values");

        runTests(500000, true);
    }

    public static void runTests(int max, boolean printResults){
        LinkedList<Integer> ints = new LinkedList<>();

        for(int i = 1; i <= max; i++){
            ints.add(i);
        }

        Long startTime = System.nanoTime();
        ints.get(max-1);
        Long endTime = System.nanoTime();

        Double duration = Double.valueOf(endTime - startTime);

        String output = String.format("Time taken via get(): %,.0f ns (%.5f s)", duration, (duration/1000000000d));

        if(printResults){
            System.out.println(output);
        }


        startTime = System.nanoTime();
        ints.forEach((k) -> {});
        endTime = System.nanoTime();

        duration = Double.valueOf(endTime - startTime);

        output = String.format("Time taken via forEach(): %,.0f ns (%.5f s)", duration, (duration/1000000000d));

        if(printResults){
            System.out.println(output);
        }

        Iterator it = ints.iterator();
        startTime = System.nanoTime();
        while(it.hasNext()){
            it.next();
        }
        endTime = System.nanoTime();

        duration = Double.valueOf(endTime - startTime);

        output = String.format("Time taken via while(): %,.0f ns (%.5f s)", duration, (duration/1000000000d));

        if(printResults){
            System.out.println(output);
        }
    }
}

/*
*
* Overall using get() was significantly faster than using a foreach loop which was faster than using an iterator
* get tended to average under 10,000 nanoseconds for both 50,000 and 500,000 values (50,000 was closer to under 5,000 ns)
* forEach was around 200,000ns for 50,000 and over 2 million ns for 500,000
* iterator was about double the foreach method
*
*
* the get index is the fastest as it only passes each element in the list once on its way to the end whereas
* the other methods will have to go over each previous value on every iteration, so by the time the final value is reached
* the first value will have been traversed 50,000 times (for the 50,000 value list of course). Having to always
* go through every item in the list will of course slow down execution, and the difference in performance will only become
* more substantial as the size of the list increases
*
* */