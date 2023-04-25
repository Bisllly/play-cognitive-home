package org.tour;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadCSV {
    public static void main(String[] args) throws IOException {

        String csvFile = "datetimetour.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();

            //use for looop to shorten code
//            for (int i = 1; i <= 7; i++) {

            String column1 = "";
            String column2 = "";
            String column3 = "";
            String column4 = "";
            String column5 = "";
            String column6 = "";
            String column7 = "";

            while ((line = br.readLine()) != null) {
                try {
                    String[] data = line.split(csvSplitBy);
                    column1 += data[0] + " ";
                    column2 += data[1] + " ";
                    column3 += data[2] + " ";
                    column4 += data[3] + " ";
                    column5 += data[4] + " ";
                    column6 += data[5] + " ";
                    column7 += data[6] + " ";
                }
                catch (ArrayIndexOutOfBoundsException e) {}
            }

            ////////////////

            ArrayList<String> dateArr = new ArrayList<>(List.of(column1.split(" ")));
            ArrayList<String> startTimeArr = new ArrayList<>(List.of(column2.split(" ")));
            ArrayList<String> tourNameArr = new ArrayList<>(List.of(column3.split(" ")));
            ArrayList<String> iteneraryArr = new ArrayList<>(List.of(column4.split(" ")));
            ArrayList<String> numOfGuestArr = new ArrayList<>(List.of(column5.split(" ")));
            ArrayList<String> numOfGuideArr = new ArrayList<>(List.of(column6.split(" ")));
            ArrayList<String> priceArr = new ArrayList<>(List.of(column7.split(" ")));

            System.out.println(dateArr);
            System.out.println(startTimeArr);
            System.out.println(tourNameArr);
            System.out.println(iteneraryArr);
            System.out.println(numOfGuestArr);
            System.out.println(numOfGuideArr);
            System.out.println(priceArr);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class DateAndTime {
    String date;
    String startTime;

    public DateAndTime(String date, String startTime) {
        this.date = date;
        this.startTime = startTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

class Tour extends DateAndTime {
    String tourName;
    String itenerary;
    int numOfGuest;
    int numOfGuide;
    double price;

    public Tour(String date, String startTime, String tourName, String itenerary, int numOfGuest, int numOfGuide, double price) {
        super(date, startTime);
        this.tourName = tourName;
        this.itenerary = itenerary;
        this.numOfGuest = numOfGuest;
        this.numOfGuide = numOfGuide;
        this.price = price;
    }
    }
}
