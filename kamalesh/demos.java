import java.awt.* ;
import java.awt.event.*;

public class demos  extends Frame
{
    Label ibltitle , iblname , iblage ;
    TextField txtname , txtAge ;
    Button btnSubmit , btnclear ;
    TextArea txtresult ;

    public demos()
    {
         
      setTitle("AWT setbound () exmpl " );
      setSize(500,400);
      setLayout(null);

      ibltitle = new Label(" AWT aboust positive ");
      iblname = new Label(" name : ");
      iblage = new Label(" age : ");

      txtname = new TextField();
      txtAge = new TextField();
    

      btnSubmit = new Button("Submit");
      btnclear = new Button("clear");

      txtresult = new TextArea();

      ibltitle.setBounds(200,50,200,30);
      iblname.setBounds(80,90,60,30);
     

      txtname.setBounds(150,90,200,30);
      iblage.setBounds(80,140,60,30);
      txtAge.setBounds(150,140,200,30);

     btnSubmit.setBounds(150,190,80,30);
     btnclear.setBounds(270,190,80,30);

     txtresult.setBounds(80,240,320,100);

      

      add(ibltitle);
      add(iblname);
      add(iblage);
      add(txtname);
      add(txtAge);
      add(btnSubmit);
      add(btnclear);
      add(txtresult);
      

      setVisible(true);
    }
    public static void main(String[] args) {
        new demos();
    }
}
