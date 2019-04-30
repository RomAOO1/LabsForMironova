package zm8;
import java.util.Scanner;
public class ZM8 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=read.nextInt();
        int[] min=new int[1441];
        int[] h1=new int[n];
        int[] h2=new int[n];
        int[] m1=new int[n];
        int[] m2=new int[n];
        for (int i=0; i<n; i++){
            String time=new String();
            System.out.println("Enter time:**:**-**:**");
            time=read.next();
            String sh1=time.substring(0, 2);
            h1[i]=Integer.parseInt(sh1);
            String sm1=time.substring(3, 5);
            m1[i]=Integer.parseInt(sm1);
            String sh2=time.substring(6, 8);
            h2[i]=Integer.parseInt(sh2);
            String sm2=time.substring(9, 11);
            m2[i]=Integer.parseInt(sm2);
            //System.out.println(h1[i]+":"+m1[i]+"-"+h2[i]+":"+m2[i]);
            int time1=h1[i]*60+m1[i];
            int time2=h2[i]*60+m2[i];
            for(int j=time1; j<=time2; j++){
                min[j]++;
            }
        }
        int maxt=0;
        for (int i=0; i<=1440; i++){
            if (min[i]>maxt){
                maxt=min[i];
            }
        }
        for (int i=0; i<1441; i++){
            if(min[i]==maxt && i==0){
                String th=String.valueOf(i/60);
                if (th.equals("0")){
                    th="00";
                }
                String tm=String.valueOf(i%60);
                if (tm.equals("0")){
                    tm="00";
                }
                System.out.print(th+":"+tm+"-");
            }
            else if(min[i]==maxt && min[i-1]!=maxt){
                String th=String.valueOf(i/60);
                if (th.equals("0")){
                    th="00";
                }
                String tm=String.valueOf(i%60);
                if (tm.equals("0")){
                    tm="00";
                }
                System.out.print(th+":"+tm+"-");
            }
            if(min[i]==maxt && i==1440){
                String th=String.valueOf(i/60);
                if (th.equals("0")){
                    th="00";
                }
                String tm=String.valueOf(i%60);
                if (tm.equals("0")){
                    tm="00";
                }
                System.out.println(th+":"+tm);
            }
            else if(min[i]==maxt && min[i+1]!=maxt){
                String th=String.valueOf(i/60);
                if (th.equals("0")){
                    th="00";
                }
                String tm=String.valueOf(i%60);
                if (tm.equals("0")){
                    tm="00";
                }
                System.out.println(th+":"+tm);
            }
        }
    }
    
}
