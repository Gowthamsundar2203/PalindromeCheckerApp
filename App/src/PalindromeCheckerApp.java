import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Palindrome: ");
        String str=input.nextLine();
        String RevStr="";
        for(int i=str.length()-1;i>=0;i--){
            RevStr=RevStr+str.charAt(i);

        }
        if(RevStr.equals(str)){
            System.out.println("Yes It is a Palindrome");
        }
        else{
            System.out.println("No It is not a Palindrome");
        }
    }
}
