public class Solution {

  public static void main(String[] args) {
    // Print all multiples of 6 (6, 12, 18, ...) that are smaller than 50.
    System.out.println("\n\n#Multiples of 6");
    int multiplyBy = 1;
    int multiplicationBase = 6;
    do {
      System.out.println(multiplicationBase * multiplyBy);
      multiplyBy++;
    } while ((multiplicationBase * multiplyBy) < 50);

    // Count down from 10 (including 0).
    System.out.println("\n\n#Countdown");
    int countdown = 10;
    do {
      System.out.println(countdown);
      countdown--;
    } while (countdown >= 0);

    // Print all each individual character of the String "Hello World!" in a new line
    // (e.g. using charAt() ).
    System.out.println("\n\n#Print characters");
    String helloWorld = "Hello World!";
    int position = 0;
    do {
      System.out.println(helloWorld.charAt(position));
      position++;
    } while (position < helloWorld.length());
  }
}
