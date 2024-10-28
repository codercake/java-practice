public class Operator {
    public static void main(String args[]){
        int num1=23;
        int num2=11;

        boolean result=!(num1<=0);
        boolean result1=num1<num2||num1<0;
        int result2=num1>0?5:10;
        //logical operators we don't use AND, OR, NOT gate simply unlike in python instead we use &&(ampersand) - AND operation, pipe for OR operation
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
