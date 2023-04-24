package org.inheritance.personstudentstaff;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void getInfo() {
        System.out.println("Info person");
    }
}
