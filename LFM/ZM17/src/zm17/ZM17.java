package zm17;

import java.util.Scanner;

public class ZM17 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=read.nextInt();
        int[] mas=new int[1000];
        for (int i=0; i<1000; i++){
            mas[i]=0;
        }
        System.out.println("Enter elements:");
        for (int i=0; i<n; i++){
            mas[read.nextInt()]=1;
        }
        int i=1;
        while (mas[i]!=0){
            i++;
        }
        System.out.println(i--);
    }
    
}
