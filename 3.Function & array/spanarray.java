import java.util.*;
public class spanarray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=scn.nextInt();
        }
        int minterm=num[0];
        int maxterm=num[0];
        for(int i=0;i<n;i++){
            if(maxterm<num[i]){
                maxterm=num[i];
            }
            if(minterm>num[i]){
                minterm=num[i];
            }
        }
        System.out.println(minterm);
        System.out.println(maxterm);
        scn.close();
    }
    
}
