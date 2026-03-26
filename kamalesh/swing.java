import java.swing.*;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.event.*;

public class javaswing
{
    JFrame frame = new JFrame("java swing explanation");
    frame.setSize(500,400);
    frame.setDefaultcloseOperation(JFrame.EXIT_ON_CLOSE_);
    frame.setLayout(null);

    JLabel ibltitle = new JLabel("welcome to java swing");
    ibltitle.setBounds(150,20,200,25);
    frame.add(ibltitle);

    JLabel iblname = new JLabel("name:");
    iblname.setBounds(50,70,100,25);
    frame.add(iblname);

    JTextField txtname = new JTextField();
    txtname.setBounds(150,70,200,25);
    frame.add(txtname);

    JCheckBox chkjava = new JCheckBox("java");
    chkpython.setBounds(160,110,100,25);

    JCheckBox chkpython = new JCheckBox("python");
    chkpython.setBounds(160,110,100,25);

    frame.add(chkjava);
    frame.add(chkpython);

    JLabel iblgender = new JLabel("gender");
    IblGender.setBounds(150,150,100,25);
    frame.add(IblGender);

    JRadioButton rbMale = new JRadioButton("male");
    rbMale.setBounds(150,150,80,25);

    JRadioButton rbfemale = new JRadioButton("female");
    rbFemal.setBounds(150,150,100,25);

    ButtonGroup genderGroup = new ButtonGroup();
    genderGroup.add(rbmale);
    gendergroup.add(rbFemal);


    frame.add(rbMale);
    frame.add(rbFemal);
    
    JLabel IblGender = new JLabel("Gender :");
    Iblgrnderf.setBounds (50,150,100,25);
    frame.add(IblGender);

    JRadioButton rMale = new JRadioButton("male");
    rbMale.setBounds(150,150,80,25);

    JRadioButton rbfemale = new JRadioButton("femal");
    rbfemale.setBounds(240,150,100,25);

    ButtonGroup gendeGroup = new ButtonGroup();
    gendergroup.add(rbMale);
    gendergroup.add(rbFemal);
}