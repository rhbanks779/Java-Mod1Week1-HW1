//1 part a
import java.util.Scanner;

// public class UserInput {
//     public static void main(String args[]){
//         int num;

//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the number of rows: ");
//         num = scanner.nextInt();

//         for(int r=0; r <= num; r++){
//             for(int c=0; c <= r; c++){
//                 System.out.print(c);
//             }
//             System.out.println();
//         }
//     }
// }

//part b
// public class UserInput {
//     public static void main(String args[]){
//         int num;

//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the number of rows: ");
//         num = scanner.nextInt();

//         for(int r=0; r <= num; r++){
//             for(int c=num; c >= r; c--){
//                 System.out.print(r);
//             }
//             System.out.println();
//         }
//     }
// }

//2-Take a number from the user and print the first 10 multiples of that number.
public class UserInput {
    public static void main(String args[]){
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = scanner.nextInt();

       for(int i=1; i <=10; i++){
           System.out.println(num * i);
       }
    }
}