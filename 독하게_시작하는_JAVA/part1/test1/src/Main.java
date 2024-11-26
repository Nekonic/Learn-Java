import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.print("정수 입력 : ");
        a = s.nextInt();
        b = s.nextInt();
        System.out.printf("AVG : %.2f",(a+b)/2F);
    }
}