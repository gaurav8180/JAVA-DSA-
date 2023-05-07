import java.util.*;
public class primeno {
    public static void main(String[] args) {
        System.out.println("Enter number to check prime or not:");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int count=0;
        for(int div=2;div*div<=num;div++){
            
                if(num%div==0){
                    count++;
                    break;
                }}
                if(count==0){
                    System.out.println("prime");
                }
                else{
                    System.out.println("not prime");
                }
        


    }  
}
