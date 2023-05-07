
public class digitfreq {
    public static int freq(int x,int r){
        int count=0;
        while(x!=0){
            int digit=x%10;
            if(digit==r){
                count++;
            }
            x=x/10;
        }
        return count;
        
        }
    public static void main(String[] args) {
        int digitfreq=freq(23342,4);
        System.out.println(digitfreq);
    }
    
}
