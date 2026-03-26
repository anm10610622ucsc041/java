import java.awt.*;
import java.awt.event.*;
public class draw extends Frame
{
    Label ibltitle , iblname , iblage , iblhight ;
    TextField txtname , txtage , txthight ;
    Button btnSubmit , btnClear ;
    TextArea txtresult ;

    public draw()
    {
        setTitle("the name of application ");
        setSize(600,500);
        setLayout(null);

        ibltitle = new Label (" kamalesh ");
        iblname = new Label ("name : ");
        iblage = new Label ("age : " );
        iblhight = new Label ("hight : ");

        txtname = new TextField() ;
        txtage = new TextField() ;
        txthight = new TextField() ;

        btnSubmit = new Button("submit");
        btnClear = new Button("clear");

        txtresult = new TextArea();

        ibltitle.setBounds(200,50,200,30);

        iblname.setBounds(80,90,60,30);
        iblage.setBounds(80,140,60,30);
        iblhight.setBounds(80,190,60,30);

        txtname.setBounds(150,90,200,30);
        txtage.setBounds(150,140,200,30);
        txthight.setBounds(150,190,200,30);

        btnSubmit.setBounds(150,235,80,30);
        btnClear.setBounds(270,235,80,30);

        txtresult.setBounds(80,285,320,100);


        
        add(ibltitle);
        add(iblname);
        add(iblage);
        add(iblhight);
        add(txtname);
        add(txtage);
        add(txthight);
        add(btnSubmit);
        add(btnClear);
        add(txtresult);

        setVisible(true);

    }
    public static void main(String[] args) {
        new draw();
    }
}