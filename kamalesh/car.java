public class car {
    String cusname ;
    String brand ;
    String moduls ;
    String colour ;
    int year ;

    void order() 
    {
        System.out.println(" the costomer "+cusname+" ordered "+colour+" colour "+brand+" "+moduls+" in year "+year);
    }
public static void main(String[] args) {
    car c1 = new car() ;
    c1.cusname = "kamal" ;
    c1.brand = "toyoto" ;
    c1.moduls = "supraa mk4" ;
    c1.colour = "orange" ;
    c1.year = 2002 ;

    c1.order();
    car c2 = new car() ;
    c2.cusname = "kamalesh" ;
    c2.brand = "Nissan" ;
    c2.moduls = "GTR R34" ;
    c2.colour = "blue";
    c2.year = 2003 ;
  
    c2.order();
}
}
