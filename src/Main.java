public class Main {
  public static void main(String[] args) {
    MathFunctions math = new MathFunctions();
    System.out.println(math.factorialIterative(9));
    System.out.println(math.factorialRecursive(9));
    System.out.println(math.sumSeries(5));

    System.out.println(math.reverseString("I've got a lovely bunch of coconuts"));
  }

}
