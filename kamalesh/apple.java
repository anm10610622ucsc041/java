import java.awt.*;
import java.awt.event.*;
public class apple extends Frame
{
    Label ibltitle , iblname , iblage , iblhight , iblmediyam ;
    TextField txtname , txtage , txthight , txtmediyam ;
    Button btnsubmit , btnclear , btnmediyam ;
    TextArea textresult ;

public apple() 

{
    setTitle(" the project ");
    setSize(900,800);
    setLayout(null);

    ibltitle = new Label("kamalesh");
    iblname = new Label("name");
    iblage = new Label("age");
    iblhight = new Label("hight");
    iblmediyam = new Label("mediyam");

    txtname = new TextField();
    txtage = new TextField();
    txthight = new TextField();
    txtmediyam = new TextField();

    btnsubmit = new Button("submit");
    btnclear = new Button("clear");
    btnmediyam = new Button("mediyam");

    textresult = new TextArea();

     ibltitle.setBounds(310,50,200,30);

     iblname.setBounds(150,90,60,30);
     iblage.setBounds(150,140,60,30);
     iblhight.setBounds(150,190,60,30);
     iblmediyam.setBounds(150,240,60,30);

     txtname.setBounds(240,90,200,30);
     txtage.setBounds(240,140,200,30);
     txthight.setBounds(240,190,200,30);
     txtmediyam.setBounds(240,240,200,30);

     btnsubmit.setBounds(150,290,80,30);
     btnclear.setBounds(270,290,80,30);
     btnmediyam.setBounds(390,290,80,30);

     textresult.setBounds(150,345,320,100);

     add(ibltitle);
     add(iblname);
     add(iblage);
     add(iblhight);
     add(iblmediyam);
     add(txtname);
     add(txtage);
     add(txthight);
     add(txtmediyam);
     add(btnsubmit);
     add(btnclear);
     add(btnmediyam);
     add(textresult);

     setVisible(true);

     
}
public static void main(String[] args) {
    new apple();
}
}