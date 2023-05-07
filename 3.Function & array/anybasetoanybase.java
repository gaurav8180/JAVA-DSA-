import java.util.*;
public class anybasetoanybase{
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();
    int basen=scn.nextInt();
    int basec=scn.nextInt();
    int answer=abtab(num, basen, basec);
    System.out.println(answer);
    scn.close();
}
public static int abtab(int num,int basen,int basec){
    int rv=0;
    int power=1;
    while(num>0){
        int digit=num%basec;
        num=num/basec;
         rv=rv+(digit*power);
        power=power*basen;
    }
    return rv;
}
}