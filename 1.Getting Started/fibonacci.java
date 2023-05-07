import java.util.*;
public class fibonacci{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int a=0;
        int b=1;
        while(a<=num){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
     
        }
    
    }
}