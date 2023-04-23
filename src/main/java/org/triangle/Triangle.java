package org.triangle;
public class Triangle {

    static void getPrintSpace(int r, int h) {
        for (int s = r - 1; s <= 3 && s >= 0; s--) {
            if (s == 0) {
                System.out.print("");
                break;
            }
            else {
                System.out.print("-");
            }
        }
    }
    static void getPrintEle(int r, int h, int i) {
        for (int e = h + i; e >= 1 && e <= 7; e--) {
//            System.out.print(e);
            System.out.print("x");
        }
    }
}
