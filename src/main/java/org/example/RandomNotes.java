package org.example;
import java.util.HashSet;
public class RandomNotes {

    public static void main(String[] args) {
        String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
        addNotes(notes, randomIndex(notes));
    }

    private static int randomIndex(String[] notes) {
        return (int) Math.round(Math.random() * (notes.length - 1));
    }

    private static HashSet<String> createHashSet() {
        return new HashSet<>();
    }

    private static void addNotes(String[] notes, int randomIndex) {
        HashSet<String> myNotes = createHashSet();
        while (myNotes.size() < 3) {
            myNotes.add(notes[randomIndex]);
            randomIndex = randomIndex(notes);
        }
        System.out.println("3 different notes: "+ myNotes);
    }

    private static void addMajChord(String[] notes) {

    }
}