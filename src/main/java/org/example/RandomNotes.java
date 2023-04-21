package org.example;
import java.util.Arrays;
import java.util.HashSet;
public class RandomNotes {

    public static void main(String[] args) {
        String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
        addNotes(notes);
    }

    private static void addNotes(String[] notes) {
        HashSet<String> myNotes = new HashSet<>();
        while (myNotes.size() < 3) {
            int index = (int) Math.round(Math.random() * (notes.length - 1));
            myNotes.add(notes[index]);
        }
        System.out.println(myNotes);
    }
}

