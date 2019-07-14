package com.tasks.advanced.algorithms.huffman;

public class HuffmanNode {

    char c;
    int frequency;

    HuffmanNode left = null;
    HuffmanNode right = null;

    public HuffmanNode(char c, int frequency) {
        this.c = c;
        this.frequency = frequency;
    }
}
