package zm9;

import java.util.Scanner;

public class ZM9 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=read.nextInt();
        System.out.println("Enter elements:");
        int[] mas=new int[n];
        for (int i=0; i<n; i++){
            mas[i]=read.nextInt();
        }
        System.out.println("Enter k:");
        int k=read.nextInt();
        for (int j=1; j<=k; j++){
            int z=mas[n-1];
            for (int i=n-1; i>0; i--){
            mas[i]=mas[i-1];
        }
        mas[0]=z;
        }
        for (int i=0; i<n; i++){
            System.out.print(mas[i]+" ");
        }
    }
    
}
