public class Main {
  public static void main(String[] args) {
    String name = "John";
    System.out.println("Hello " + name.indexOf("o"));
    System.out.println("Hello " + name + "\r Cheese");
    for (int i = 0; i < 5; i++) {
      System.out.print(i + "\r");
      System.out.println("Cheese");
    }
  }
}

