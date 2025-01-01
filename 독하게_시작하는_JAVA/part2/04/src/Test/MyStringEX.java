package Test;

public class MyStringEX extends MyString{
    public MyStringEX(){
        super();
    }

    @Override
    protected String onSetString(String param) {
        return param.toUpperCase();
    }
}
