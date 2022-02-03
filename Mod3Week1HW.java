//1
// public class Mod3Week1HW {
//     public static void main(String args[]){
//         int score = 92;

//         if(score >= 90){
//             System.out.println("A");
//         }else if(score >=80 && score <90){
//             System.out.println("B");
//         }else if(score >=70 && score <80){
//             System.out.println("C");
//         }else if(score >=55 && score <70){
//             System.out.println("D");
//         }else{
//             System.out.println("F");
//         }
//     }
// }

//2
// public class Mod3Week1HW{
//     public static void main(String args[]) {
//         int num= 5;

//         switch(num){
//             case 1 : System.out.println("Monday");
//             break;
//             case 2: System.out.println("Tuesday");
//             break;
//             case 3: System.out.println("Wednesday");
//             break;
//             case 4: System.out.println("Thursday");
//             break;
//             case 5: System.out.println("Friday");
//             break;
//             case 6: System.out.println("Saturday");
//             break;
//             case 7: System.out.println("Sunday");
//             break;
//             default: System.out.println("Invalid Input");
//         }
//     }
// }

//3
public class Mod3Week1HW{
    public static void main(String args[]){
        int num = 24;

        if(num % 2 == 0 && num >=2 && num <= 5){
            System.out.println("Not Cool");
        }else if(num%2 == 0 && num >=6 && num <=20){
            System.out.println("Cool");
        }else if(num %2 ==0 && num > 20){
            System.out.println("Not Cool");
        }else{
            System.out.println("Cool");
        }
    }
}