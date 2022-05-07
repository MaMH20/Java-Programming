package Execption_Und_Error;

public class TryUndCatch {
    public static void main(String args[]) {
        int a = 10;
        int b = 5; //0;
        int arr[] = {1, 2, 3, 4, 5};

        try {
            System.out.println(arr[5] = a / b);
        }
        /*catch (ArithmeticException exp) {
            System.out.println("Error: " + exp.getMessage());

        }
        catch(ArrayIndexOutOfBoundsException exp){
            System.out.println("Error: " + exp.getMessage());

        }*/
        //Alternative
        catch (Exception e) {
            System.out.println("Error:  " + e.getMessage());
            System.out.println(e.getClass().getTypeName());

        }
    }

}
