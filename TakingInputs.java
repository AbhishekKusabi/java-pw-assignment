import java.util.Scanner;

public class TakingInputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//        Q1 - Input name, roll number and field of interest from user and print in the format below :
//      Name: xyz, Roll number: xyz, Field of interest: xyz
//        System.out.println("Enter Name Roll number and Field of Interest: ");
//        String f_name=sc.next();
//        String l_name=sc.next();
//        int roll_no=sc.nextInt();
//        String field=sc.next();
//        System.out.println("Name :"+f_name+" "+l_name);
//        System.out.println("Roll number: "+roll_no);
//        System.out.println("Field of interest: "+field);

//        Q2 - Input two different string and print them in same line.

//        System.out.println("Enter first string:");
//        String fstr=sc.next();
//        System.out.println("Enter second string:");
//        String lstr=sc.next();
//
//        System.out.print(fstr);
//        System.out.println(lstr);

//        Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
//      100), write a program to calculate his total marks and percentage marks.

//        System.out.println("Enter marks Scored by Robert in Subject1:");
//        int marks_1=sc.nextInt();
//        System.out.println("Enter marks Scored by Robert in Subject2:");
//        int marks_2=sc.nextInt();
//        System.out.println("Enter marks Scored by Robert in Subject3:");
//        int marks_3=sc.nextInt();
//
//        int total = marks_1+marks_2+marks_3;
//        float percentage = ((float) (total)/300)*100;
//
//        System.out.println("Total marks: "+total);
//        System.out.println("Percentage: "+ (int)percentage+"%");

//        Q4 - Given two numbers, return their sum in the following format:
//      Int t representing number of test cases
//      T lines of Two integers representing the numbers to be added

//        int t = sc.nextInt();
//        int i,a,b;
//        for( i=1; i<=t; i++){
//          a=sc.nextInt();
//          b=sc.nextInt();
//            System.out.println(a+b);
//        }


//        Q5 - Given few lines of input(number of lines unknown) where each line has two
//      strings, concatenate the strings.
        while (sc.hasNextLine()){
            String first =sc.next();
            String second =sc.next();
            System.out.println(first+second);
        }


    }
}