package io.turntabl.startfresh;

import java.util.Scanner;
class AddTwo{
    public int a;
    public int b;



    public int add(int a, int b){
        return a + b;
    }
}
public class Try {
    public static void main(String[] args) {
        int i,b;
        AddTwo adding = new AddTwo();

        System.out.print("enter a number: ");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        System.out.print("enter second number: ");
        b= scanner.nextInt();
        System.out.println("the answer is " + adding.add(i,b));
    }
}
