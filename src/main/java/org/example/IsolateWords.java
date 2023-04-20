package org.example;

import java.util.Arrays;

public class IsolateWords {
    //given a string containing words separated by "space", return an array with isolated words
    public static void main(String[] args) {
        String sentence = "this is a coding challenge and I will finish it.";
        String[] wordArr = sentence.split(" ");
        for (int i = 0; i < wordArr.length; i++) {
            System.out.println(wordArr[i]);
        }
    }
}
