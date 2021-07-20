public class FizzBuzz {

  public static void main (String[] args) {
    int count = 1;

    do {
      String print = count + " ";

      if (count % 3 == 0) {
        print += "fizz";
      }
      if (count % 5 == 0) {
        print += "buzz";
      }

      System.out.println(print);
      count++;
    } while (count < 20);

  }

}
