// import java.util.*;
// public class basicarray {
//     public static void main(String[] args){
//         int[] marks;
//         marks= new int[5];
//         marks[0]=33;
//         marks[1]=45;
//         marks[2]=55;
//         marks[3]=11;
//         marks[4]=22;
//         System.out.println(marks[4]);}
    
    
// }


// ########################################################


import java.util.*;
public class basicarray{
public static void swap(int[] arr,int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
public static void main(String[] args) {
    int[] arr;
    arr=new int[3];
    arr[0]=33;
    arr[1]=47;
    arr[2]=98;
    swap(arr,0,2);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    
}}