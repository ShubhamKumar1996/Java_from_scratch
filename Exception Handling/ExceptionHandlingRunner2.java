// Introduction of try-catch block.
public class ExceptionHandlingRunner2 {

    public static void main(String[] args) {
        ExceptionHandlingRunner2 object = new ExceptionHandlingRunner2();
        int length = object.findStringLength();
        System.out.println(length);
        System.out.println("Completed First Execution");
        object.accessElementofArray();
    }

    private int findStringLength() {
        int result = -1;
        try {
            String str = null;
            result = str.length();
            // Jump to catch block.
            System.out.println("Method Completed");
        } catch (NullPointerException nullException) {
            System.out.println("Null Pointer Exception");
            nullException.printStackTrace();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return result;
    }

    private void accessElementofArray() {
        try {
            int[] arr = {1, 2};
            int number = arr[3];
            System.out.println(number);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}