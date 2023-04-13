import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int Type = sc.nextInt();
        int b = sc.nextInt();

        if(Type==1){
            System.out.println(a+b);
        }else if(Type==2){
            if(a>b) {
                System.out.print(a-b);
            }else{
            System.out.println("Insufficient Funds");
            }    
        }  
        
    }
}