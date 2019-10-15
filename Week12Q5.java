import java.util.*;
public class Question5 { 
    static int sum_odd_n(int n){ 
          if(n==1)
              return 1;
           if (n <= 0) 
                return 0;   
           //copy-paste the following code segment
           else
              return ((n*2)-1)+sum_odd_n(n-1);
           //copy-paste the following code segment   
              }
           
   public static void main(String[] args) {  
      Scanner in=new Scanner(System.in);
      int count=in.nextInt();      
      int r=sum_odd_n(count);
      System.out.println(r); 	  
    }  
}
      


     
     
