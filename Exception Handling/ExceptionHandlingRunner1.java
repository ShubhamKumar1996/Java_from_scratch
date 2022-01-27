// Creating Exception
public class ExceptionHandlingRunner1 {
    
    public static void main(String[] args) {
        
        ExceptionHandlingRunner1 obj = new ExceptionHandlingRunner1();

        int length = obj.creatingException();
    }

    private int creatingException() {
        String str = null;
        return str.length();
    }

}