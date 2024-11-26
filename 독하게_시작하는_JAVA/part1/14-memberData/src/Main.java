public class Main {
    static int data = 10;

    public static void main(String[] args) {
        System.out.println("begin = " + data);
        test(); // or Main.test();
        System.out.println("end = " + data);
    }

    public static void test(){
        int data = 100;
        Main.data = 300;
        System.out.println("test() = " + data);
    }
}