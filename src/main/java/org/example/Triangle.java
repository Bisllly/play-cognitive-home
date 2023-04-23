package org.example;
public class Triangle {
    public static void main(String[] args) {
        for (int r = 1; r <= 4; r++) {
            getPrintSpace(r);
            getPrintEle(r);
            System.out.println();
        }
    }
    private static void getPrintSpace(int r) {
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
    private static void getPrintEle(int r) {
        for (int e = r + 6; e <= 1; e--) {
            System.out.print("x");
        }
    }
}
