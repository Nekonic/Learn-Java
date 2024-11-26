import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,t;
        a = s.nextInt();
        b = s.nextInt();
        t = a;
        a = b;
        b = t;
        System.out.println("a : "+a+" b : "+b);
    }
}