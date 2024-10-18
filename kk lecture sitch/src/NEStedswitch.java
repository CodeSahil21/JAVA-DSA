import java.util.Scanner;

public class NEStedswitch {  //  nested switch means switch inside switch
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid = in.nextInt();
        String department = in.next();
        switch (empid) {

            case 1 :
                System.out.println("KUNAL KUSHWAHA");
                break;
            case 2 :
                System.out.println("RAHUL RANA");
                break;
            case 3 :
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" :
                  System.out.println("IT DEPARTMENT");
                  break;
                    case "MANAGEMENT"  :
                  System.out.println("MANAGEMENT DEPARTMENT");
                    break;
                    default :
                     System.out.println("No Department Entered");


                }
                break;
            default :
                System.out.println("Enter Valid Empid");
        }

    }
}
