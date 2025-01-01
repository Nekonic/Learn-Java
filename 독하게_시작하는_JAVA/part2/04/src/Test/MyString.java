package Test;

public class MyString {
    private static byte[] string;
    private static int count;

    protected MyString(){
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
        string = onSetString(param).getBytes();
    }

    protected String onSetString(String param){
        return param;
    }

    public int length(){
        try {
            return getString().length();
        } catch (NullPointerException e) {
            return 0;
        }
    }

    public void deepCopy(MyString rhs){
        string = string.clone();
    }

    public int compareTo(String string1){
        if(string1.equals(this.getString()))return 0;
        return 1;
    }

    public static int getCount(){
        return count;
    }
}

