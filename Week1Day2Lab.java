//1-Write a for loop that runs 10 times and print the value of the controlling variable all on the same line
// public class Week1Day2Lab {
//     public static void main(String args[]){
//         for(int i=1; i<=10; i++){
//             System.out.print(i);
//         }
//     }
// }

//2-Write a for loop that iterates between 1 and 10, but counts by 2. Inside the loop, print your name on different lines
// public class Week1Day2Lab {
//     public static void main(String args[]){
//         for(int i=1; i<=10; i+=2){
//             System.out.println(i + " Robert");
//         }
//     }
// }

//3-Write a for loop to print asterisk (*) 15 times on the same line
// public class Week1Day2Lab {
//     public static void main(String args[]){
//         for(int i=1; i<=15; i++){
//             System.out.print("*");
//         }
//     }
// }

//4a-Write a for loop for the given output:1, 3, 5, 7, 9

// public class Week1Day2Lab {
//     public static void main(String args[]){
//         for(int i=1; i<=10; i+=2){
//             System.out.print(i + ", ");
//         }
//     }
// }

//4b-Write a for loop for the given output: 2, 4, 6, 8, 10
// public class Week1Day2Lab {
//     public static void main(String args[]){
//         for(int i=2; i<=10; i+=2){
//             System.out.print(i + ", ");
//         }
//     }
// }

//5-Use a while loop to add up the numbers 1 to 20 into one variable. Print out the sum at the end
// public class Week1Day2Lab {
//     public static void main(String args[]){
//         int i=1;
//         int sum=0;
//         while(i<=20){
//             sum = i + i;
//             i++;
                       
//         }
//         System.out.println(sum);
//     }
// }

//6-Use a while loop to print out the even number from 1 to 20
// public class Week1Day2Lab {
//     public static void main(String args[]){
//         int i=0;
        
//         while(i<=18){
//             i+=2;
//             System.out.println(i);
                       
//         }
//     }
// }

//Nested loops 1: Write a for loop to display the following outputs: 
// 1                                             11111
//  22                                           2222
//  333                                         333
//  4444                                       44
//  55555                                     5
// public class Week1Day2Lab {
//         public static void main(String args[]){
//             for(int i=1; i<=5; i++)
//                 for(int j=1; j<=i; j++){
//                     System.out.print(i);
//                 }                        
//             System.out.println();
//         }
//     }

//part 2
// public class Week1Day2Lab {
//     public static void main(String args[]){
//         for(int i=1; i<=5; i++)
//             for(int j=5; j>=i; j--){
//                 System.out.print(i);
//             }                        
//         System.out.println();
//     }
// }

//2-

public class Week1Day2Lab {
    public static void main(String args[]){
        for(int i=1; i<=20; i++){
            if(i==1){
                System.out.println(i);
            }else if(i==2){
                System.out.println(i+ " is prime");
            }
            else if(i%2==0 || i%3==0 && i >4){
                    System.out.println(i);
                }else{
                    System.out.println(i + " is prime");
            }
        }
            
    }
}