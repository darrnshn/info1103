public class OrderedPairTest {
  public static void testInOrderConstructor() {
    OrderedPair pair = new OrderedPair(1.0, 2.0);
    if (pair.getFirst() == 1.0 && pair.getSecond() == 2.0) {
      System.out.println("Test passed!");
    } else {
      System.out.println("Test failed!");
    }
  }

  public static void testSetFirstIllegal() {
    OrderedPair pair = new OrderedPair(1.0, 2.0);
    try {
      pair.setFirst(3.0);
      System.out.println("Test failed!");
    } catch (IllegalArgumentException ex) {
      System.out.println("Test passed!");
    }
  }

  public static void main(String[] args) {
    testInOrderConstructor();
    testSetFirstIllegal();
  }
}
