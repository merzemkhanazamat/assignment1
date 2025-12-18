import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{

 public static void main (String[] args){


  Class_restangle restangle = new Class_restangle(1.0, 1.0);
  System.out.println(restangle.toString());
  System.out.println(restangle.area());
  System.out.println(restangle.perimeter());

  Class_book classBook = new Class_book("Abai zholy", "Mukhtar Auezob", 1950);
  System.out.println(classBook.toString());
 }
}
