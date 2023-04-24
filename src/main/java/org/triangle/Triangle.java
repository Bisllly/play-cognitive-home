package org.triangle;
public class Triangle {
    int h,i,e;

    public Triangle(int h, int i, int e) {
        this.h = h;
        this.i = i;
        this.e = e;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = e - h;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = h + i;
    }

    static void getPrintSpace(int r, int h) {
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
    static void getPrintEle(int r, int h, int i) {
        for (int e = h + i; e >= 1 && e <= h + i; e--) {
            System.out.print("x");
        }
    }
    static void getPrintTriangle(int h, int i) {
        for (int r = 1; r <= h; r++) {
            getPrintSpace(r, h);
            getPrintEle(r, h, i);
            System.out.println();
            i = i - 2;
        }
    }
}