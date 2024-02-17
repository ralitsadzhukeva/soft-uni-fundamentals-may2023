package methods_06;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        PrintTriangle(n);
    }
    public static void printLine(int start,int end){
        for (int i = start; i <=end ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void PrintTriangle(int n){
        for (int i =1; i <=n ; i++)
            printLine(1,i);
        for (int line = n-1; line >=1 ; line--)
            printLine(1,line);
    }
}
