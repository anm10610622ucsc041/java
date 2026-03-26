public class fibonacci {
    public static void main ( String [] args) {
        int k = 10 ;
        int first = 0 , second = 1 , next ; 
        System.out.println( " fibonacci " + k + " terms :") ;
        for ( int i = 1 ; i <= k ; i ++ ) 
        {
            System.out.println( first  ) ;
            next = first + second ;
            first = second ;
            second = next ;
        }
    }
}
   
        
 
    