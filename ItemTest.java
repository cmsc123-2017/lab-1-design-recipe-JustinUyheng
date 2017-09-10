import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ItemTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testTripCreated() {
    JeepneyTrip t = new JeepneyTrip(5, 5, 3);
    
    assertEquals(5.0, t.distance);
    assertEquals(5, t.totalPassengers);
    assertEquals(3, t.discountPassengers);
  }
  
  public void testExcessDistance() {
    JeepneyTrip t = new JeepneyTrip(6, 0, 0);
    
    assertEquals(1.0, t.excessDistance());
  }
  
  public void testComputeRegularFare() {
    JeepneyTrip t = new JeepneyTrip(5, 1, 0);
    
    assertEquals(7.0, t.computeRegularFare());
  } 
  
  public void testComputeDiscountFare() {
    JeepneyTrip t = new JeepneyTrip(5, 1, 1);
    
    assertEquals(6.0, t.computeRegularFare());
  } 
   
  public void testChangeNoDiscount() {
    JeepneyTrip t = new JeepneyTrip(5, 1, 0);
    
    assertEquals(3.0, t.fareChange(10));
  }
  
  public void testChangeDiscount() {
    JeepneyTrip t = new JeepneyTrip(5, 1, 1);
    
    assertEquals(4.0, t.fareChange(10));
  }
}