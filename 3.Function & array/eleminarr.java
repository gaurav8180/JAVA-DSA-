import java.util.*;
public class eleminarr {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=scn.nextInt();
            
        }
        int numfind=scn.nextInt();
        for(int i=0;i<n;i++){
            if(num[i]==numfind){
                System.out.println(i);
            }
            }
    
}
}