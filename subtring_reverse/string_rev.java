package com.company;
import java.util.*;

public class Main {
    public static String reverseWord(String word) {
        if (word.length() == 0 || word.length() == 1) {
            return word;
        } else {
            return reverseWord(word.substring(1)) + word.charAt(0);
        }
    }

    public static String reverseParagraph(String paragraph) {
        String[] words = paragraph.split("\\s+");
        StringBuilder reversedParagraph = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedParagraph.append(reverseWord(words[i])).append(" ");
        }
        return reversedParagraph.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a paragraph: ");
        String inputParagraph = scanner.nextLine();
        String reversedParagraph = reverseParagraph(inputParagraph);
        System.out.println("Reversed paragraph:");
        System.out.println(reversedParagraph);
    }
}
