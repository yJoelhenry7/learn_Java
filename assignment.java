public class assignment{
  public static void main(String[] args) {
    int num1 = 7;
    int num2 = 5;
    int result = num1 + num2;
    int result1 = num1 - num2;
    int result2 = num1 / num2;
    int result3 = num1 % num2;
    System.out.println(result);
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);

    num1 += 2;
    System.out.println(num1);
    num1 -= 2;
    System.out.println(num1);
    num1++; //post increment
    System.out.println(num1);
    num1--;
    System.out.println(num1);
    ++num1; //pre increment
    System.out.println(num1);


    int results2 = num1++; //fetch the value and increment
    System.out.println(results2);
    int results1 = ++num1; //increment and fetch the value
    System.out.println(results1);
  }
}