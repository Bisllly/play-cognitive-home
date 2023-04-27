package org.tour;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSV {
    public static void main(String[] args) throws Exception {
        CSVReader csvReader = new CSVReader(new FileReader("./datetimetour.csv"));

        List<Tour> tours = new ArrayList<>();
        String[] nextLine;
        nextLine = csvReader.readNext();
        while ((nextLine = csvReader.readNext()) != null) {
            Tour tour = new Tour(nextLine[0], nextLine[1], nextLine[2], nextLine[3], Integer.parseInt(nextLine[4]),
                    Integer.parseInt(nextLine[5]), Double.parseDouble(nextLine[6]),
                    Double.parseDouble(nextLine[7]), Double.parseDouble(nextLine[8]));
            tours.add(tour);
        }
        csvReader.close();

        Tour tour = new Tour(null, null, null, null, 0, 0,0 ,0 ,0);
        tour.dailyInterest(tours);
    }
}

//class DateAndTime {
//    String date;
//    String startTime;
//
//    public DateAndTime(String date, String startTime) {
//        this.date = date;
//        this.startTime = startTime;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public String getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(String startTime) {
//        this.startTime = startTime;
//    }

class Tour {
    String date;
    String startTime;
    String tourName;
    String itenerary;
    int numOfGuest;
    int numOfGuide;
    double price;
    double wage;
    double expense;

    public Tour(String date, String startTime, String tourName, String itenerary, int numOfGuest, int numOfGuide, double price,
                double wage, double expense) {
        this.date = date;
        this.startTime = startTime;
        this.tourName = tourName;
        this.itenerary = itenerary;
        this.numOfGuest = numOfGuest;
        this.numOfGuide = numOfGuide;
        this.price = price;
        this.wage = wage;
        this.expense = expense;
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

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getItenerary() {
        return itenerary;
    }

    public void setItenerary(String itenerary) {
        this.itenerary = itenerary;
    }

    public int getNumOfGuest() {
        return numOfGuest;
    }

    public void setNumOfGuest(int numOfGuest) {
        this.numOfGuest = numOfGuest;
    }

    public int getNumOfGuide() {
        return numOfGuide;
    }

    public void setNumOfGuide(int numOfGuide) {
        this.numOfGuide = numOfGuide;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "date='" + date + '\'' +
                ", startTime='" + startTime + '\'' +
                ", tourName='" + tourName + '\'' +
                ", itenerary='" + itenerary + '\'' +
                ", numOfGuest=" + numOfGuest +
                ", numOfGuide=" + numOfGuide +
                ", price=" + price +
                ", wage=" + wage +
                ", expense=" + expense +
                '}';
    }

    public void dailyInterest(List<Tour> tours) {
        double totalAmount = 0;
        double totalWage = 0;
        double totalExpense = 0;
        int guests;
        int guides;
        double price;
        double wage;
        double expense;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date");
        date = scanner.nextLine();

        boolean b = true;

        while(b) {
            for (Tour tour : tours) {
                if (tour.getDate().equals(date)) {
                    guests = tour.getNumOfGuest();
                    guides = tour.getNumOfGuide();
                    price = tour.getPrice();
                    wage = tour.getWage();
                    expense = tour.getExpense();
                    totalAmount += guests * price;
                    totalWage += guides * wage;
                    totalExpense += expense;
                }
            }

            if (totalAmount > 0) {
                System.out.println("revenue of " + date + " is " + totalAmount);
                System.out.println("total wage paid in " + date + " is " + totalWage);
                System.out.println("total expense paid in " + date + " is " + totalExpense);
                System.out.print("money we earned in " + date + " is " + (totalAmount - (totalWage + totalExpense)));
                break;
            } else {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Date is not present in list, enter another date or type `fxxkit` to get out of here: ");
                date = scanner1.nextLine();

                if (date.equals("fxxkit")) {
                    System.out.println("program ended!");
                    break;
                }
            }
        }
    }
}
