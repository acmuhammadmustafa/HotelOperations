package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
        this.price = 120.00;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !(isOccupied || isDirty);
//        if (isOccupied || isDirty){
//            return false;
//    }
//        else{
//            return true;
//        }
    }

    public void checkIn(){
        if (isAvailable()){
            this.isDirty = true;
            this.isOccupied = true;
            System.out.println("Guest Checked in.");
        }
        else {
            System.out.println("Cannot check in.");
        }
    }

    public void checkOut(){
        if (!isAvailable()){
            this.isDirty = true;
            this.isOccupied = false;
            System.out.println("Guest checked out");
        }
        else {
            System.out.println("Guest cannot check out");
        }
    }

    public void cleanRoom(){
        if (isDirty && !isOccupied){
            this.isDirty = false;
        } else if (isOccupied) {
            System.out.println("Cannot be cleaned as room is occupied.");
        } else if (!isDirty) {
            System.out.println("Cannot be cleaned as already clean.");
        } else {
            System.out.println("Something went wrong.");
        }
    }


    @Override
    public String toString() {
        return "Room{" +
                "The numbers of bed in this room is: " + numberOfBeds +
                " | the price is: " + price +
                " | Occupied: " + isOccupied +
                " | Dirty: " + isDirty +
                " | Available: " + isAvailable() +
                '}';
    }
}
