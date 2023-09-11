public class literals {
    public static void main(String[] args) {
        int num = 584; //base10
        int num1 = 0b101; //base2 (101 binary for 5)
        int num2 = 0x7E; //hexadecimal number (126)
        int num3 = 10_00_00_000;

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        double num4 = 12e10;
        System.out.println(num4);

        char c = 'a';
        c++;
        System.out.println(c);
    }
}
