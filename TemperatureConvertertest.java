package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    @Test
    void testConvert() {
        TemperatureConverter converter = new TemperatureConverter();
        assertEquals(212.0, converter.convert(100.0), 0.001);
        assertEquals(32.0, converter.convert(0.0), 0.001);
    }
}
