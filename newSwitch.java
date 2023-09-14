public class newSwitch {
    public static void main(String[] args) {
        String day = "Monday";
        // old switch case
        switch(day){
            case "Saturday","sunday":
                System.out.println("6am");
                break;
            case "Monday":
                System.out.println("8am");
                break;
            default:
            System.out.println("7am");
        }
        // new switch statement
        switch(day){
            case "Saturday","sunday" -> System.out.println("6am");
            case "Monday" -> System.out.println("8am");
            default -> System.out.println("7am");
        }

        String result = "";
        switch(result){
            case "Saturday","sunday" -> result = "6am";
            case "Monday" -> result ="8am";
            default -> result = "7am";
        }

        System.out.println(result);
        String day1 = "wed";
        String result2 = "";
        result2 = switch(day1){
            case "Saturday","sunday" -> "6am";
            case "Monday" ->  "8am";
            default ->  "7am";
        };
       System.out.println(result);
      
    //    if we want to use colon instead of arrow we can use yield keyword
       String result3 = "";
        result3 = switch(day1){
            case "Saturday","sunday" : yield "6am";
            case "Monday" : yield  "8am";
            default : yield  "7am";
        };
       System.out.println(result3);

    }
}
