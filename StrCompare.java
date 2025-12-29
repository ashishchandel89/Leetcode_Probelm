import java.util.Scanner;
class StrCompare{
public static void main(String args[]){
     
    System.out.print("Enter name1: ");
    Scanner obj=new Scanner(System.in);
    String name1=obj.nextLine();
    System.out.print("Enter name2: ");
    String name2=obj.nextLine();
   
    String rev="";

   int n=Math.min(name1.length(),name2.length());

    for(int i=0;i<n;i++){
        
       if(name1.charAt(i)==name2.charAt(i)){
        rev=rev+name1.charAt(i);
       }
       else{
        break;
       }
            
        }
        System.out.println("Common prefix string: "+rev);
    }
    

}
