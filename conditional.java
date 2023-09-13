public class conditional {
    public static void main(String[] args) {
        int x = 18;
        int y = 20;
        int z = 5;

        if(x>10)
            System.out.println("Hello");
        if(x>10 && x<=20)
            System.out.println("hello bye");
        else
            System.out.println("bye");
        // if else 
        if(x>y){
            System.out.println(x);
            System.out.println("Thank you");
        }
        else
            System.out.println(y); 
   
        // if else if
        if(x<y && x>z)
            System.out.println(x);
        else if(y>x && y>z)
            System.out.println(y);
        else
            System.out.println(z);

    }
}
