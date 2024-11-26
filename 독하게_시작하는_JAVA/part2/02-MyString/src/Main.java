class MyString {
    private byte[] string;

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
        MyString s = new MyString();
        System.out.println(s.length());
        System.out.println(s.getString());
        s.setString("Hello Java");
        System.out.println(s.getString());
        System.out.println(s.length());
        System.out.println(s.compareTo("Hello Java"));
    }
}