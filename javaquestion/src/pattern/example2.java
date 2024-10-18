package pattern;

public class example2 {
    public static void main(String[] args) {
        int n=4;
        for (int line = 0; line <=4; line++) {
            for (int star = 1; star < n-line+1; star++) {//n-i+1
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
