public class Main {
    public static void main(String[] args) {
        int[] a = {4,3,5,2,1};
        for(int i=a.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}