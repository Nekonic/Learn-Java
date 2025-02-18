public class Shape {
    protected int[][] px = new int[5][5];
    public void render(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if (px[i][j] == 1)System.out.print("*\t");
                else System.out.print(" \t");
            }
            System.out.println();
        }
    }
}

class Rectangle extends Shape{
    Rectangle(){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                px[i][j]=1;
            }
        }
    }
}

class Triangle extends Shape{
    Triangle(){
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                px[i][j]=1;
            }
        }
    }
}