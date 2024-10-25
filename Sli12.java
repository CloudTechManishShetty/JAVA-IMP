import javax.swing.*;

import java.awt.event.*;

import java.awt.*;

 

class Sli12 extends JFrame implements ActionListener

{

    JTextField t;

    JButton b[]=new JButton[18];

    static double a=0,c=0,result=0;

    static int operator=0;

    Sli12()

    {

      

        t=new JTextField(20);

        b[0]=new JButton("1");

        b[1]=new JButton("2");

        b[2]=new JButton("3");

        b[3]=new JButton("+");

        b[4]=new JButton("4");

        b[5]=new JButton("5");

        b[6]=new JButton("6");

        b[7]=new JButton("-");

        b[8]=new JButton("7");

        b[9]=new JButton("8");

        b[10]=new JButton("9");

        b[11]=new JButton("*");

        b[12]=new JButton("0");

        b[13]=new JButton(".");

        b[14]=new JButton("=");

        b[15]=new JButton("/");

        b[16]=new JButton("Delete");

        b[17]=new JButton("Clear");

	JPanel p=new JPanel(); 

        p.setLayout(new GridLayout(4,4,5,5));

	for(int i=0;i<16;i++)

	p.add(b[i]);

       

        setLayout(new FlowLayout());

	add(t);add(p);add( b[16]);add( b[17]);

        setVisible(true);

  	setTitle("Simple Calculator");

        setSize(250,300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

        for(int i=0;i<18;i++)

        b[i].addActionListener(this);

        

    }

 

    public void actionPerformed(ActionEvent e)

    {

        if(e.getSource()==b[0])

            t.setText(t.getText().concat("1"));

        

        if(e.getSource()==b[1])

            t.setText(t.getText().concat("2"));

        

        if(e.getSource()==b[2])

            t.setText(t.getText().concat("3"));

        

        if(e.getSource()==b[4])

            t.setText(t.getText().concat("4"));

        

        if(e.getSource()==b[5])

            t.setText(t.getText().concat("5"));

        

        if(e.getSource()==b[6])

            t.setText(t.getText().concat("6"));

        

        if(e.getSource()==b[8])

            t.setText(t.getText().concat("7"));

        

        if(e.getSource()==b[9])

            t.setText(t.getText().concat("8"));

        

        if(e.getSource()==b[10])

            t.setText(t.getText().concat("9"));

        

        if(e.getSource()==b[12])

            t.setText(t.getText().concat("0"));

        

        if(e.getSource()==b[13])

            t.setText(t.getText().concat("."));

        

        if(e.getSource()==b[3])

        {

            a=Double.parseDouble(t.getText());

            operator=1;

            t.setText("");

        }

        

        if(e.getSource()==b[7])

        {

            a=Double.parseDouble(t.getText());

            operator=2;

            t.setText("");

        }

        

        if(e.getSource()==b[11])

        {

            a=Double.parseDouble(t.getText());

            operator=3;

            t.setText("");

        }

        

        if(e.getSource()==b[15])

        {

            a=Double.parseDouble(t.getText());

            operator=4;

            t.setText("");

        }

        

        if(e.getSource()==b[14])

        {

            c=Double.parseDouble(t.getText());

        

            switch(operator)

            {

                case 1: result=a+c;

                    break;

        

                case 2: result=a-c;

                    break;

        

                case 3: result=a*c;

                    break;

        

                case 4: result=a/c;

                    break;

        

                default: result=0;

            }

        

            t.setText(""+result);

        }

        

        if(e.getSource()==b[17])

            t.setText("");

        

        if(e.getSource()==b[16])

        {

            String s=t.getText();

            t.setText("");

            for(int i=0;i<s.length()-1;i++)

            t.setText(t.getText()+s.charAt(i));

        }        

    }

 

    public static void main(String args[])

    {

        new Sli12();

    }

}