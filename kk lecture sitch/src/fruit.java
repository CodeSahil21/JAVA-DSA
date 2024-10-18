import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
     switch (fruit) {
            case "Mango" -> System.out.println("KING OF FRUITS");
            case "Apple" -> System.out.println("SWEET RED FRUITS");
            case "Grapes" -> System.out.println("SMALL SWEET FRUITS");
            case "Orange" -> System.out.println("ROUND FRUITS");
            default -> System.out.println("Enter Valid Fruit");
        }

    }
}
