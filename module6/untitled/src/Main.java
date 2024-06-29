import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = {5, 4, 6, 7, 8, 2, 5, 0, 5, 12, 4, 63, 23, 7};
        String[] strings = {"Abc", "bdc", "pop", "lof", "slfsf", "AAA", "aaaa"};

        bubbleSort(ints);
        printer(ints);

        bubbleSort(strings, (a, b) -> a.compareToIgnoreCase(b));
        printer(strings);
    }

    public static <T> void printer(T[] list){
        System.out.println("\n");
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
        System.out.println("\n");
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] list){
        bubbleSort(list, (a, b) -> ((Comparable<T>)a).compareTo(b));
    }

    public static <T> void bubbleSort(T[] list, Comparator<? super T> comparator) {
        for(int i = 1; i < list.length; i++){
            for(int k = 0; k < list.length - i; k++){
                var temp1 = list[k];
                var temp2 = list[k+1];

                if(comparator.compare(temp1, temp2) <= 0){
                    continue;
                } else{
                    list[k] = temp2;
                    list[k+1] = temp1;
                }
            }
        }
    }
}