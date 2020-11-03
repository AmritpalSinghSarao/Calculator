import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class interfaceCalculator extends JFrame {
	
	JPanel j=new JPanel();
	JPanel j1=new JPanel();
    JTextField text=new JTextField(20);
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bm,bp,bmul,bd,bu,bc;
	
	public interfaceCalculator() {
		super("Calculator");
		 
		j.setLayout(new FlowLayout());
		j1.setLayout(new GridLayout(6,3));
		
		
		j1.add(b1=new JButton("1"));
		j1.add(b2=new JButton("2"));
		j1.add(b3=new JButton("3"));
		j1.add(b4=new JButton("4"));
		j1.add(b5=new JButton("5"));
		j1.add(b6=new JButton("6"));
		j1.add(b7=new JButton("7"));
		j1.add(b8=new JButton("8"));
		j1.add(b9=new JButton("9"));
		j1.add(bmul=new JButton("*"));
		j1.add(b0=new JButton("0"));
		j1.add(bm=new JButton("-"));
		j1.add(bp=new JButton("+"));
		j1.add(bd=new JButton("/"));
		j1.add(bu=new JButton("="));
		j1.add(bc=new JButton("Cancel"));
		
		b0.addActionListener(new Ascoltatore(this));
		b1.addActionListener(new Ascoltatore(this));
		b2.addActionListener(new Ascoltatore(this));
		b3.addActionListener(new Ascoltatore(this));
		b4.addActionListener(new Ascoltatore(this));
		b5.addActionListener(new Ascoltatore(this));
		b6.addActionListener(new Ascoltatore(this));
		b7.addActionListener(new Ascoltatore(this));
		b8.addActionListener(new Ascoltatore(this));
		b9.addActionListener(new Ascoltatore(this));
		bmul.addActionListener(new Ascoltatore(this));
		bm.addActionListener(new Ascoltatore(this));
		bp.addActionListener(new Ascoltatore(this));
		bd.addActionListener(new Ascoltatore(this));
		bu.addActionListener(new Ascoltatore(this));
		bc.addActionListener(new Ascoltatore(this));
		
		

	
		
		getContentPane().add(j,BorderLayout.NORTH);
		
		getContentPane().add(j1,BorderLayout.SOUTH);
		
		j.add(text);
		
		
		
		pack();
		
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		
		
		
	}

}
