package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.assertEquals;
import org.testng.annotations.Test;

public class NameFormatterTest {

    @Test
    public void testFormatFirstNameLastName() {
        String formattedName = NameFormatter.format("Paul", "Mlaviwa");
        assertEquals("Paul Mlaviwa", formattedName);
    }

    @Test
    public void testFormatPrefixFirstMiddleLastSuffix() {
        String formattedName = NameFormatter.format("Mr.", "Paul", "W", "Mlaviwa", "IV");
        assertEquals("Mlaviwa, Mr. Paul W, IV", formattedName);
    }

    @Test
    public void testFormatFullName() {
        String formattedName = NameFormatter.format("Mlaviwa, Joy A, Ms.");
        assertEquals("Mlaviwa, Joy A, Ms.", formattedName);
    }

    @Test
    public void testInvalidFormat() {
        // Testing an invalid format that should return the input as is
        String formattedName = NameFormatter.format("Invalid Format");
        assertEquals("Invalid Format", formattedName);
    }
}
