package org.tour_invoice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ReadCSV {
    public static void main(String[] args) throws IOException {
        String csvFile = "data.csv";
        InputStream inputStream = ReadCSV.class.getResourceAsStream("/" + csvFile);
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        String line = "";
        String csvSplitBy = ",";

        try {
            br.readLine();

            List<String> rows = br.lines().limit(3).collect(Collectors.toList());

            List<String> columnOne = rows.stream()
                    .map(row -> row.split(csvSplitBy)[0])
                    .collect(Collectors.toList());
            List<String> columnTwo = rows.stream()
                    .map(row -> row.split(csvSplitBy)[1])
                    .collect(Collectors.toList());
            List<String> columnThree = rows.stream()
                    .map(row -> row.split(csvSplitBy)[2])
                    .collect(Collectors.toList());

            String name1 = columnOne.get(0);
            int numOfPax1 = Integer.parseInt(columnTwo.get(0).trim());
            int totalPrice1 = Integer.valueOf(columnThree.get(0).trim());

            String name2 = columnOne.get(1);
            int numOfPax2 = Integer.parseInt(columnTwo.get(1).trim());
            int totalPrice2 = Integer.valueOf(columnThree.get(1).trim());

            String name3 = columnOne.get(2);
            int numOfPax3 = Integer.parseInt(columnTwo.get(2).trim());
            int totalPrice3 = Integer.valueOf(columnThree.get(2).trim());

            Tour tour1 = new Tour(name1, numOfPax1, totalPrice1);
            Tour tour2 = new Tour(name2, numOfPax2, totalPrice2);
            Tour tour3 = new Tour(name3, numOfPax3, totalPrice3);

            int sum = tour1.getTotalPrice() + tour2.getTotalPrice() + tour3.getTotalPrice();
            System.out.println(sum);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Tour {
    String name;
    int numOfPax;
    int totalPrice;

    public Tour(String name, int numOfPax, int totalPrice) {
        this.name = name;
        this.numOfPax = numOfPax;
        this.totalPrice = totalPrice;
    }
    public String getName() {
        return name;
    }
    public int getNumOfPax() {
        return numOfPax;
    }
    public int getTotalPrice() {
        return totalPrice;
    }
}
