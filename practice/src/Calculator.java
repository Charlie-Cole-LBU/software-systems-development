package practice.src;

import java.util.Random;
import java.util.Scanner;

public class Calculator {            // creates a class called calculator, a class is like a blueprint that describes what variables can be stored and the methods they can do.
    public int n1,n2;
    public int ans;                 //these methods belong to every calculator object

    void useCalc() {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your first number");
            n1 = scan.nextInt();
            System.out.println("enter your second number");
            n2 = scan.nextInt();
    }

    void add()
    {
        ans=n1+n2;
        System.out.println(n1+" "+ "+" +" "+n2+" = "+ans);
    }
    void sub()
    {
        ans=n1-n2;
        System.out.println(n1+" "+ "-" +" "+n2+" = "+ans);
    }
    void multi()
    {
        ans=n1*n2;
        System.out.println(n1+" "+ "x" +" "+n2+" = "+ans);
    }



    }