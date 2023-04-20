package org.example;

public class TakeNumber {
    //how many char in string is number
    public static void main(String[] args) {
        inputStr("12adsdsfas23f543g63k");
    }
    public static void inputStr(String str) {
        int sum = 0;
        for (int i = 0; i < str.length();i++) {
            char c = str.charAt(i);

            try {
                int nonNumber = Integer.parseInt(String.valueOf(c));
                sum+= 1;
            } catch (NumberFormatException e) {
            }

        }
        System.out.println(sum);
    }
}
