class MyString {
    private static byte[] string;
    private static int count;

    public MyString(){
        string = null;
    }

    public MyString(String str){
        string = str.getBytes();
    }

    public MyString(int str){
        string = String.format("%d",str).getBytes();
    }

    public static MyString newMyString(String str){
        count++;
        return new MyString(str);
    }

    public static MyString newMyString(int str){
        count++;
        return new MyString(str);
    }

    public MyString(MyString rhs){
        count++;
        this.deepCopy(rhs);
    }

    public String getString(){
        try {
            return new String(string);
        } catch (NullPointerException e) {
            return null;
        }
    }

    public void setString(String param){
        string = param.getBytes();
    }

    public int length(){
        try {
            return getString().length();
        } catch (NullPointerException e) {
            return 0;
        }
    }

    public void deepCopy(MyString rhs){
        this.string = rhs.string.clone();
    }

    public int compareTo(String string1){
        if(string1.equals(this.getString()))return 0;
        return 1;
    }

    public static int getCount(){
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
//        MyString s = new MyString("Test");
        MyString s = MyString.newMyString("Test");
        System.out.println(s.getString());
//        MyString s2 = new MyString(512);
        MyString s2 = MyString.newMyString(512);
        System.out.println(s2.getString());

        System.out.println(MyString.getCount());
    }
}