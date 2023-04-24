package org.triangle;
public class ReversedTriangle {
    int h,i,e;

    public ReversedTriangle(int h) {
        this.h = h;
        this.i = h - 1;
        this.e = h + i;
    }

     void getPrintSpace(int r) {
        for (int s = r - 1; s <= r - 1 && s >= 0; s--) {
            if (s == 0) {
                System.out.print("");
                break;
            }
            else {
                System.out.print(" ");
            }
        }
    }
     void getPrintEle(int h) {
        for (int e = h + i; e >= 1 && e <= h + i; e--) {
            System.out.print("x");
        }
    }
    void getPrintReversedTriangle() {
        for (int r = 1; r <= h; r++) {
            getPrintSpace(r);
            getPrintEle(h);
            System.out.println();
            i = i - 2;
        }
    }
}