import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CounterScalaTest {
  
  var counter: Counter = new Counter()
  
  @Test
  def testInitialValue(): Unit =
    assertEquals(0, counter.getValue)
  
  @Test
  def testIncrement(): Unit =
    counter.increment()
    assertEquals(1, counter.getValue)
}
