import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
//        System.out.print(x+"초는 "+(x/3600)+"시간 "+(x/60)%60+"분 "+(x%60)+"초 입니다.");
        System.out.printf("%d초는 %02d시간 %02d분 %02d초 입니다.\n", x, x/3600, x/60%60, x%60);
        System.out.printf("%02d:%02d:%02d",x/3600,x/60%60,x%60);
    }
}