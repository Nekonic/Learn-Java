class MyString {
    private byte[] string;

    public MyString(){

    }

    public MyString(String str){
        string = str.getBytes();
    }

    public MyString(int str){
        string = String.format("%d",str).getBytes();
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

    public int compareTo(String string1){
        if(string1.equals(this.getString()))return 0;
        return 1;
    }
}

public class Main {
    public static void main(String[] args) {
        MyString s = new MyString("Test");
        System.out.println(s.getString());
        MyString s2 = new MyString(512);
        System.out.println(s2.getString());
    }
}