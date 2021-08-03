/**
 * Dice Rolling Application: This application can roll dice of differing sides and handle coin tosses.
 * 							 Users also have the option to roll multiple dice at once by entering a number in the smaller left-most field,
 * 							 which is displayed in the result field.
 * 
 * Author: Sidney Henderson
 * 
 */

import java.awt.event.*;  
import javax.swing.*;  

public class Main {

	public static void main(String[] args) {
		
		JFrame f=new JFrame("Dice Roller");  
		
	    //d4 button and text field ***************************************************
	    final JTextField tf=new JTextField();  
	    tf.setBounds(80,50, 220,20);	    
	    final JTextField tfCount=new JTextField("1");  
	    tfCount.setBounds(40,50, 20,20);	
	    JButton b=new JButton("Roll a d4");  
	    b.setBounds(50,70, 95,30);  // d4 button location/size
	    b.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e){  
			String s=tfCount.getText();  
    		if (tfCount.getText().isBlank() || (java.util.regex.Pattern.matches("\\d+", s) == false)) { // <-- Prevents blank entries and non-numeric entries
				tfCount.setText("1");
				D6Obj d4roll = new D6Obj();       
				tf.setText(d4roll.roll(1)); 
    		}
    		else {
			int a=Integer.parseInt(s);
			if (a > 10) { // <-- User cannot roll more than 10 dice.
				a = 10;
			}	
			D4Obj d4roll = new D4Obj();       
			tf.setText(d4roll.roll(a));  
	        }  
		}
	});  
	    
	    //*** d6 button and text field ***************************************************
	    final JTextField tf2=new JTextField();  
	    tf2.setBounds(80,130, 220,20); //d6 text-field location
	    final JTextField tfCount2=new JTextField("1");  
	    tfCount2.setBounds(40,130, 20,20);
	    JButton b2=new JButton("Roll a d6");
	    b2.setBounds(50,150, 95,30);
	    b2.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e2){  
	    		String s=tfCount2.getText(); 
	    		if (tfCount2.getText().isBlank() || (java.util.regex.Pattern.matches("\\d+", s) == false)) { // <-- Prevents blank entries and non-numeric entries
					tfCount2.setText("1");
					D6Obj d6roll = new D6Obj();       
					tf2.setText(d6roll.roll(1)); 
	    		}
	    		else {
				int a=Integer.parseInt(s);
				if (a > 10) { // <-- User cannot roll more than 10 dice.
					a = 10;
				}
				D6Obj d6roll = new D6Obj();       
				tf2.setText(d6roll.roll(a));  
	    		}
	    	}  
	    });
	    
	  //d8 button and text field ***************************************************
	    final JTextField tf3=new JTextField();  
	    tf3.setBounds(80,210, 220,20); //d8 text-field location
	    final JTextField tfCount3=new JTextField("1");
	    tfCount3.setBounds(40,210, 20,20);
	    JButton b3=new JButton("Roll a d8");  
	    b3.setBounds(50,230, 95,30);  
	    b3.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e3){  
	    		String s=tfCount3.getText(); 
	    		if (tfCount3.getText().isBlank() || (java.util.regex.Pattern.matches("\\d+", s) == false)) { // <-- Prevents blank entries and non-numeric entries
					tfCount3.setText("1");
					D8Obj d8roll = new D8Obj();       
					tf3.setText(d8roll.roll(1)); 
	    		}
	    		else {
				int a=Integer.parseInt(s);
				if (a > 10) { // <-- User cannot roll more than 10 dice.
					a = 10;
				}
				D8Obj d8roll = new D8Obj();       
				tf3.setText(d8roll.roll(a));  
	    		}
	    	}  
	    });
	    
	  //d10 button and text field
	    final JTextField tf4=new JTextField();  
	    tf4.setBounds(80,290, 220,20); //d10 text-field location
	    final JTextField tfCount4=new JTextField("1");
	    tfCount4.setBounds(40,290, 20,20);
	    JButton b4=new JButton("Roll a d10");  
	    b4.setBounds(50,310, 95,30);  
	    b4.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e4){  
	    		String s=tfCount4.getText(); 
	    		if (tfCount4.getText().isBlank() || (java.util.regex.Pattern.matches("\\d+", s) == false)) { // <-- Prevents blank entries and non-numeric entries
					tfCount4.setText("1");
					D10Obj d10roll = new D10Obj();       
					tf4.setText(d10roll.roll(1)); 
	    		}
	    		else {
				int a=Integer.parseInt(s);
				if (a > 10) { // <-- User cannot roll more than 10 dice.
					a = 10;
				}
				D10Obj d10roll = new D10Obj();       
				tf4.setText(d10roll.roll(a));  
	    		}
	    	}  
	    });
	    
	  //d12 button and text field
	    final JTextField tf5=new JTextField();  
	    tf5.setBounds(80,370, 220,20); //d12 text-field location
	    final JTextField tfCount5=new JTextField("1");
	    tfCount5.setBounds(40,370, 20,20);
	    JButton b5=new JButton("Roll a d12");  
	    b5.setBounds(50,390, 95,30);  
	    b5.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e5){  
	    		String s=tfCount5.getText(); 
	    		if (tfCount5.getText().isBlank() || (java.util.regex.Pattern.matches("\\d+", s) == false)) { // <-- Prevents blank entries and non-numeric entries
					tfCount5.setText("1");
					D12Obj d12roll = new D12Obj();       
					tf5.setText(d12roll.roll(1)); 
	    		}
	    		else {
				int a=Integer.parseInt(s);
				if (a > 10) { // <-- User cannot roll more than 10 dice.
					a = 10;
				}
				D12Obj d12roll = new D12Obj();       
				tf5.setText(d12roll.roll(a));  
	    		}
	    	}  
	    });
	    
	  //d20 button and text field
	    final JTextField tf6=new JTextField();  
	    tf6.setBounds(80,450, 220,20); //d20 text-field location
	    final JTextField tfCount6=new JTextField("1");
	    tfCount6.setBounds(40,450, 20,20);
	    JButton b6=new JButton("Roll a d20");  
	    b6.setBounds(50,470, 95,30);  
	    b6.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e6){  
	    		String s=tfCount6.getText(); 
	    		if (tfCount6.getText().isBlank() || (java.util.regex.Pattern.matches("\\d+", s) == false)) { // <-- Prevents blank entries and non-numeric entries
					tfCount6.setText("1");
					D20Obj d20roll = new D20Obj();       
					tf6.setText(d20roll.roll(1)); 
	    		}
	    		else {
				int a=Integer.parseInt(s);
				if (a > 10) { // <-- User cannot roll more than 10 dice.
					a = 10;
				}
				D20Obj d20roll = new D20Obj();       
				tf6.setText(d20roll.roll(a));  
	    		}
	    	}  
	    });
	    
	  //coin-flip button and text field
	    final JTextField tf7=new JTextField();  
	    tf7.setBounds(80,530, 220,20); //coin flip text-field location
	    

	    JButton b7=new JButton("Flip a coin.");  
	    b7.setBounds(50,550, 95,30);  
	    b7.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e7){  
					CoinObj coinObj = new CoinObj();       
					tf7.setText(coinObj.flip());
					
	    		} 	  
	    });
	    f.add(b);f.add(tf); f.add(tfCount); //button and field 1; d4
	    f.add(b2);f.add(tf2); f.add(tfCount2); //button and field 2; d6
	    f.add(b3);f.add(tf3); f.add(tfCount3); //button and field 3; d8
	    f.add(b4);f.add(tf4); f.add(tfCount4); //button and field 4; d10
	    f.add(b5);f.add(tf5); f.add(tfCount5); //button and field 5; d12
	    f.add(b6);f.add(tf6); f.add(tfCount6); //button and field 6; d20
	    f.add(b7);f.add(tf7); //button and field 7; coin flips
	    
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setSize(400,800);
	    f.setLayout(null);  
	    f.setVisible(true);
       
	}
}