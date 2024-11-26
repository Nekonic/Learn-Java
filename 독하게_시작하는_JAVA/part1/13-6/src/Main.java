public class Main {
    public static int[][] a = new int[5][5];
    public static void R(int idx){
        for(int i=0; i<5; i++){
            a[idx][i] = idx*5+i+1;
        }
    }
    public static void L(int idx){
        for(int i=4; i>=0; i--){
            a[idx][i] = idx*5+5-i;
        }
    }
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            if(i%2==1)R(i);
            else L(i);
        }

        for(int i=0; i<5; i++){
            for(int j:a[i]){
                System.out.printf("%d ",j);
            }System.out.println();
        }
    }
}