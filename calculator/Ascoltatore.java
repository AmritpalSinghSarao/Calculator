import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;





public class Ascoltatore extends JFrame implements ActionListener{

	interfaceCalculator f; 
	
	sum s1=new sum();
	
	
	 
	 public Ascoltatore(interfaceCalculator f) {
		 
		 this.f=f;
		 
	 }
	@Override
	
	
	public void actionPerformed(ActionEvent e) {
	
		String s=f.text.getText()+e.getActionCommand();
		f.text.setText(s);
		if(e.getActionCommand()=="=") {
			
			
			float result=(float) s1.resultOf(s);
			String resultString=Float.toString(result);
			f.text.setText(resultString);

			
		   
		}
if(e.getActionCommand()=="Cancel") {
			
		
			f.text.setText("");

			
		   
		}
				
		
		
}
	
	
	
	
}
	

	
		
	
	


