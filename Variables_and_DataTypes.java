public class Variables_and_DataTypes {
    public static void main(String[] args) {

//   Q1- Take 2 integer values in two variables x and y and print their product.
//
       int a=2;
       int b=4;
       System.out.println(a*b);

//        Q2 - Print the ASCII value of the character ‘U’.
       char a = 'U';
       System.out.println((int)a);

//        Q3 - Write a Java program to take the length and breadth of a rectangle and print its area.

       int length=2;
       int breadth=6;
       int area = length*breadth;
       System.out.println(area);

//        Q4 - Write a Java program to calculate the cube of a number.

       int a = 4;
       int cube = a*a*a;
       System.out.println(cube);

//     Q5- Write a Java program to swap two numbers with the help of a third variable.

       int a =2;
       int b = 3;
       int c;
       System.out.println("a and b values before swapping: "+a+" "+b);
       c=a;
       a=b;
       b=c;
       System.out.println("a and b values after swapping: "+a+" "+b);

    }
}
