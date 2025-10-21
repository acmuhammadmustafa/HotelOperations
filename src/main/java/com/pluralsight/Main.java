package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("=======================================================================================");
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
            System.out.println(r);
            System.out.println();
        }


    // ---- Checked in:
        System.out.println("=======================================================");
        r101.checkIn();
        System.out.println();
        r102.checkIn();
        System.out.println("=======================================================");


//  Print rooms checked in:
        for(Room r : rooms) {
            System.out.println("Rooms checked in: ");
            System.out.println();
            System.out.println(r);
            System.out.println("=======================================================================================");
        }

    // ---- Checked out:
        r101.checkOut();
        System.out.println();
        r102.checkOut();
        System.out.println("=======================================================");

//  Print rooms checked out:
      for(Room r : rooms) {
          System.out.println("Rooms checked out: ");
          System.out.println();
          System.out.println(r);
          System.out.println("=======================================================================================");
      }

// ------------------------------------------

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
            System.out.println(r);
            System.out.println();
        }
        System.out.println("=======================================================================================");

        // --------------------
        ArrayList<Employee> employees = new ArrayList<>();

        Employee emp1 = new Employee(1, "Matt", "IT", 10, 0);
        Employee emp2 = new Employee(2, "John", "Janitor", 1, 39);
        Employee emp3 = new Employee(1, "Dustin", "HR", 15, 42);
        Employee emp4 = new Employee(1, "Shewit", "HR", 15, 31);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        for(Employee e : employees){
            System.out.println(e);
            System.out.println();
        }

        //-------------

        emp1.punchIn(8);
        emp1.punchOut( 12);

        emp1.punchIn(13);
        emp1.punchOut(17);

        emp1.punchTimeCard(8, 12);
        emp1.punchTimeCard(13,17);

        emp1.logHours(40);

        emp2.punchIn(8);
        emp2.punchOut();

        System.out.println("=======================================================");
        System.out.println("After:");
        System.out.println();

        for(Employee e : employees){
            System.out.println(e);
            System.out.println();
        }

        System.out.println("=======================================================================================");


        //----------
        System.out.println("Hotels:");
        System.out.println();
        Hotel h1 = new Hotel("Days Inn", 6, 20);
        Hotel h2 = new Hotel("Holiday Inn", 10, 40);

        System.out.println(h1);
        System.out.println();
        System.out.println(h2);
        System.out.println("=======================================================");

        System.out.println("Book a room:");
        System.out.println();
        System.out.println("Book 3 suites");
        System.out.println();
        System.out.println(h1.bookRoom(3, true));
        System.out.println();
        System.out.println(h1);
        System.out.println();
        System.out.println("Book 4 more");
        System.out.println();
        System.out.println( h1.bookRoom(4, false));
        System.out.println();
        System.out.println(h1);
    }
}