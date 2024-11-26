public class Main {
    public static void main(String[] args) {
        TestThis t1 = new TestThis(1);
        TestThis t2 = new TestThis(2);
        TestThis t3 = new TestThis(3);

        System.out.println(t1.getData());
        System.out.println(t2.getData());
        System.out.println(t3.getData());
    }
}