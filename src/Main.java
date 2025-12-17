import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{

 public static void main (String[] args){
  Car bmw = new Car(300.0f, 1830, "White ", new byte[] {0,0,0});

  Truck truck = new Truck(5600, new byte[]{ 100,0,100 }, true);

  truck.setLoaded(true);
  truck.getLoaded();
 }
}
