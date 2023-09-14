public class ternary{
    public static void main(String[] args) {
        int n =4;
        int result = 0;
        // if we use if-else condition
        if(n % 2 == 0)
            result = 10;
        else
            result =20;
        System.out.println(result);

        result = n%2 ==0 ? 10 : 20;
        System.out.println(result);
    }
}