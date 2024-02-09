import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	boolean isOperatorClicked = false;
	String previousValue;
	String operator;
    
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton, eightButton, nineButton, fourButton, fiveButton, sixButton, oneButton, twoButton,clearButton, threeButton, dotButton, zeroButton, equalButton, divButton, prodButton, minusButton, addButton;
    
    public Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(455,600);
        jf.setLocation(500, 160);
        
        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 395, 60);
        displayLabel.setFont(new Font("Arial", Font.BOLD, 32));
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);
        
        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setBackground(Color.black);
        sevenButton.setFocusable(false);
        sevenButton.setForeground(Color.white);
        sevenButton.setFont(new Font("Arial", Font.BOLD, 24));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);
        
        eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.setBackground(Color.black);
        eightButton.setFocusable(false);
        eightButton.setForeground(Color.white);
        eightButton.setFont(new Font("Arial", Font.BOLD, 24));
        eightButton.addActionListener(this);
        jf.add(eightButton);
        
        nineButton = new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        nineButton.setBackground(Color.black);
        nineButton.setFocusable(false);
        nineButton.setForeground(Color.white);
        nineButton.setFont(new Font("Arial", Font.BOLD, 24));
        nineButton.addActionListener(this);
        jf.add(nineButton);
        
        fourButton = new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.setBackground(Color.black);
        fourButton.setFocusable(false);
        fourButton.setForeground(Color.white);
        fourButton.setFont(new Font("Arial", Font.BOLD, 24));
        fourButton.addActionListener(this);
        jf.add(fourButton);
        
        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.setBackground(Color.black);
        fiveButton.setFocusable(false);
        fiveButton.setForeground(Color.white);
        fiveButton.setFont(new Font("Arial", Font.BOLD, 24));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);
        
        sixButton = new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        sixButton.setBackground(Color.black);
        sixButton.setFocusable(false);
        sixButton.setForeground(Color.white);
        sixButton.setFont(new Font("Arial", Font.BOLD, 24));
        sixButton.addActionListener(this);
        jf.add(sixButton);
        
        oneButton = new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.setBackground(Color.black);
        oneButton.setFocusable(false);
        oneButton.setForeground(Color.white);
        oneButton.setFont(new Font("Arial", Font.BOLD, 24));
        oneButton.addActionListener(this);
        jf.add(oneButton);
        
        twoButton = new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.setBackground(Color.black);
        twoButton.setFocusable(false);
        twoButton.setForeground(Color.white);
        twoButton.setFont(new Font("Arial", Font.BOLD, 24));
        twoButton.addActionListener(this);
        jf.add(twoButton);
        
        threeButton = new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        threeButton.setBackground(Color.black);
        threeButton.setFocusable(false);
        threeButton.setForeground(Color.white);
        threeButton.setFont(new Font("Arial", Font.BOLD, 24));
        threeButton.addActionListener(this);
        jf.add(threeButton);
        
        dotButton = new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        dotButton.setBackground(Color.black);
        dotButton.setFocusable(false);
        dotButton.setForeground(Color.white);
        dotButton.setFont(new Font("Arial", Font.BOLD, 24));
        dotButton.addActionListener(this);
        jf.add(dotButton);
        
        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.setBackground(Color.black);
        zeroButton.setFocusable(false);
        zeroButton.setForeground(Color.white);
        zeroButton.setFont(new Font("Arial", Font.BOLD, 24));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);
        
        equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.setBackground(Color.black);
        equalButton.setFocusable(false);
        equalButton.setForeground(Color.white);
        equalButton.setFont(new Font("Arial", Font.BOLD, 24));
        equalButton.addActionListener(this);
        jf.add(equalButton);
        
      
        
        divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 60);
        divButton.setBackground(Color.ORANGE);
        divButton.setFocusable(false);
        divButton.setForeground(Color.white);
        divButton.setFont(new Font("Arial", Font.BOLD, 24));
        divButton.addActionListener(this);
        jf.add(divButton);
        
        prodButton = new JButton("x");
        prodButton.setBounds(330, 210, 80, 60);
        prodButton.setBackground(Color.ORANGE);
        prodButton.setFocusable(false);
        prodButton.setForeground(Color.white);
        prodButton.setFont(new Font("Arial", Font.BOLD, 24));
        prodButton.addActionListener(this);
        jf.add(prodButton);
        
        minusButton = new JButton("-");
        minusButton.setBounds(330, 290, 80, 60);
        minusButton.setBackground(Color.ORANGE);
        minusButton.setFocusable(false);
        minusButton.setForeground(Color.white);
        minusButton.setFont(new Font("Arial", Font.BOLD, 24));
        minusButton.addActionListener(this);
        jf.add(minusButton);
        
        addButton = new JButton("+");
        addButton.setBounds(330, 370, 80, 60);
        addButton.setBackground(Color.ORANGE);
        addButton.setFocusable(false);
        addButton.setForeground(Color.white);
        addButton.setFont(new Font("Arial", Font.BOLD, 24));
        addButton.addActionListener(this);
        jf.add(addButton);
        
        clearButton = new JButton("AC");
        clearButton.setBounds(330, 450, 80, 60);
        clearButton.setBackground(Color.red);
        clearButton.setFocusable(false);
        clearButton.setForeground(Color.white);
        clearButton.setFont(new Font("Arial", Font.BOLD, 24));
        clearButton.addActionListener(this);
        jf.add(clearButton);
        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	public static void main(String[] args) {
		 new Calculator();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == sevenButton) {
	    	
	    	if(isOperatorClicked) {
	    		displayLabel.setText("7");
	    		isOperatorClicked = false;
	    	} else {
	    		displayLabel.setText(displayLabel.getText() + "7");
	    	}
	        
	    } else if (e.getSource() == eightButton) {
	    	if(isOperatorClicked) {
	    		displayLabel.setText("8");
	    		isOperatorClicked = false;
	    	} else {
	    		displayLabel.setText(displayLabel.getText() + "8");
	    	}
	    } else if (e.getSource() == nineButton) {
	    	if(isOperatorClicked) {
	    		displayLabel.setText("9");
	    		isOperatorClicked = false;
	    	} else {
	    		displayLabel.setText(displayLabel.getText() + "9");
	    	}
	    } else if (e.getSource() == fourButton) {
	    	if(isOperatorClicked) {
	    		displayLabel.setText("4");
	    		isOperatorClicked = false;
	    	} else {
	    		displayLabel.setText(displayLabel.getText() + "4");
	    	}
	    } else if (e.getSource() == fiveButton) {
	    	if(isOperatorClicked) {
	    		displayLabel.setText("5");
	    		isOperatorClicked = false;
	    	} else {
	    		displayLabel.setText(displayLabel.getText() + "5");
	    	}
	    } else if (e.getSource() == sixButton) {
	    	if(isOperatorClicked) {
	    		displayLabel.setText("6");
	    		isOperatorClicked = false;
	    	} else {
	    		displayLabel.setText(displayLabel.getText() + "6");
	    	}
	    } else if (e.getSource() == oneButton) {
	    	if(isOperatorClicked) {
	    		displayLabel.setText("1");
	    		isOperatorClicked = false;
	    	} else {
	    		displayLabel.setText(displayLabel.getText() + "1");
	    	}
	    } else if (e.getSource() == twoButton) {
	    	if(isOperatorClicked) {
	    		displayLabel.setText("2");
	    		isOperatorClicked = false;
	    	} else {
	    		displayLabel.setText(displayLabel.getText() + "2");
	    	}
	    } else if (e.getSource() == threeButton) {
	    	if(isOperatorClicked) {
	    		displayLabel.setText("3");
	    		isOperatorClicked = false;
	    	} else {
	    		displayLabel.setText(displayLabel.getText() + "3");
	    	}
	    } else if (e.getSource() == dotButton) {
	    	if(isOperatorClicked) {
	    		displayLabel.setText(".");
	    		isOperatorClicked = false;
	    	} else {
	    		displayLabel.setText(displayLabel.getText() + ".");
	    	}
	    } else if (e.getSource() == zeroButton) {
	    	if(isOperatorClicked) {
	    		displayLabel.setText("0");
	    		isOperatorClicked = false;
	    	} else {
	    		displayLabel.setText(displayLabel.getText() + "0");
	    	}
	    } else if (e.getSource() == divButton) {
	    	isOperatorClicked = true;
	        previousValue = displayLabel.getText();
	        operator = "/";
	    } else if (e.getSource() == prodButton) {
	    	isOperatorClicked = true;
	        previousValue = displayLabel.getText();
	        operator = "*";
	    } else if (e.getSource() == minusButton) {
	    	isOperatorClicked = true;
	        previousValue = displayLabel.getText();
	        operator = "-";
	    } else if (e.getSource() == addButton) {
	        isOperatorClicked = true;
	        previousValue = displayLabel.getText();
	        operator = "+";
	    } else if (e.getSource() == clearButton) {
	    	  displayLabel.setText("");
	    } else if (e.getSource() == equalButton) {
	        String newValue = displayLabel.getText();
	        float oldValueF = Float.parseFloat(previousValue);
	        float newValueF = Float.parseFloat(newValue);
	        float result = 0;
	        if(operator.contains("+")){
	            result = oldValueF + newValueF;
	        } else if(operator.contains("-")){
	            result = oldValueF - newValueF;
	        } else if(operator.contains("*")){
	            result = oldValueF * newValueF;
	        } else if(operator.contains("/")){
	            if(newValueF == 0){
	                displayLabel.setText("Cannot divide by zero");
	                return;
	            }
	            result = oldValueF / newValueF;
	        }
	        displayLabel.setText(result+"");
	        
	    }
	}


}


