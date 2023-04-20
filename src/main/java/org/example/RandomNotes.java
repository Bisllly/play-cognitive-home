package org.example;

public class RandomNotes {
    public static void main(String[] args) {
        //random a note in notes
        String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
        int index = (int) Math.round(Math.random() * (notes.length - 1));
        System.out.println(notes[index]);
        //random another 2 different note in notes
        int index2 = (int) Math.round(Math.random() * (notes.length - 1));
        if (index2 != index) {
            System.out.println(notes[index2]);
        }

    }

}
