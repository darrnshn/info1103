public class BadValidation {
  public static void main(String[] args) {
    String username = args[0];

    boolean usernameIsValid = false;
    if (username.length() >= 5 && username.length() <= 10 && username.toLowerCase().equals(username)) {
      usernameIsValid = true;
    } else {
      System.out.println("Invalid username!");
    }

    String password = args[1];
    boolean passwordIsValid = false;
    if (password.length() >= 8 && password.length() <= 20) {
      passwordIsValid = true;
    } else {
      System.out.println("Invalid password!");
    }

    if (usernameIsValid && passwordIsValid) {
      System.out.println("You are now registered!");
    }
  }
}
