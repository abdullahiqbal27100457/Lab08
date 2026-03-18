package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);

        assertTrue(list.hasCity(edmonton));

        list.deleteCity(edmonton);

        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        // The list should start with 0 cities
        assertEquals(0, list.countCities());

        // Add a city and check if the count increases
        City toronto = new City("Toronto", "ON");
        list.addCity(toronto);
        assertEquals(1, list.countCities());
    }
}
