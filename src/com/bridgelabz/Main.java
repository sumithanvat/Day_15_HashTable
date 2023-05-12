package com.bridgelabz;

public class Main {
    // the main method to test the class
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        // choose a size for the hash table array
        WordFrequencyCounter counter = new WordFrequencyCounter(1000);
        counter.countWords(paragraph);
        System.out.println("Frequency of 'paranoid': " + counter.getFrequency("paranoid"));
        System.out.println("Frequency of 'are': " + counter.getFrequency("are"));
        System.out.println("Frequency of 'situations': " + counter.getFrequency("situations"));
        System.out.println("Frequency of 'avoidable': " + counter.getFrequency("avoidable")); // should print 0
    }
}