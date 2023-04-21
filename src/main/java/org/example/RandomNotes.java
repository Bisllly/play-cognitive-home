package org.example;
import java.util.Arrays;
import java.util.HashSet;
public class RandomNotes {

    public static void main(String[] args) {
        //random a note in notes
        int[] notes = new int[10];
        for(int i=0; i< notes.length;i++){
            notes[i] = i;
//            System.out.println(notes[i]);
        }
        System.out.println(Arrays.toString(notes));
        addNotes(notes);
    }

    private static void addNotes(int[] notes) {
        HashSet<Integer> myNotes = new HashSet<>();
        while (myNotes.size() < 3) {
            int index = (int) Math.round(Math.random() * (notes.length - 1));
            myNotes.add(notes[index]);
        }
        System.out.println(myNotes);
    }
}

