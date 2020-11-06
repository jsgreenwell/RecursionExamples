public class MathFunctions {
  /* Class used to perform a selection of math functions
      in iterative or recursive styles
  */

  /**
   * Calculate the factorial (n!) of a given number
   * @param stopNum number to calculate factoral for (meaning stop when reached)
   * @return result of calculation
   */
  protected long factorialIterative(final int stopNum) {
    // factorial to return - 1 because it is going to multiply
    // and 0 * anything is 0
    long f = 1;

    for (int i=2; i<=stopNum; i++) {
      f *= i;
    }
    return f;
  }

  /**
   * This is probably the most frequently used example
   * Function, through its variable assignment, is passed an integer (4)
   *   which it evaluates and returns 1 if it is 0
   *   or else it returns the current value
   *     (i) * another calculation made by recalling the function with the number - 1
   * This continues until the passed value is decremented to 0 (where it returns 1).
   *
   * @param stopNum A number (note too high will cause a stack overflow)
   * @return number * number - 1 or 1 (if number is 0)
   */
  protected long factorialRecursive(final int stopNum) {
    if (stopNum <= 1) {
      return 1;
    } else {
      return stopNum * factorialRecursive(stopNum - 1);
    }
  }

  /**
   * Given a number, recusively calculate the sum of its series (think factorial but adding)
   * @param stopNum to stop at
   * @return sum of all numbers
   */
  protected long sumSeries(final int stopNum) {
    long total = 0;

    if (stopNum <= 0) {
      return stopNum;
    } else {
      return stopNum + sumSeries(stopNum - 1);
    }
  }

  /* Not a math function but certainly a logic function */
  /**
   * Reverse given string (i.e. "FGCU" = "UCGF")
   * @param reverseMe string to be reversed
   * @return the string reversed
   */
  public String reverseString(final String reverseMe) {
    if (reverseMe.length() == 1) {
      return reverseMe;
    } else {
      return reverseString(reverseMe.substring(1)) + reverseMe.charAt(0);
    }

  }


}
