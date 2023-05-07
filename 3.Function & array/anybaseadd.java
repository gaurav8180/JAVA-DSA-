import java.util.*;
public class anybaseadd {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int base=scn.nextInt();
        int addition=addition(num1, num2, base);
        System.out.println(addition);
        scn.close();

    }
    public static int addition(int num1,int num2,int base) {
        int rv=0;
        int carry=0;
        int power=1;
        while(num1>0||num2>0||carry>0){
            int digit1=num1%10;
            int digit2=num2%10;
            int sum=(digit1+digit2)+carry;
            carry=sum/base;
            int digit3=sum%base;
            num1=num1/10;
            num2=num2/10;
            rv=rv+digit3*power;
            power=power*10;

        }
        
        return rv;
    }
    
}
