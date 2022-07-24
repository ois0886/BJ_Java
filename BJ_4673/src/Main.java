import java.util.*;
public class Main{
    static int check[] = new int[10036];
    public static void main(String [] args){
        for(int i = 1; i<=10000; i++){
            check[d(i)] =1;
            if(check[i] != 1) {System.out.println(i);}
        }
        
        
    }
    static int d(int n){
       int tmp = n;
       if(n >= 10000) {tmp += n / 10000; n %= 10000;}
       if(n >= 1000) {tmp += n / 1000; n %= 1000;}
       if(n >= 100) {tmp += n / 100; n %= 100;}
       if(n >= 10) {tmp += n / 10; n %= 10;}
       tmp += n;
       return tmp;
        
    }
    
}