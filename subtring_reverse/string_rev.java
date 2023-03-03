/*Multithreading in java*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ReverseParagraph {

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseParagraph(String paragraph) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        List<String> reversedStrings = new ArrayList<>();

        String[] strings = paragraph.split(" ");

       
        for (String s : strings) {
            Thread t = new Thread(() -> reversedStrings.add(reverseString(s)));
            threads.add(t);
            t.start();
        }

       
        for (Thread t : threads) {
            t.join();
        }


        return String.join(" ", reversedStrings);
    }

   
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph");
        String a =sc.nextLine();
       
        String reversedParagraph = reverseParagraph(a);
        System.out.println(reversedParagraph);
    }
}

/* recursion in java*/
import java.util.Scanner;
public class ReverseWordsInParagraph {
   
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);
        System.out.println("enter a paragraph:");
       
        String paragraph = myobj.nextLine();
        String reversedParagraph = reverseWords(paragraph);
        System.out.println(reversedParagraph);
    }

    public static String reverseWords(String sentence) {
        if (sentence.isEmpty()) {
            return sentence;
        }
        else {
           
            int spaceIndex = sentence.indexOf(' ');
           
            if (spaceIndex == -1) {
               
                return reverseString(sentence);
            }
            else {
               
                return reverseString(sentence.substring(0, spaceIndex)) + " "
                     + reverseWords(sentence.substring(spaceIndex + 1));
            }
        }
    }
   
    public static String reverseString(String s) {
        if (s.length() == 1) {
            return s;
        }
        else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }
}
