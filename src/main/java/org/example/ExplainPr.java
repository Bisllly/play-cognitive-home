package org.example;

public class ExplainPr {

    public static void main(String[] args) {

        Tour tour1 = new Tour(100, 1);
        //tour1.setPrice(102);
        Tour tour2 = new Tour(200, 3);
        Tour tour3 = new Tour(300, 4);

        System.out.println("tour1: " + tour1.getTotal());
        System.out.println("Price 1: " + tour1.getPrice());
        System.out.println("tour2: "+tour2.getTotal());
        System.out.println("tour3: "+tour3.getTotal());

    }
}

class Tour {
    double price;
    int guide;

    public Tour(double price, int guide) {
        this.price = price;
        this.guide = guide;
    }


    public double getTotal() {
        return price*guide;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double _price) {
        price = _price;
    }
}
