package execeptions;

public class MyOwnExeception {


    public static void main(String[] args) {
        try{
            MyOwnExeception.myTest(null);
        }catch (MyAppException e){
            System.err.println("Null error: " +e);
        }
    }


    static void myTest(String str) throws MyAppException{
        if(str == null){
            throw new MyAppException("String vall is null");
        }
    }
}
