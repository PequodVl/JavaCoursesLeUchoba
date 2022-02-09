package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    static int userinvalid;
    static boolean IboolChildren = true;
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        Scanner scanner = new Scanner(System.in);
        while(IboolChildren){
            System.out.println("User menu");
            System.out.println("1. Print out the array");
            System.out.println("2. Print out selected element");
            System.out.println("3. Add an element");
            System.out.println("4. Remove an element");
            System.out.println("5. Sort");
            System.out.println("6. Commit crash");
            userinvalid = scanner.nextInt();
            switch(userinvalid){
                case 1:
                    System.out.println("Overall length is " +al.size());
                    for (int i=0; i<al.size();i++){
                        System.out.print((i+1)+"."+al.get(i)+" ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter a number of an element you want to review (1to"+(al.size()+1)+")");
                    userinvalid = scanner.nextInt();
                    userinvalid--;
                    if (userinvalid>=0&&userinvalid<al.size()){
                        System.out.println("Your element: " + al.get(userinvalid));}
                    else {System.out.println("Incorrect");}
                    break;
                case 3:
                    System.out.print("Enter the value of an element you want to add: ");
                    userinvalid = scanner.nextInt();
                    al.add(userinvalid);
                    System.out.println("\nIt will be added as " + (al.size())+"th");
                    break;
                case 4:
                    System.out.print("Enter the position of an unwanted element: ");
                    userinvalid = scanner.nextInt();
                    userinvalid--;
                    if (userinvalid>=0&&userinvalid<al.size()){
                        al.remove(userinvalid);
                        System.out.println("Element has been removed");}
                    else {
                        System.out.println("Incorrect");}
                    break;
                case 5:
                    System.out.println("The array will be sorted");
                    Collections.sort(al);
                    break;
                case 6:
                    IboolChildren = false;
                    break;
                default:
                    System.out.println("User инвалид");
            }
        }
    }
}
