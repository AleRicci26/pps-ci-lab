import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTest {
    private Counter counter;

    @BeforeEach
    public void init() {
        this.counter = new Counter();
    }

    @Test
    public void counterShouldStartAtZero() {
        assertEquals(0, this.counter.getValue());
    }

    @Test
    public void testIncrement() {
        this.counter.increment();
        this.counter.increment();
        this.counter.increment();
        assertEquals(3, this.counter.getValue());
    }
}
