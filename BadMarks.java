public class BadMarks {
  public static void main(String[] args) {
    int mark = Integer.parseInt(args[0]);

    if (mark >= 85 && mark <= 100) {
      System.out.println("High Distinction");
    }

    if (mark >= 75 && mark < 85) {
      System.out.println("Distinction");
    }

    if (mark >= 65 && mark < 75) {
      System.out.println("Credit");
    }

    if (mark >= 50 && mark < 65) {
      System.out.println("Pass");
    }

    if (mark < 50) {
      System.out.println("Fail");
    }
  }
}
