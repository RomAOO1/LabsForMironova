package zm5;
import java.util.Scanner;

public class ZM5 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=read.nextInt();
        int[] mas=new int[n];
        System.out.println("Enter "+n+" elements:");
        for (int i=0; i<n; i++){
            mas[i]=read.nextInt();
        }
        int k=0;
        int max=0;
        int mi=-1;
        for (int i=1; i<n; i++){
            if (mas[i]%mas[i-1]==0){
                k++;
                if(i==n-1 && k>max){
                max=k;
                k=0;
                mi=i;
            }
            }
            else if(k>max){
                max=k;
                k=0;
                mi=i-1;
            }
            else{
                k=0;
            }
        }
        if (mi==-1){
            System.out.println("Error");
        }
        else{
            max++;
            System.out.println("Number start line:"+(mi-max+2));
            System.out.println("Length line:"+max);
            System.out.print("Line:");
            for (int i=mi-max+1; i<=mi; i++){
                System.out.print(mas[i]+" ");
            }
        }
    }
    
}
