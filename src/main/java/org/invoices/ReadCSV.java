package org.invoices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    public static void main(String[] args) {
        String csvFile = "filename.csv";
        String line = "";
        String csvSplitBy = ",";

        List<String> prices = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                // process data here
                Commidity commidity1 =   new Commidity(data[0], data[1], data[2]);
                System.out.println(commidity1.getPrice());
                prices.add(commidity1.getPrice());

            }
            System.out.println(prices);

            int total = 0;

            for (int i = 1; i <prices.size(); i++) {
                total = total + Integer.valueOf(prices.get(i));

            }

            System.out.println(total);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Commidity{
    String name;
    String quantity;
    String price;


    public Commidity(String name, String quantity, String price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }
}
