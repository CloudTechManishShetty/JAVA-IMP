import java.awt.*; 

 class Slip16_2 extends Frame 

 { 

        Slip16_2() 

       { 

            setLayout(new FlowLayout());

	    MenuBar mb=new MenuBar();  

            Menu menuFile = new Menu("File"); 

            Menu menuEdit = new Menu("Edit"); 

            Menu menuView = new Menu("About"); 

	    MenuItem  m1= new MenuItem ("New"); 

            MenuItem  m2= new MenuItem ("Open"); 

            MenuItem  m3= new MenuItem ("Save");

	    MenuItem  m4= new MenuItem ("Show About"); 

            MenuItem  m5= new MenuItem ("Exit"); 

            menuFile.add(m1); 

            menuFile.add(m2); 

            menuFile.add(m3);

	menuFile.addSeparator();

	menuFile.add(m4);

	menuFile.addSeparator();

	menuFile.add(m5);

 

         

	    mb.add(menuFile);

	    mb.add(menuEdit);

	    mb.add(menuView);

	    setMenuBar(mb); 

	    setTitle("Java AWT Example"); 

            setSize(300,100); 

            setResizable(false); 

            setVisible(true); 

      }

      public static void main(String args[]) 

      { 

            new Slip16_2();           

      } 

   }  


