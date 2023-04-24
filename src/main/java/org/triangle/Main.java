package org.triangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dirInput = new Scanner(System.in);
        System.out.print("Select your direction: ");
        String direction = dirInput.nextLine();

        switch (direction){
            case "reversed" -> {
                int h = inputHeight();
                ReversedTriangle reversedTriangle = new ReversedTriangle(h);
                reversedTriangle.getPrintReversedTriangle();
            }
            case "normal" -> {
                int h = inputHeight();
                Triangle triangle = new Triangle(h);
                Triangle.getPrintTriangle();
            }
            default -> System.out.println("your input is not correct. Pls enter (UP/DOWN/...)");
        }
    }

    private static int inputHeight() {
        Scanner height = new Scanner(System.in);
        System.out.print("Enter height: ");
        int h = height.nextInt();
        return h;
    }
}