// Greih Murray, 6/6/24, Module 2
//Use recursive methods

public class Main {
    public static void main(String[] args) {
        System.out.println("Recursive sum with i=4: " + recurse(4d));
        System.out.println("Recursive sum with i=9: " + recurse(9d));
        System.out.println("Recursive sum with i=14: " + recurse(14d));
    }

    public static double recurse(double i){
        if(i >= 1){
            double temp = (i/(i+1d)) + (Double)recurse(i-1d);
            return temp;
        } else{
            return (1d/2d);
        }
    }
}