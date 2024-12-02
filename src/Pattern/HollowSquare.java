package Pattern;

import java.util.Scanner;
class HollowSquare {
    public static void main(String[] args) {
        System.out.println("Enter number of * in each row: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = n;
        
        if (size%2!=0) {
        for(int i=0; i<size; i++ ){
            System.out.print("* ");
        }
        System.out.println();
        
        for(int i=0; i<size-2; i++ ){
        System.out.print("*");
        for(int j=0;j<size+2; j++){
        System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        }
        
        for(int i=0; i<size; i++ ){
            System.out.print("* ");
        }
        
        }
        
        else {
        	for(int i=0; i<size; i++ ){
                System.out.print("* ");
            }
            System.out.println();
            
            for(int i=0; i<size-2; i++ ){
            System.out.print("*");
            for(int j=0;j<size+1; j++){
            System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            }
            
            for(int i=0; i<size; i++ ){
                System.out.print("* ");
            }
        }
        
    }
}