import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GreihThreeThreads {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>(){
            {
                add("a");
                add("b");
                add("c");
                add("d");
                add("e");
                add("f");
                add("g");
                add("h");
                add("i");
                add("j");
                add("k");
                add("l");
                add("m");
                add("n");
                add("o");
                add("p");
                add("q");
                add("r");
                add("s");
                add("t");
                add("u");
                add("v");
                add("w");
                add("x");
                add("y");
                add("z");
            }
        };

        List<String> characters = new ArrayList<>(){
            {
                add(")");
                add("(");
                add("*");
                add("&");
                add("^");
                add("%");
                add("$");
                add("#");
                add("@");
                add("!");
                add("-");
                add("+");
            }
        };

        List<String> numbers = new ArrayList<>(){
            {
                add("1");
                add("2");
                add("3");
                add("4");
                add("5");
                add("6");
                add("7");
                add("8");
                add("9");
                add("0");
            }
        };

        Runner charPrinter = new Runner();
        charPrinter.characterList = characters;

        Runner letterPrinter = new Runner();
        letterPrinter.characterList = letters;

        Runner numPrinter = new Runner();
        numPrinter.characterList = numbers;

        Thread thread1 = new Thread(charPrinter);
        Thread thread2 = new Thread(letterPrinter);
        Thread thread3 = new Thread(numPrinter);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static class Runner implements Runnable{
        List<?> characterList = new ArrayList<>();

        private Random rand = new Random();
        public void run(){
            for(int i = 0; i < 10000; i++){
                int randomIndex = rand.nextInt(0, characterList.size() - 1);
                System.out.println(characterList.get(randomIndex));
            }

        }
    }
}