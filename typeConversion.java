public class typeConversion {
    public static void main(String[] args) {
        // byte b =  127; //maximum value of byte
        int a = 257; 
        byte k = (byte)a; //output will be given value % range  of byte(127%126 =1)
        System.out.println("byte to int : "+k);
    //-----------------------------------------
        float f = 5.6f;
        int t = (int)f;
        System.out.println("float to int : "+t);
    //-------------------------------------------
    //  type promotion
    byte b1 =10;
    byte b2 = 30;
    int result = b1*b2; //this exceeds the byte max range so it is promoted to int 
    System.out.println("type promotion : "+result);
    }
}
