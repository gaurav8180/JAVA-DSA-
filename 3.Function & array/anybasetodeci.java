import java.util.*;
public class anybasetodeci {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int base=scn.nextInt();
        int ans=anybtodec(num, base);
        System.out.println(ans);
        scn.close();
    }
    public static int anybtodec(int num,int base){
        int rv=0;
        int power=1;
        while(num>0){
        int digit=num%10;
        num=num/10;
        rv=rv+(digit*power);
        power=power*base;
        
}
return rv;
}
}