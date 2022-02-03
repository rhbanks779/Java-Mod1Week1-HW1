class DataTypes {
    public static void main(String[] args){
        int inum=43; //whole numbers, 32 bit
        float fnum= 3.14f; //decimal numbers-write f at end or considered as double
        double dnum=1234135.234; //larger numbers-double size of float and decimals
        long lnum=123443; //double size of int. 64 bit
        char onechar='a'; //receive one character, must be declared with single quotes ''
        boolean choice=true; //true or false
        String strings="one string"; //must use double quotes

        // System.out.print("integer num is " +inum);//using only print will print all info on 1 line, use println
        // System.out.println(" integer num is " +fnum);
        // System.out.println("integer num is " +dnum);
        // System.out.print(" integer num is " +lnum);
        // System.out.print(" integer num is " +onechar);
        // System.out.print(" integer num is " +choice);
        // System.out.print("integer num is " + strings);
        
        System.out.println(inum + dnum);
        System.out.println(dnum - lnum);
        System.out.println(inum / fnum);
        System.out.println(inum * dnum);
        System.out.println(inum % fnum);

    }
}
//compile in terminal= javac DataTypes.java (program name.java)
//run= java DataTypes (program name)

//conditions
public class conditions{
    public static void main(String args[]){
        int num1, num2;
        num1=10;
        num2=5;

        if(num1>num2){
            System.out.println(num1 + " is greater")
        }else{
            System.out.println(num2 + "is greater")
        }
    }
}