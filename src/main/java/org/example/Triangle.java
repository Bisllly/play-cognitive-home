package org.example;

public class Triangle {
    public static void main(String[] args) {
        //prints out a triangle with 9 rows
        //row
        int maxRows = 4;
        for (int row = 1; row <= maxRows; row++) {
            int add = row - 1;
            int maxSlots = maxRows + add;
            for (int slots = 1; slots <= maxSlots; slots+=2) {
                for (int i = 1; i <= slots; i+=1) {
                    System.out.print("x");
                }
                System.out.println();
            }

        }
    }
}
