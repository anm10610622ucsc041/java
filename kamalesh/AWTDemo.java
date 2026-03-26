import java.awt.* ;
import java.awt.event.*;
public class AWTDemo extends Frame 
{
    Label Ibltitle, Iblname , Iblage ;
    TextField txtName , txtAge ;
    Button btnSubmit , btnClear ;
    TextArea txtResult ;

    public AWTDemo() 
    {
      
        setTitle(" kamalesh file ditles () example ");
        setSize(500,400);
        setLayout(null);
       
        Ibltitle = new Label(" information ");
        Iblname = new Label("name");
        Iblage = new Label("age");
       

        txtName = new TextField() ;
        txtAge = new TextField() ;
       
        btnSubmit = new Button("submit");
        btnClear = new Button("clear");

        txtResult = new TextArea();

        Ibltitle.setBounds(250,50,100,30);
        Iblname.setBounds(250,90,100,30);

        txtName.setBounds(270,100,100,30);

        Iblage.setBounds(300,110,100,30);
        txtAge.setBounds(270,120,100,30);

        btnSubmit.setBounds(270,150,100,30);
        btnClear.setBounds(2900,150,100,30);

        txtResult.setBounds(200,300,200,30);
        
        add(Ibltitle);
        add(Iblname);
        add(txtName);
        add(Iblage);
        add(txtAge);
        add(btnSubmit);
        add(btnClear);
        add(txtResult);

        setVisible(true);
    }   
        public static void main (String[]args)
        {
            new AWTDemo();
        }
    }

