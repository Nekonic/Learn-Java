import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[3];
        int max=-1;
        for(int i=0; i<3; i++){
            a[i] = s.nextInt();
        }

        System.out.println(getMax(a));
    }

    private static int getMax(int[] arr) {
        int max=-1;
        for(int i:arr)max=i>max?i:max;
        return max;
    }
}