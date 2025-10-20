package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("=======================================================");

        ArrayList<Room>rooms = new ArrayList<>();

        Room r101 = new Room(1);
        Room r102 = new Room(2);
        Room r103 = new Room(2);
        Room r104 = new Room(2);

        rooms.add(r101);
        rooms.add(r102);
        rooms.add(r103);
        rooms.add(r104);

        for(Room r : rooms){
            System.out.println();
            System.out.println(r);
            System.out.println();
        }

        System.out.println("=======================================================");

        ArrayList<Reservation> reservations = new ArrayList<>();

        Reservation res1 = new Reservation("king", 2, false);
        Reservation res2 = new Reservation("double", 1, false);
        Reservation res3 = new Reservation("king", 1, false);
        Reservation res4 = new Reservation("king", 1, true);

        reservations.add(res1);
        reservations.add(res2);
        reservations.add(res3);
        reservations.add(res4);


        for(Reservation r : reservations){
            System.out.println();
            System.out.println(r);
            System.out.println();
        }

        // --------------------
        System.out.println("=======================================================");
        ArrayList<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee(1, "Matt", "IT", 10, 35);
        Employee emp2 = new Employee(2, "John", "Janitor", 1, 39);
        Employee emp3 = new Employee(1, "Dustin", "HR", 15, 42);
        Employee emp4 = new Employee(1, "Shewit", "HR", 15, 31);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        for (Employee e : employees){
            System.out.println();
            System.out.println(e);
            System.out.println();
        }

    }

}