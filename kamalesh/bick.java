public class bick {
    String ktm ;
    String dick ;
    String mt ;
    String speed ;
    int bickyears ;

    void differncebick() 
    {
        System.out.println(" differnece types of bick "+ktm+" speed "+dick+" range "+mt+ " speedplez"+bickyears);
    }

public static void main (String[] args){
    bick dataspeed = new bick () ;
    dataspeed.ktm = " go very speed bick " ;
    dataspeed.dick = " 140 + speed bick " ;
    dataspeed.mt = " friendly bick " ;
    dataspeed.speed = " over speed " ;
    dataspeed.bickyears = 40 ;

    dataspeed.differncebick() ;
    
}
}