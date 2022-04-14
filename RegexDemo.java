package com.java.assignments.assignment9;

import java.util.Scanner;
import java.util.regex.*;

public class RegexDemo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Pattern p=Pattern.compile("^[A-Z].*[0-9]$");
        Matcher m=p.matcher(str);
        if(m.find()){
            System.out.println("String satisfies the regex pattern");
        }
        else{
            System.out.println("String don't satisfy the regex pattern");
        }
    }
}
