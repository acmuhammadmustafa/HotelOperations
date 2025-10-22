package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test

    public void checkIn_isOccupiedAndIsDirty_isTrue(){
    // Arrange
        Room ro1 = new Room (5);


    // Act
        ro1.checkIn();


    // Assert
        assertTrue(ro1.isDirty());
        assertTrue(ro1.isOccupied());

        System.out.println("===================");
    }

    @Test

    public void checkOut_isOccupied_isFalse(){
    // Arrange
        Room ro1 = new Room (5);
        ro1.checkIn();

    // Act
        ro1.checkOut();


    // Assert
        assertFalse(ro1.isOccupied());

        System.out.println("===================");
    }

    @Test

    public void checkOut_isDirty_isTrue(){
        // Arrange
        Room ro1 = new Room (5);
        ro1.checkIn();

        // Act
        ro1.checkOut();


        // Assert
        assertTrue(ro1.isDirty());

        System.out.println("===================");
    }

    @Test

    public void cleanRoom_isDirty_isFalse(){
        // Arrange
        Room ro1 = new Room (5);
        ro1.checkIn();

        // Act
        ro1.checkOut();
        ro1.cleanRoom();

        // Assert
        assertFalse(ro1.isDirty());

        System.out.println("===================");
    }

    @Test
    public void cleanRoom_isDirty_isTrue(){
        // Arrange
        Room ro1 = new Room (5);
        ro1.checkIn();

        // Act
        ro1.checkOut();

        // Assert
        assertTrue(ro1.isDirty());

        System.out.println("===================");
    }

    @Test

    public void cleanRoom_isClean_isTrue(){
        // Arrange
        Room ro1 = new Room (5);


        // Act
        ro1.cleanRoom();

        // Assert
        assertFalse(ro1.isDirty());

        System.out.println("===================");
    }


}