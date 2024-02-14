package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            divide(a , b);
           // throw new MyException("just for fun");
            String name = "rythem";
            if(name.equals("rythem")){
                throw new MyException("name is rythem");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this will always run");
        }
    }
    static int divide(int a ,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please do not divide by zero");
        }

        return a/b;
    }
}
