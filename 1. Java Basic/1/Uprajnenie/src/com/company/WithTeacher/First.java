package com.company.WithTeacher;
import java.util.Scanner;
public class First {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "Angel";
        int age = 20;
        String town = "Plovdiv";
        //CTRL + ALT + L = > Reorganizing code.

        //PlaceHolders
        System.out.printf("My name is %s and I am %d years old" +
                " and I am from %s.%n\n", name, age, town);

        // => \n || %n => new line
        //%s - String
        //%d - Int
        //%f - Double

        double a = 9.3000;
        System.out.printf("%.2f \n",a);
        System.out.printf("%.2f \n",a);
        System.out.printf("%.2f \n",a);
        //CTRL + D => COPY next line



    }

}
