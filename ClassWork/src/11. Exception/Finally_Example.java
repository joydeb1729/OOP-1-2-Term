/**
 * Auto Generated Java Class.
 */
public class Finally_Example {
  
  
  public static void main(String[] args) { 
     int numerator = 10;
     int denominator = 0;

      try {
          System.out.println (numerator / denominator);
          System.out.println ("This text will not be printed.");
      }
      catch(java.lang.ArithmeticException e) {
          System.out.println (e.getMessage());
          System.out.println ("This text will be printed.");
          System.out.println (numerator / denominator);
      }
      System.out.println ("This text will also be printed.");
      //finally {
      //    System.out.println ("This text will also be printed.");
      //}

  }
  
  /* ADD YOUR CODE HERE */
  
}
