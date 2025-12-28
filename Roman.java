//Roman To Integer.  

import java.util.Scanner;

class Roman{
    public int romanfunc(String roman){
        int n=roman.length();
        int prev=0;

        int total=0;

        for(int i=n-1;i>=0;i--){
            int curr=roman_to_int(roman.charAt(i));
            if(curr<prev){
                total=total-curr;
            }
            else{
                total=total+curr;
            }
            curr=prev;
        }
        return total;
     }
     public int roman_to_int(char ch){
        switch(ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
        }
    public static void main(String args[]){
        String roman;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a roman no: ");
        roman=obj.nextLine(); 

       
        Roman obj2=new Roman(); 
        obj2.romanfunc(roman);
         int result;
        result=obj2.romanfunc(roman);

        System.out.println("Converting to Integer: "+result);
    
    }
}