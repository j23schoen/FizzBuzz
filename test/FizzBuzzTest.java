import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;
    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void whenFizzBuzzIsPassedANumberItReturnsThatNumber(){

        assertEquals("1", fizzBuzz.fizz(1));
    }

    @Test
    public void whenFizzBuzzIsPassedATwoItReturnsATwo(){
        assertEquals("2", fizzBuzz.fizz(2));
    }

    @Test
    public void whenFizzBuzzIsPassedAMultipleOfThreeItReturnsFizz(){
        assertEquals("fizz", fizzBuzz.fizz(3));
        assertEquals("fizz", fizzBuzz.fizz(6));
    }

    @Test
    public void whenFizzBuzzIsPassedAMultipleOfFiveItReturnsBuzz(){
        assertEquals("buzz", fizzBuzz.fizz(5));
        assertEquals("buzz", fizzBuzz.fizz(10));
    }

    @Test
    public void whenFizzBuzzIsPassedAMultipleOfFiveAndThreeItReturnsFizzBuzz(){
        assertEquals("fizzbuzz", fizzBuzz.fizz(15));
    }
}
