public class ExceptionHandling {
    public static void main(String args[]){
        int i=23;
        int j=11;
        int result=0; //if you don't declare the value of result as 0, it will throw an error while printing
        int nums[]={2,3,4};

        //keeping it out of the try blockwill throw ArrayIndexOutOfBoundsException Error 
        // System.out.println(nums[4]);
        try{
            result=i/j;
            if(result==0)
               throw new ArithmeticException();

            System.out.println(nums[4]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by Zero.");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Out of limit");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong!");
        }
        finally{
            System.out.println("Adios!");
        }

        System.out.println(result);
    }
}
