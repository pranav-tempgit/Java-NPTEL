class Parent {
    public static void testClassMethod() {
        System.out.println("The static method.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method.");
    }
}
public class Child extends Parent {
   public static void testClassMethod() {
        
    }
    
    //copy-paste the following code segment
    public static void main(String[] args) {
        
     
     Child c=new Child();
     c.testInstanceMethod();
     Parent.testClassMethod();
  }
}
   //copy-paste ends here 
