
import java.util.LinkedList;
import java.lang.ArithmeticException;
  


public class MyFirstJavaProgram{

   public static int foo(int v1, int v2){
      
      if(v2 == 0){
         ArithmeticException ex = new ArithmeticException("Division by zero baka");
         throw ex;
      }else{
         return v1/v2;
      }
   }
   public static void main(String[] args) {
   //  LinkedList<String> linkedList = new LinkedList<String>();
   //  linkedList.push("A");
   //  linkedList.push("B");
   //  System.out.println(linkedList);

    int v1 = 2;
    int v2 = 2;
    try{
      int result = foo(v1,v2);
      System.out.println(result);

    }catch(ArithmeticException ex){
      System.out.println(ex);
    }
    
   
   }
}