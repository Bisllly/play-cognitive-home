package org.triangle;
import java.util.Scanner;
import static org.triangle.Triangle.*;

public class Main {
    public static void main(String[] args) {
        Scanner myHeight = new Scanner(System.in);
        System.out.println("Enter height: ");
        int h = myHeight.nextInt();

        getPrintTriangle(h,3);
    }
}