package org.triangle;

import static org.triangle.Triangle.getPrintEle;
import static org.triangle.Triangle.getPrintSpace;
public class Main {
    public static void main(String[] args) {
        int h = 4; //max row, or height of the triangle
        int i = 3; //steps for printEle, because e = h + 3. After each iteration, i is decremented by 2
        for (int r = 1; r <= h; r++) {
            getPrintSpace(r, h);
            getPrintEle(r, h, i);
            System.out.println();
            i = i - 2;
        }
    }
}