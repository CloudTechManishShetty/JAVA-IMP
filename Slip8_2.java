import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

	 

	public class Slip8_2 implements MouseListener,MouseMotionListener

	{

	JTextField t1;

	String msg="";

	    Slip8_2()

	    {

	 

	        // Create and set up the window.

	        JFrame frame = new JFrame("MouseListenerExample");

	 

	        // Display the window.

	        frame.setLayout(new FlowLayout());

		t1=new JTextField (30);

		frame.addMouseListener(this);

		frame.addMouseMotionListener(this);

		frame.add(t1);

		

	 	frame.setSize(500,300);

	        frame.setVisible(true);

	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    }

		public void mouseClicked(MouseEvent me) 

		{

		msg = "Mouse clicked at X = "+me.getX()+" Y = "+me.getY();

		t1.setText(msg);

		}

		public void mouseEntered(MouseEvent me) {}

public void mouseExited(MouseEvent me) {}



// Handle button pressed.

public void mousePressed(MouseEvent me) {}



// Handle button released.

public void mouseReleased(MouseEvent me) {}

// Handle mouse dragged.

public void mouseDragged(MouseEvent me) {}

// Handle mouse moved.

public void mouseMoved(MouseEvent me)

 {

msg = "Mouse Moved at X = "+me.getX()+" Y = "+me.getY();

		t1.setText(msg);

}

	    	public static void main(String[] args)

		 {

	 	 		new Slip8_2 ();

    	}

	}