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
}
@Test
public void testDeleteCity() {
    CustomList list = new CustomList();
    City edmonton = new City("Edmonton", "AB");
    list.addCity(edmonton);

    // Verify the city was added
    assertTrue(list.hasCity(edmonton));

    // This will cause an error because deleteCity() doesn't exist yet
    list.deleteCity(edmonton);

    // Verify the city was actually removed
    assertFalse(list.hasCity(edmonton));
}