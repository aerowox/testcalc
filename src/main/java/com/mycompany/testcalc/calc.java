package com.mycompany.testcalc;

import java.util.Scanner;
import java.util.HashSet;

public class calc {
    static Scanner scanner = new Scanner(System.in);
    static int i, a1, b1, c = 0;
    static String a, b, s = "";
    static char Operation;
    public static void main(String[] args) {
        
        HashSet<String> chkRoma = new HashSet<>();
        chkRoma.add("I");
        chkRoma.add("II");
        chkRoma.add("III");
        chkRoma.add("IV");
        chkRoma.add("V");
        chkRoma.add("VI");
        chkRoma.add("VII");
        chkRoma.add("VIII");
        chkRoma.add("IX");
        chkRoma.add("X");
        
        HashSet<String> chkArab = new HashSet<>();
        chkArab.add("1");
        chkArab.add("2");
        chkArab.add("3");
        chkArab.add("4");
        chkArab.add("5");
        chkArab.add("6");
        chkArab.add("7");
        chkArab.add("8");
        chkArab.add("9");
        chkArab.add("10");
        
        System.out.println("Welcome to Calc. Enter an expression:");
        String str = scanner.next();

        i = str.indexOf("+");
        if (i>0) {
            Operation='+';
            a = str.substring(0,i);  
            b = str.substring(i+1);
        } else {
            i = str.indexOf("-");
            if (i>0) {
                Operation='-';
                a = str.substring(0,i);  
                b = str.substring(i+1);
            } else {
                i = str.indexOf("*");
                if (i>0) {
                    Operation='*';
                    a = str.substring(0,i);  
                    b = str.substring(i+1);
                    } else {
                        i = str.indexOf("/");
                        if (i>0) {
                            Operation='/';
                            a = str.substring(0,i);  
                            b = str.substring(i+1);
                        } else {
                            System.out.println("Incorrect expression!");
                            System.exit(0);
                        }
                    }
                }
            }
        
        if (chkRoma.contains(a) & chkRoma.contains(b)) {
            if (a.equals("I"))       a1 = 1;
            if (a.equals("II"))      a1 = 2;
            if (a.equals("III"))     a1 = 3;
            if (a.equals("IV"))      a1 = 4;
            if (a.equals("V"))       a1 = 5;
            if (a.equals("VI"))      a1 = 6;
            if (a.equals("VII"))     a1 = 7;
            if (a.equals("VIII"))    a1 = 8;
            if (a.equals("IX"))      a1 = 9;
            if (a.equals("X"))       a1 = 10;
            if (b.equals("I"))       b1 = 1;
            if (b.equals("II"))      b1 = 2;
            if (b.equals("III"))     b1 = 3;
            if (b.equals("IV"))      b1 = 4;
            if (b.equals("V"))       b1 = 5;
            if (b.equals("VI"))      b1 = 6;
            if (b.equals("VII"))     b1 = 7;
            if (b.equals("VIII"))    b1 = 8;
            if (b.equals("IX"))      b1 = 9;
            if (b.equals("X"))       b1 = 10;
            
            switch (Operation) {
                case  '+' -> c = a1 + b1;
                case  '-' -> c = a1 - b1;
                case  '*' -> c = a1 * b1;
                case  '/' -> c = a1 / b1;               
            }
            
            while (c >= 100) {s += "C";   c -= 100;}
            while (c >= 90)  {s += "XC";  c -= 90; }
            while (c >= 50)  {s += "L";   c -= 50; }
            while (c >= 40)  {s += "XL";  c -= 40; }
            while (c >= 10)  {s += "X";   c -= 10; }
            while (c >= 9)   {s += "IX";  c -= 9;  }
            while (c >= 5)   {s += "V";   c -= 5;  }
            while (c >= 4)   {s += "IV";  c -= 4;  }
            while (c >= 1)   {s += "I";   c -= 1;  }    
            System.out.println(s);

        } else {
            if (chkArab.contains(a) & chkArab.contains(b)) {
                a1 = Integer.parseInt(a);
                b1 = Integer.parseInt(b);
                switch (Operation) {
                    case  '+' -> c = a1 + b1;
                    case  '-' -> c = a1 - b1;
                    case  '*' -> c = a1 * b1;
                    case  '/' -> c = a1 / b1;               
                }
                System.out.println(c);
            }
            else {
                System.out.println("Incorrect expression!");
                System.exit(0);
            }
        }      
    }
}