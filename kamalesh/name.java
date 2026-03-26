public class name {
    public static void main(String[] args) {
        
        String str = " kamal " ;
        String reversed = " " ;
        for ( int i = str . length()-1 ; i >=0 ; i--)
        {
            reversed+= str . charAt(i) ;
        }
        System.out.println(" original : " + str );
        System.out.println(" reversed : " + reversed );
    }
}
