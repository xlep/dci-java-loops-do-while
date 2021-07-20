public class PerfectNumber {

  public static void main (String[] args) {

    int currentNumber = 1;

    do {
      int previousNumbers = 1;
      int sumOfDivisors = 0;

      do {
        if (currentNumber % previousNumbers == 0) {
          sumOfDivisors += previousNumbers;
        }

        previousNumbers++;
      } while (previousNumbers < currentNumber);

      if (sumOfDivisors == currentNumber) {
        System.out.println(currentNumber + " is a perfect Number");
      }
      currentNumber++;
    } while (currentNumber < 500);
  }

}
