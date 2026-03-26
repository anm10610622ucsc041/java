import java.util.*;

public class Exception {
    public static void main(String[] args) {
        
       try 
       {
         int a = 10 ;
         System.out.println(a/0);
       }catch (ArithmeticException e )
       {
         System.out.println(" connet divide by zero ");
       }
     
      try 
      {
        int[] a = {1,2,3,4};
        a[3] = 10 ;
        System.out.println(Arrays.toString(a));
      }catch (ArithmeticException e)
      {
        System.out.println("ArithmeticException error");
      }catch(ArrayIndexOutOfBoundsException e )
      {
        System.out.println("Array index error");
      } 

      try 
      {
        int a = 10 / 2;
      }finally
      {
        System.out.println("eligible");
      }

       
    }
}
