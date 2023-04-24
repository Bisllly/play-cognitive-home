package org.triangle;

public class Triangle {
    static int h;
    static int i;
    int e;

    public Triangle(int h) {
        this.h = h;
        this.i = h - 7;
        this.e = h + i;
    }

    static void getPrintSpace(int r) {
        for (int s = r - 1; s <= r - 1 && s >= 0; s--) {
                System.out.print(" ");
        }
    }
    static void getPrintEle(int h) {
        for (int e = 1; e <= h + i -2; e++) {
            System.out.print("x");
        }
    }

    static void getPrintTriangle() {
        for (int r = h; r >= 1; r--) {
            getPrintSpace(r);
            getPrintEle(h);
            System.out.println();
            i = i + 2;
        }
    }
}
