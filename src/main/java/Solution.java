public class Solution {

  public static void main(String[] args) {
    // Print all multiples of 6 (6, 12, 18, ...) that are smaller than 50.
    System.out.println("#Hello World!");
    String helloWorld = "Hello World!";
    int count = 0;
    do {
      System.out.println(helloWorld);
      count++;
    } while (count < 6);

    // Multiply by 2
    System.out.println("\n\n#Muliply by 2");
    int result = 3;
    do {
      System.out.println(result);
      result *= 2;
    } while (result < 100);

    // Count down from 10 (including 0).
    System.out.println("\n\n#Countdown");
    int countdown = 10;
    do {
      System.out.println(countdown);
      countdown--;
    } while (countdown >= 0);

  }
}
