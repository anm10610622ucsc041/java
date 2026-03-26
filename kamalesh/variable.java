class cricket {
  String name ;
  String brand ;
  String play ;

  static int number = 264 ;

  void ground ()
  {
    int num = 264 ;
     System.out.println( " name = " +name );
     System.out.println( " brand = " +brand );
     System.out.println( " paly = " +play );
     System.out.println( " num = " +num );


  }
}

public class variable {
    public static void main(String[] args) {
    
   
    cricket bcci = new cricket () ;
    bcci.name = " kamalesh " ;
    bcci.brand = " mrf" ;
    bcci.play = " mi " ;
    bcci.ground() ;

        
    }
}


    

