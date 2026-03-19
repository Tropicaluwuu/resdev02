package operationsUnitTesting;
import operationsLibrary.TemperatureConverter;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class TemperatureUnitTesting{
    @Test
    public void testCelsiusToFahrenheit(){
        //arrange
        double celsius = 0.0;
        double expectedFahrenheit = 32.0;

        //act
        double actualFahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);

        //assert
        assertEquals(expectedFahrenheit, actualFahrenheit);
    }

    @Test 
    public void testFahrenheitToCelsius(){
        //arrange
        double fahrenheit = 32.0;
        double expectedCelsius = 0.0;

        //act
        double actualCelsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);

        //assert
        assertEquals(expectedCelsius, actualCelsius);

    }
}