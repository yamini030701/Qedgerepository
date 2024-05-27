class Main {

  // method with no parameter
  public void display1() {
    System.out.println("Method without parameter");
  }

  // method with single parameter
  public void display2(int a) {
    System.out.println("Method with a single parameter: " + a);
  }

  public static void main(String[] args) {
    
    // create an object of Main
    Main obj = new Main();

    // calling method with no parameter
    obj.display1();
    
    // calling method with the single parameter
    obj.display2(24);
  }
}

#feature404 branch new method is added by developer vivek on may-2024

public class Main {
  public static void main(String[] args) {
    
    // using the sqrt() method
    System.out.print("Square root of 4 is: " + Math.sqrt(4));
  }
}

