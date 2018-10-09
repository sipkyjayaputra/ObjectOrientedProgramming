package mmm;

import java.util.Scanner;

public class MMM {

    public static void main(String[] args) {
        int jml,i,total=0,mean,median,modus;
        Scanner in = new Scanner(System.in);
        System.out.print("Banyak angka yang ingin diinput : ");
        jml = in.nextInt();
        int angka[] = new int[jml];
          
        for(i=0;i<jml;i++){
            System.out.print("Masukkan angka : ");
            angka[i] = in.nextInt();
            total = total+angka[i];
        }
        
        mean = total/jml;
        median = angka[(jml%2)];
        
        System.out.println("Median : "+median);
        System.out.println("Mean : "+mean);
    }
    
}
