public class logical{
    public static void main(String[] args) {
           int x =7;
           int y =5;
           int a =5 ;
           int b =9;
           boolean result= x>y && a>b; //and
           System.out.println(result);
           boolean result2 = x>y && a<b;
           System.out.println(result2);
           boolean result3 = x<y || a<b || a>1; //or
           System.out.println(result3);
           boolean result4 = a>b;
           System.out.println(!result4); //not
    }
}