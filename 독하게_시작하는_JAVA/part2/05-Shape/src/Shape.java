interface Shape {
    public void render();
}

class Rectangle implements Shape{
    @Override
    public void render(){
        for(int i=0; i<5; ++i){
            for(int j=0; j<5; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class Triangle implements Shape{
    @Override
    public void render(){
        for(int i=0; i<5; ++i){
            for(int j=0; j<=i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}