public class Hangar {
  public static void main(String[] args){
    Car hasbulla = new Car("Tapis volant", 231000);
    Boat hasboat = new Boat("Hermes", 1);

    System.out.println(hasbulla.doStuff());
    System.out.println(hasboat.doStuff());
  }
}