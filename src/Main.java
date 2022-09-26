

import java.util.*;


public class Main {

    public static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static final List<String> words = new ArrayList<>(List.of("hello", "word","hello","child"));


    public static void main(String[] args) {
        System.out.println("Задача 1");
        printOddNumbers();
        System.out.println();
        System.out.println("Задача 2");
        printEvenNumbersInAscendingOrder();
        System.out.println();
        System.out.println("Задача 3");
        printUniqueWords();
        System.out.println("Задача 4");
        printNumberOfDuplicates ();

    }


    public static void printOddNumbers() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num);
            }
        }

    }
    public static void printEvenNumbersInAscendingOrder(){
        Collections.sort(nums);

        int valueNum = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num % 2 == 0 && num!=valueNum) {
                System.out.print(num);
                valueNum=num;
            }
        }


    }
    public static void printUniqueWords(){
    Set<String> wordsSet = new HashSet<>(words);
        System.out.println(wordsSet);
    }
    public static void printNumberOfDuplicates (){
        Set<String> wordsSet = new HashSet<>(words);
        System.out.println(words.size()-wordsSet.size());
    }

}




//        System.out.println();
//        Set<Integer> numsSet = new HashSet<>();
//        for (int i = 0; i < nums.size(); i++)
//            if ((nums.get(i)) % 2 == 0) {
//                numsSet.add(i);
//            }
//
//
//        System.out.println(numsSet);
//    }




