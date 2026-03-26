class clg {
    String name ;
    int age ;
 
static int number = 12345 ;
    void run()
    {
       
        String depart = " bsc " ;
        System.out.println( " name / " + name);
        System.out.println( " age / "+ age);
        System.out.println( "rool number / "+number);
        System.out.println( "depart / "+ depart);

    }
    void defind()
    {
        String depart_2 = " bba " ;
        System.out.println( " name / " + name);
        System.out.println( " age / " + age );
        System.out.println( " rool number / " + number );
        System.out.println( " depart_2 / " + depart_2);
    }
}


public class variabletypes {
public static void main(String[] args) {

    clg obj = new clg() ;
    obj.name = "kamalesh" ;
    obj.age = 22 ;


 obj.run();
 obj.defind();
}
}