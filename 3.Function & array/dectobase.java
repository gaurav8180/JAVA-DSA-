import java.util.*;
public class dectobase{
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();
    int base=scn.nextInt();
    int finalans=decto(num,base);
    System.out.println(finalans);
    scn.close();
  }
  public static int decto(int num,int base){
    int rv=0;
    int power=1;
    while(num>0){
      int digit=num%base;
      num=num/base;
      rv=rv+(digit*power);
      power=power*10; 
     }
     return rv;
  } 
}