import static org.junit.Assert.*;
import org.junit.*;

public class FibonacciTest {
    
    @Test
    public void fibTester(){
        assertEquals(0, Fibonacci.fib(0));
        assertEquals(1, Fibonacci.fib(1));
        assertEquals(1, Fibonacci.fib(2));
        assertEquals(2, Fibonacci.fib(3));
        assertEquals(3, Fibonacci.fib(4));
        assertEquals(5, Fibonacci.fib(5));
        assertEquals(8, Fibonacci.fib(6));
        assertEquals(13, Fibonacci.fib(7));
    }
}
