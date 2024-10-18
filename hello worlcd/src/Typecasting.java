import java.util.Scanner;

public class  Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    byte b = 42;
    char c =  'a';
    short s =  1024;
    int i = 5000;
    float f =  5.67f;
    double d = 0.1234;
    double result = (f * b) + (i / c) - (d - s);
    System.out.println((f * b) + " "  + (i / c) +" " + (d - s));
System.out.println(result);
   float a = 69.999f;// where we don't want to lose important data we dont use important data
   int w = (int)a;
        System.out.println(w);



    }

}
