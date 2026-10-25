
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberPalindrome_Checker {
    //Return true if number is palindrome false if not
    public static boolean isPalindrome(int x){
        String str = String.valueOf(x);
        
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int x = 0;
        
        System.out.print("Enter an Integer: ");
        try{
        x = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Only Input Integers!");
        }
        
        if(isPalindrome(x)){
            System.out.println("Palindrome!");
        }else{
            System.out.println("Not A palindrome!");
        }
    }
}
