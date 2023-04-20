package org.example;

public class Triangle {
    public static int maxH = 4;
    public static String starStr = "*";
    public static String spaceStr = "-";
    public static String repeatedStarStr = "";
    public static String repeatedSpaceStr = "-------------";

    public static void main(String[] args) {
        //prints out a triangle with 9 rows
        //row
//        int h = 4;

        for (int h = maxH; h >= 1; h--) {
            printSpace(maxH);
            printStar(maxH);
//            System.out.println();

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


    private static void printSpace(int maxH) {
        //add another loop to control maxH, because it would change
//        for (int h = maxH; h >= 1; h--) {
            for (int space = maxH - 1; space >= 0; space-=4) {
                repeatedSpaceStr = repeatedSpaceStr.substring(0, repeatedSpaceStr.length() - 2);
            }
            System.out.print(repeatedSpaceStr);

//        }
    }

    private static void printStar(int maxH) {
        //start = 2h-1
//        for (int h = maxH; h >=1; h--) {
            for (int star=1;star<=2*maxH-1;star+=2){
                repeatedStarStr+= starStr;
            }
            System.out.println(repeatedStarStr);
    }
}
