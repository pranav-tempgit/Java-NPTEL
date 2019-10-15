import java.util.*;
public class Question3{
  public static void main(String[] args){
      Scanner s1 = new Scanner(System.in);
      
      //copy-paste starts here
            
      String firstname     = s1.next();
      String lastname      = s1.next();
      String rollno        = s1.next();
      String subject1marks = s1.next();
      String subject2marks = s1.next();

      System.out.print(firstname+lastname);
      System.out.print(" "+rollno);
      System.out.print(" "+(Float.parseFloat(subject1marks)+Float.parseFloat(subject2marks))/2);
        
      //copy-paste ends here  
        }
}
           
