//Find SquareRoot.
import java.util.Scanner;
import java.math.*;

class SquareRoot{
    public int sqrt_func(double num){
        int result=(int)Math.sqrt(num);
        return result;
    }
    public static void main(String arg[]){
        double num;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a no ,which squareRoot you have to find: ");
        num=obj.nextDouble();
        
        SquareRoot obj2=new SquareRoot();
        obj2.sqrt_func(num);

        int final_result=obj2.sqrt_func(num);
        System.out.print("SquareRoot of "+num+" is: "+final_result);
    }
}