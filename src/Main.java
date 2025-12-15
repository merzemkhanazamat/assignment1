import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  String role = scan.nextLine();
  String pass = scan.nextLine();
  if (role.equals("Admin") && pass.equals("12345")) {
   System.out.println("All users");
  } else {
   String name = scan.nextLine();
   System.out.println(name);
  }
 }
}