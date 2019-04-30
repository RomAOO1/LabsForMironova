package zm14;

import java.util.Scanner;

public class ZM14 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=read.nextInt();
        int[] min=new int[n];
        System.out.println("Enter elements:");
        int[] mas=new int[n];
        for (int i=0; i<n; i++){
            mas[i]=read.nextInt();
        }
        for (int i=0; i<n; i++){
            int max=mas[i];
            for(int j=i+1; j<n; j++){
                if (mas[j]>max){
                    max=mas[j];
                    break;
                }
            }
            if (max==mas[i]){
                max=0;
            }
            mas[i]=max;
        }
        for (int i=0; i<n; i++){
            System.out.print(mas[i]+" ");
        }
        
    }
    
}
