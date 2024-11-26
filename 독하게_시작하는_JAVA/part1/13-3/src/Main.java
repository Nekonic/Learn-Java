public class Main {
    public static void main(String[] args) {
        int[] a = {4,3,5,2,1};
        final int inf = 1<<29;
        for(int i=0; i<a.length; i++){
            int min=inf;
            int idx=inf;
            for(int j=i+1; j<a.length; j++){
                if(min>a[j]){
                    min=a[j];
                    idx=j;
                }
            }if(idx!=inf){
                a[idx]=a[i];
                a[i]=min;
            }
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}