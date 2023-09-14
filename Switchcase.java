public class Switchcase {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("using if-else");
        if (n==1)
            System.out.println("Sunday");
        else if(n==2)
            System.out.println("monday");
        else if(n==3)
            System.out.println("Tuesday");
        else if(n==4)
            System.out.println("wednesday");
        else if(n==5)
            System.out.println("thursday");
        else if(n==6)
            System.out.println("friday");
        else if(n==7)
            System.out.println("saturday");

        System.out.println("using switchcase");
        switch(n){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("Enter a valid Number");
        }
    }
}
