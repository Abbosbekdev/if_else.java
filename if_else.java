package com.company;

import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class if_shart {
    public static void main(String[] args) {
        Scanner scanf =new Scanner(System.in);
     //1-masala
        System.out.print("a = ");
        int a=scanf.nextInt();
        System.out.print("b = ");
        int b = scanf.nextInt();
        System.out.print("c = ");
        int c=scanf.nextInt();
        /*
        if (a>0)
            System.out.println(++a);
        else System.out.println(a);
    //2-3-masalalar
        if (a>0) System.out.println(++a);
        else if (a==0) System.out.println(a=10);
        else System.out.println(a-2);
    //6-masala
        if (a>b) System.out.println("max : "+a);
        else if (b>a)System.out.println("max :" +b);
     //7-masala
        if (a<b) System.out.println(1);
        else if (b<a) System.out.println(2);
     //8-masala
            if (a>b){
            System.out.println("max : "+a);
            System.out.println("min : "+b);
        }else if (a<b){
            System.out.println("max : "+b);
            System.out.println("min : "+a);
        }
    // 9-masala
        if (a>b){
            a = a+b;
            b = a-b;
            a = a-b;
            c =a;
            a =b;
            b = c;
            System.out.println("min : "+a);
            System.out.println("max : "+b);
        }else {
            System.out.println("min : "+a);
            System.out.println("max : "+b);
     //10-masala
        if(a==b) System.out.println(a+b);
            else System.out.println(0);
     //11-masala
        if (a!=b) System.out.println(max(a,b));
        else System.out.println(0);
     //12-masala
        System.out.println(min(a,min(b,c)));
     //13-masala
        if (a >max(b,c)) System.out.println(max(b,c));
        else if (b > max(a,c)) System.out.println(max(a,c));
        else if (c > max(a,b)) System.out.println(max(a,b));
     //14-masala
        if (a > max(b,c)) System.out.println("max"+a+" min"+min(b,c));
        else System.out.println("max : "+ max(b,c) + " min : "+min(a,min(b,c)));*/
     //15-masala
        if (a>b && b > c || b>a && a>c) System.out.println(a+b);
        else if (a>c && c>b || c>a && a>b) System.out.println(a+c);
        else if (b>c && c>a || c>b && b>a) System.out.println(b+c);
     //16-masala
        if (a<b && b<c) System.out.println(2 *a  +  2* b +  2* c);
        else System.out.println(0);
     //17-masala
        if (a<b && b<c || a>b && b>c) System.out.println(2 *a  +  2* b +  2* c);
        else System.out.println(0);
    }

}





