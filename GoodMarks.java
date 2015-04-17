public class GoodMarks {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Please enter a single integer mark");
      return;
    }

    int mark = 0;
    try {
      mark = Integer.parseInt(args[0]);
    } catch (Exception ex) {
      System.out.println("Please enter a single integer mark");
    }

    int thresholds[] = new int[] { 101, 85, 75, 65, 50, 0, Integer.MIN_VALUE };
    String grades[] = new String[] { "Invalid Mark", "High Distinction", "Distinction", "Credit", "Pass", "Fail", "Invalid Mark" };

    /* This code can still be improved. If a new grade was added,
     * the programmer has to remember to update both arrays.
     * If one array is updated and the other is not, then we can
     * run into some issues. Can you think of a way to solve this?
     * (Hint: Can you merge the two arrays into one?)
     */
    for (int i = 0; i < thresholds.length; i++) {
      if (mark >= thresholds[i]) {
        System.out.println(grades[i]);
        break;
      }
    }
  }
}
