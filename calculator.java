import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import jdk.incubator.vector.VectorOperators.Operator;



public class calculator implements ActionListener {
    Boolean isOperatorClicked=false; 
    String  oldValue;
    char operator;
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton,clearButton;
    JButton threeButton;
    JButton twoButton;
    JButton oneButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton mulButton;
    JButton minusButton;
    JButton plusButton;




    public calculator(){
        jf=new JFrame("calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300, 150);
        displayLabel =new JLabel();
        displayLabel.setBounds(30, 50,540,40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        sevenButton=new JButton("7");
        sevenButton.setBounds(30,130,80,80);
        sevenButton.addActionListener(this);
        sevenButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(sevenButton);
        
        eightButton=new JButton("8");
        eightButton.setBounds(130,130,80,80);
        eightButton.addActionListener(this);
        eightButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(eightButton);
        
        nineButton=new JButton("9");
        nineButton.setBounds(230,130,80,80);
        nineButton.addActionListener(this);
        nineButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(nineButton);
        
        fourButton=new JButton("4");
        fourButton.setBounds(30,230,80,80);
        fourButton.addActionListener(this);
        fourButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(fourButton);
        
        fiveButton=new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        fiveButton.addActionListener(this);
        fiveButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(fiveButton);
        
        sixButton=new JButton("6");
        sixButton.setBounds(230,230,80,80);
        sixButton.addActionListener(this);
        sixButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(sixButton);

        threeButton=new JButton("3");
        threeButton.setBounds(30,330,80,80);
        threeButton.addActionListener(this);
        threeButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(threeButton);
        
        twoButton=new JButton("2");
        twoButton.setBounds(130,330,80,80);
        twoButton.addActionListener(this);
        twoButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(twoButton);
        
        oneButton=new JButton("1");
        oneButton.setBounds(230,330,80,80);
        oneButton.addActionListener(this);
        oneButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(oneButton);

        dotButton=new JButton(".");
        dotButton.setBounds(30,430,80,80);
        dotButton.addActionListener(this);
        dotButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(dotButton);
        
        zeroButton=new JButton("0");
        zeroButton.setBounds(130,430,80,80);
        zeroButton.addActionListener(this);
        zeroButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(zeroButton);
        
        equalButton=new JButton("=");
        equalButton.setBounds(230,430,80,80);
        equalButton.addActionListener(this);
        equalButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(equalButton);

        divButton=new JButton("/");
        divButton.setBounds(330,130,80,80);
        divButton.addActionListener(this);
        divButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(divButton);

        mulButton=new JButton("x");
        mulButton.setBounds(330,230,80,80);
        mulButton.addActionListener(this);
        mulButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(mulButton);

        minusButton=new JButton("-");
        minusButton.setBounds(330,330,80,80);
        minusButton.addActionListener(this);
        minusButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(minusButton);

        plusButton=new JButton("+");
        plusButton.setBounds(330,430,80,80);
        plusButton.addActionListener(this);
        plusButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(plusButton);

        clearButton=new JButton("C");
        clearButton.setBounds(430,430,80,80);
        clearButton.addActionListener(this);
        clearButton.setFont(new Font("Areal",Font.PLAIN,40));
        jf.add(clearButton);
        
    

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         
     }
    public static void main(String[] args) {
        new calculator();
    }
      
    

    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==eightButton){
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked=false;

            }else{
                displayLabel.setText(displayLabel.getText()+"8");
            }

        }else if(e.getSource()==sevenButton){

            if(e.getSource()==sevenButton){
                if(isOperatorClicked==true){
                    displayLabel.setText("7");
                    isOperatorClicked=false;
    
                }else{
                    displayLabel.setText(displayLabel.getText()+"7");
                }
            }
 
        }else if(e.getSource()==nineButton){
            if(e.getSource()==nineButton){
                if(isOperatorClicked==true){
                    displayLabel.setText("9");
                    isOperatorClicked=false;
    
                }else{
                    displayLabel.setText(displayLabel.getText()+"9");
                }
            }
        }else if(e.getSource()==fourButton){
            if(e.getSource()==fourButton){
                if(isOperatorClicked==true){
                    displayLabel.setText("4");
                    isOperatorClicked=false;
    
                }else{
                    displayLabel.setText(displayLabel.getText()+"4");
                }
            }
 
        }else if(e.getSource()==fiveButton){
            if(e.getSource()==fiveButton){
                if(isOperatorClicked==true){
                    displayLabel.setText("5");
                    isOperatorClicked=false;
    
                }else{
                    displayLabel.setText(displayLabel.getText()+"5");
                }
    
            }
        }else if(e.getSource()==sixButton){
            if(e.getSource()==sixButton){
                if(isOperatorClicked==true){
                    displayLabel.setText("6");
                    isOperatorClicked=false;
    
                }else{
                    displayLabel.setText(displayLabel.getText()+"6");
                }
            }
 
        }else if(e.getSource()==oneButton){
            if(e.getSource()==oneButton){
                if(isOperatorClicked==true){
                    displayLabel.setText("1");
                    isOperatorClicked=false;
    
                }else{
                    displayLabel.setText(displayLabel.getText()+"1");
                }
            }
 
        }else if(e.getSource()==twoButton){
            if(e.getSource()==twoButton){
                if(isOperatorClicked==true){
                    displayLabel.setText("2");
                    isOperatorClicked=false;
    
                }else{
                    displayLabel.setText(displayLabel.getText()+"2");
                }
            }
 
        }else if(e.getSource()==threeButton){
            if(e.getSource()==threeButton){
                if(isOperatorClicked==true){
                    displayLabel.setText("3");
                    isOperatorClicked=false;
    
                }else{
                    displayLabel.setText(displayLabel.getText()+"3");
                }
            }
 
        }else if(e.getSource()==oneButton){
            if(e.getSource()==oneButton){
                if(isOperatorClicked==true){
                    displayLabel.setText("1");
                    isOperatorClicked=false;
    
                }else{
                    displayLabel.setText(displayLabel.getText()+"1");
                }
            }
        }else if(e.getSource()==dotButton){
            displayLabel.setText(displayLabel.getText()+".");
 
        
        }else if(e.getSource()==equalButton){
            String newValue=displayLabel.getText();
            float oldValueF=Float.parseFloat(oldValue);
            float newValueF=Float.parseFloat(newValue);
            float result=oldValueF+newValueF;
            displayLabel.setText(result+"");
        
        }else if(e.getSource()==plusButton){
            isOperatorClicked=true;
            operator=p;
            oldValue=displayLabel.getText();

 
        }else if(e.getSource()==minusButton){
 
        }else if(e.getSource()==mulButton){
           
        }else if(e.getSource()==divButton){
 
        }else if(e.getSource()==clearButton){
            displayLabel.setText("");

 
        }
    }
    
      
  
     
    
}
