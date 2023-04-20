package org.example;

public class Triangle {
    public static int maxH = 4;
    public static String starStr = "*";
    public static String spaceStr = "-";
    public static String repeatedStarStr = "";
    public static String repeatedSpaceStr = "*";

    public static void main(String[] args) {
        //prints out a triangle with 9 rows
        //row
        int h=3;

        for (int row = 1; row<=h; row++) {
            printSpace(h,row);
            printStar(row);
            System.out.println();



//            for (int space=h-1; space>h;space--){
//                System.out.print("-");}
//
//            for (int start=row;start<=(h*2)+1;start++){
//
//                System.out.print("*");
//            }
//            System.out.println();

           // printSpace(row-1); // space = (h-1)/2
           // printStart(2*row-1, h);

//            int add = row - 1;
//            int maxSlots = 4 + add;
//            for (int slots = 1; slots <= maxSlots; slots+=2) {
//                for (int i = 1; i <= slots; i+=1) {
//                    System.out.print("x");
//                }
//                System.out.println();
//            }

        }
    }


    private static void printSpace(int maxH, int row) {
            for (int space = 0; space < maxH-row; space++) {
                System.out.print(" ");
            }
//        }
    }

    private static void printStar(int maxH) {
        for (int star=0;star<2*maxH-1;star++){
            System.out.print("*");
        }
    }
}
