package org.example;
import java.util.LinkedHashSet;
public class RandomNotes {

    public static void main(String[] args) {
        String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
        threeNotes(notes, randomIndex(notes));
        majChord(notes);
    }
    //////////////////////////////////////////////////////////////////////////////////////
    private static int randomIndex(String[] notes) {
        return (int) Math.round(Math.random() * (notes.length - 1));
    }

    private static LinkedHashSet<String> createLinkedHashSet() {
        return new LinkedHashSet<>();
    }

//    private static LinkedHashSet<String> addNote(int randomIndex, String[] notes) {
//        LinkedHashSet<String> LinkedHashSet = createLinkedHashSet();
//        LinkedHashSet.add(notes[randomIndex]);
//        return LinkedHashSet;
//    }

    private static void threeNotes(String[] notes, int randomIndex) {
        LinkedHashSet<String> myNotes = createLinkedHashSet();
        while (myNotes.size() < 3) {
            myNotes.add(notes[randomIndex]);
            randomIndex = randomIndex(notes);
        }
        System.out.println("3 different notes: "+ myNotes);
    }

    private static void majChord(String[] notes) {
        LinkedHashSet<String> myChord = createLinkedHashSet();
        int index = randomIndex(notes);
        for(int i = 1; i <= 3; i++) {
            myChord.add(notes[index]);
            index = index + 2;
        }
        System.out.println(myChord.toArray()[0] + " major chord: " + myChord);
    }
}