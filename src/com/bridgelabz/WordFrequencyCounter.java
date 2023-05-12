package com.bridgelabz;

import java.util.LinkedList;

public class WordFrequencyCounter {
    private LinkedList<MyMapNode>[] hashArray; // the hash table array
    private int size; // number of elements in the hash table

    // constructor to initialize the hash table array
    public WordFrequencyCounter(int size) {
        this.size = size;
        hashArray = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            hashArray[i] = new LinkedList<>();
        }
    }

    // a helper method to hash a string and return the index of the linked list
    private int getIndex(String key) {
        int hashCode = key.hashCode();
        int index = hashCode % size;
        return index < 0 ? -index : index;
    }

    // a method to add a key-value pair to the hash table
    public void add(String key, int value) {
        int index = getIndex(key);
        LinkedList<MyMapNode> list = hashArray[index];
        for (MyMapNode node : list) {
            if (node.key.equals(key)) {
                node.value += value; // if the key already exists, update the value
                return;
            }
        }
        list.add(new MyMapNode(key, value)); // if the key doesn't exist, add a new node
    }

    // a method to find the frequency of a word in the hash table
    public int getFrequency(String key) {
        int index = getIndex(key);
        LinkedList<MyMapNode> list = hashArray[index];
        for (MyMapNode node : list) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return 0; // if the key doesn't exist, return 0
    }
}
