public class BadValidation {
  public static boolean isLowercase(String str) {
    return str.toLowerCase().equals(str);
  }

  public static boolean checkRange(String str, int min, int max) {
    return str.length() >= min && str.length() <= max;
  }

  public static boolean validUsername(String username) {
    return checkRange(username, 5, 10) && isLowercase(username);
  }

  public static boolean validPassword(String password) {
    return checkRange(password, 8, 20);
  }

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Please enter your username and password");
      return;
    }

    if (validUsername(args[0])) {
      if (validPassword(args[1])) {
        System.out.println("You are now registered!");
      } else {
        /* This is not perfect. What if we changed the criteria on the
         * password length? We'd have to change it in the validPassword
         * method, as well as the string below. If we changed one and
         * forgot to change the other, the user may get very confused.
         * What can we do about this?
         */
        System.out.println("Invalid password! Password has to be between 8 and 20 characters.");
      }
    } else {
      /* Same deal */
      System.out.println("Invalid username! Username has to be between 5 and 10 characters and be all lowercase.");
    }
  }
}
