public class kamalesh {
    String name ;
    String clg ;
    String city ;
    String deg ;
    int age ;

    void performance() 
    {
        System.out.println("hai name is "+name+" my age "+age+" iam Suddy "+deg+" in "+clg+" in "+city);
    }
public static void main(String[] args) {
    kamalesh bio = new kamalesh();
    bio.name = "kamalesh" ;
    bio.clg = "sri ragavaenthra ats clg" ;
    bio.city = "cdm" ;
    bio.deg = "bsc:computer science" ;
    bio.age = 22 ;

    bio.performance();


}


}
