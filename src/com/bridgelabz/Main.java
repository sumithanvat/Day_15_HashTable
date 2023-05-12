package com.bridgelabz;

public class Main {
    // the main method to test the class
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        WordFrequencyCounter counter = new WordFrequencyCounter(1000); // choose a size for the hash table array
        counter.countWords(paragraph);
        System.out.println("Frequency of paranoid : " + counter.getFrequency("paranoid"));
        System.out.println("Frequency of are: " + counter.getFrequency("Are"));
        System.out.println("frequency of situations: " + counter.getFrequency("situations"));
    }
}