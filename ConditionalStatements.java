public class ConditionalStatements {
    public static void main(String args[]){
        int num1=100;
        int num2=1;
        if(num1<num2)
            System.out.println("True");
        else if(num1<num2||num1<0)
            System.out.println("False");
        else
            System.out.println("Bye!");
    }
    }

