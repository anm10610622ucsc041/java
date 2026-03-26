public class fib {
    public static void main(String[] args) {
        
        int k = 5 , s = 1 ;
        System.out.println(" fibo " + k + " terms :");

        for( int i = 1; i<=k ; i ++)

        {
        
            s*=i ;
            
             
        }
        System.out.println(s);
    }
}
