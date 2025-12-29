//Palindrome

import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
    System.out.print("Enter a name: ");
    Scanner obj=new Scanner(System.in);
    String name=obj.nextLine();

    int n=name.length();
    String rev="";

    for(int i=n-1;i>=0;i--){
        rev=rev+name.charAt(i);
    }
    if(name.equals(rev)){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not Palindrome");
    }

}
    
}