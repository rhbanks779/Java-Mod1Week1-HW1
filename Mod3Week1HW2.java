import java.util.Scanner;

//1-Write Fibonnaci series (Links to an external site.) for the first n numbers in the series (n is a user entered value)
// public class Mod3Week1HW2 {
//     public static void main(String[] args){

//         int num;
//         int prevNum=0;
//         int currNum=1;
//         int answer;       

//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         num= scan.nextInt();

//         for( int i=0; i<= num; i++){
//             answer = prevNum + currNum;
//             prevNum = currNum;
//             currNum= answer;
                    
//             System.out.println(answer);
//         }

//     }
// }


//2-Write a program to see if a user entered string is a palindrome (Links to an external site.) or not

public class Mod3Week1HW2 {
        public static void main(String[] args){
    
            String userString;
            String reverseString;

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a word:");
            userString = scan.nextLine().toLowerCase();
            reverseString = new StringBuilder(userString).reverse().toString();

            if(userString.equals(reverseString)){
                System.out.println(userString + " is a palindrome!");
            }else{
                System.out.println(userString + " is not a palindrome!");
            }

        }
    }
    