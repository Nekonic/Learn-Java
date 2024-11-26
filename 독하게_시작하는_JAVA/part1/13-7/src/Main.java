import java.util.Scanner;

public class Main {
    static int[][] a;
    static int n,m;
    static int[][] d = {
            {1,-1},{-1,-1},{-1,1},{1,1}
    };

    public static void func(int dir,int len, int cnt, int i, int j){
        if(cnt>n*m)return;
        for (int k = 0; k < len; k++) {
            if (i < 0 || i >= n || j < 0 || j >= m || a[i][j] != 0) break;
            a[i][j] = cnt++;
            if (dir == 0) j++;
            else if (dir == 1) i++;
            else if (dir == 2) j--;
            else if (dir == 3) i--;
        }

        i += d[dir][0];
        j += d[dir][1];

        if (dir == 0 || dir == 2) len = len - 1;

        dir = (dir + 1) % 4;

        func(dir, len, cnt, i, j);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = s.nextInt();
        a = new int[n][m];
        func(0,m,1,0,0);
        for(int i=0; i<n; i++){
            for(int j:a[i]){
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
}