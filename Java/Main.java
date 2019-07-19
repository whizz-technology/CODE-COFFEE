public class Main {
  public static void main(String[] args) {
    Coffee coffee = new Coffee();
    System.out.println(coffee.taste()); // Delicious!

    CafeAuLait cafeAuLait = coffee.mixMilk();
    System.out.println(cafeAuLait.taste()); // creamy!
  }
}
