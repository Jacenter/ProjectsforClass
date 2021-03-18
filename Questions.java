package lab;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questions {

    public static void main(String[] args) {
        String[] names = {"SuperNova", "CodeHunter", "Duchess of Code", "8Milli", "SilentAssassin"};
        String[] array1 = {"1", "2", "3"};
        int[] ints = {1, 2, 3, 4};
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(getLastIndex(names));
        System.out.println(getSecondtoLastIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println(getLastElement(names));
        System.out.println(getSecondtoLastElement(names));
        System.out.println(getSum(ints));
        System.out.println(getAverage(ints));
        System.out.println(extractallOddNumbers(ints));
        System.out.println(extractAllEvenNumbers(ints));
        System.out.println(contains(names, "Crackhead Billy"));
        System.out.println(getIndexByElement(names, "8Milli"));
        printOddNumbersInRange(0, 100);
        printGivenStringTimesNumberGiven("boi", 3);
        repeatFirstThreeLetters("CrackHead Billy", 3);
        System.out.println(wordsInAStringCounter("My dog jumped over the fence"));
        System.out.println(VowelsCounter("Count the vowels in my string"));
        System.out.println(Arrays.toString(swap(names)));
        System.out.println(replaceCharacters("The farmer went to the store to get 1 dollar's worth of fertilizer"));
        System.out.println(replaceWuTangTwoThreeDivisible("the small brown dog hopped the fence"));
        System.out.println(createStringOfFibonacchiUpToMax(200));
    }

    //question 1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //question 2
    public static int getSecondtoLastIndex(String[] names) {
        return names.length - 2;
    }

    //question 3
    public static String getFirstElement(String[] names) {
        String firstElement = names[0];
        return firstElement;
    }

    //question 4
    public static String getLastElement(String[] names) {
        String lastElement = names[names.length - 1];
        return lastElement;
    }

    //question 5
    public static String getSecondtoLastElement(String[] names) {
        String secondtoLastElement = names[names.length - 2];
        return secondtoLastElement;
    }

    //question 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int num : ints) {
            sum = sum + num;
        }
        return sum;
    }

    //question 7
    public static int getAverage(int[] ints) {
        double average = 0;
        for (int i = 0; i < ints.length; i++) {
            average = average + ints[i];
        }
        int result = (int) (average / ints.length);
        return result;
    }

    //question 8
    public static String extractallOddNumbers(int[] ints) {
        List<Integer> oddNums = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                oddNums.add(ints[i]);
            }
        }
        return oddNums.toString();
    }

    //question 9
    public static String extractAllEvenNumbers(int[] ints) {
        List<Integer> evenNums = new ArrayList<>();
        for (int e = 0; e < ints.length; e++) {
            if (ints[e] % 2 == 0) {
                evenNums.add(ints[e]);
            }
        }
        return evenNums.toString();
    }


    // question 10
    public static boolean contains(String[] names, String element) {
        boolean contains = true;
        for (int n = 0; n < names.length; n++) {
            if (names[n].equals(element)) {
                contains = true;
            } else {
                contains = false;
            }
        }
        return contains;
    }


    //Question 11
    public static int getIndexByElement(String[] names, String element) {
        int i;
        for (i = 0; i < names.length; i++) {
            if (element.equals(names[i]))
                return i;
        }
        return i;
    }

    //question 12
    public static void printOddNumbersInRange(int start, int end) {
        for (int q = start; q < end; q++) {
            if (q % 2 != 0) {
                System.out.println(q);
            }
        }
    }

    //question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        System.out.println(str.repeat(n));
        return str;
    }

    //question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String substr;
        substr = str.substring(0, 3);
        System.out.println(substr.repeat(n));
        return substr;
    }

    //question 15
    public static int wordsInAStringCounter(String str) {
        int count = 0;
        if (!("".equals(str.substring(0, 1))) || !("".equals(str.substring(str.length() - 1)))) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count + 1;
        }
        return count;
    }

    //question 16
    public static int VowelsCounter(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    //question 17
    public static String[] swap(String[] stringArray) {
        String ele = stringArray[0];
        stringArray[0] = stringArray[stringArray.length - 1];
        stringArray[stringArray.length - 1] = ele;
        return stringArray;
    }


    //question 18
    public static String replaceCharacters(String str) {
        String replaceString = str.replace('f', '7').replace('s', '$').replace('1', '!').replace('a', '@');
        return replaceString;
    }

    //question 19
    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
        stringInput = stringInput;
        String[] arr = stringInput.split(" ");
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i - 1] = "wu";
            } else if (i % 3 == 0) {
                arr[i - 1] = "Tang";
            }

        }
        return String.join(" ", arr);
    }


    //question 20
    public static String createStringOfFibonacchiUpToMax(int maxnumber) {
        int n = maxnumber, i = 0, x = 1;
        String fibbo = "";
        while (i <= n) {

            int sum = i + x;
            i = x;
            x = sum;
            fibbo = fibbo + i + " ";
        }
        return fibbo;
    }
}











