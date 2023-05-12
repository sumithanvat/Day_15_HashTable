package com.bridgelabz;

public class Main {
    // the main method to test the class
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        String[] words = sentence.split(" ");
        WordFrequencyCounter counter = new WordFrequencyCounter(words.length);
        for (String word : words) {
            counter.add(word, 1);
        }
        System.out.println("Frequency of To is " + counter.getFrequency("To"));
        System.out.println("Frequency of be is: " + counter.getFrequency("be"));
        System.out.println("Frequency of or is: " + counter.getFrequency("or"));
        System.out.println("Frequency of not is: " + counter.getFrequency("not"));
    }
}
