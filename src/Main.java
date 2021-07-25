import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener{

    //DECLARE THE Javax Swing variables
    JFrame frame;
    JButton [] numberButtons = new JButton[10];
    JButton [] functionButton = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    JPanel panel;
    JTextField field;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);
    double num1=0,num2=0,result=0;
    char operator;

    //class contructor
    Main(){
        //create the frame for the calculator with it's parameters
        frame  = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);


        //create the field for the number display
        field = new JTextField();
        field.setBounds(50, 25, 300, 50);
        field.setFont(myFont);
        field.setEditable(false);

        //create the buttons needed for the calculator
        addButton  = new JButton("+");
        subButton  = new JButton("-");
        mulButton  = new JButton("x");
        divButton  = new JButton("/");
        decButton  = new JButton(".");
        equButton  = new JButton("=");
        delButton  = new JButton("DEL");
        clrButton  = new JButton("CLR");
        negButton  = new JButton("(-)");

        //store the buttons into the array declares for function buttons
        functionButton[0] = addButton;
        functionButton[1] = subButton;
        functionButton[2] = mulButton;
        functionButton[3] = divButton;
        functionButton[4] = decButton;
        functionButton[5] = equButton;
        functionButton[6] = delButton;
        functionButton[7] = clrButton;
        functionButton[8] = negButton;


        for(int i = 0; i<9 ; i++){
            functionButton[i].addActionListener(this);
            functionButton[i].setFont(myFont);
            functionButton[i].setFocusable(false);

        }
        for(int i = 0; i<10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        negButton.setBounds(50,430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250,430, 100, 50);


        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.setBackground(Color.WHITE);

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);



        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(field);
        frame.setVisible(true);
    }

    public static void main(String[] args){

        Main Calculator = new Main();
        System.out.println("Hello World, I am back to Java!!");

        System.out.println("Finally everything works!!!");
    }

    static void addition(){
        //read 2 input and return a addition of the number
        //read 2 numbers and return a addition of the previous number
        //read multiple input and return the total summation\

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //A for loop to run every time a button is hit and display the value of the button onto the text field
        for(int i = 0; i<10; i++){
            if(e.getSource() == numberButtons[i]){
                field.setText(field.getText().concat(String.valueOf(i)));
            }
        }

        //an if statement to capture the decimal button and display a decimal on the textfield
        if(e.getSource() == decButton){
            field.setText(field.getText().concat("."));
        }
        //an if statement to capture the add button and display a decimal on the textfield
        if(e.getSource() == addButton){
            num1 = Double.parseDouble(field.getText());
            operator = '+';
            field.setText("");
        }

        //an if statement to capture the minus button and display a decimal on the textfield
        if(e.getSource() == subButton){
            num1 = Double.parseDouble(field.getText());
            operator = '-';
            field.setText("");
        }

        //an if statement to capture the multiply  button and display a decimal on the textfield
        if(e.getSource() == mulButton){
            num1 = Double.parseDouble(field.getText());
            operator = '*';
            field.setText("");
        }

        //an if statement to capture the divide  button and display a decimal on the textfield
        if(e.getSource() == divButton){
            num1 = Double.parseDouble(field.getText());
            operator = '/';
            field.setText("");
        }

        //an if statement to capture the equal  button and display a decimal on the textfield
        if(e.getSource() == equButton){
            num2 = Double.parseDouble(field.getText());
            //operator = '=';
            //field.setText("");

            switch(operator){
                case '+' :
                    result =num1+num2;
                    break;
                case'-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    result = num1/num2;
                    break;

            }
            field.setText(String.valueOf(result));
            num1 = result;
        }

        //an if statement to capture the clear  button and display a decimal on the textfield
        if(e.getSource() == clrButton){

            field.setText("");
        }

        //an if statement to capture the delete  button and display a decimal on the textfield
        if(e.getSource() == delButton){
            String string = field.getText();
            field.setText("");
            for(int i = 0; i <string.length()-1;i++){
                field.setText(field.getText()+string.charAt(i));

            }
        }

        //an if statement to capture the delete  button and display a decimal on the textfield
        if(e.getSource() == negButton){
            double temp = Double.parseDouble(field.getText());
            temp*= -1;
            field.setText(String.valueOf(temp));

        }
    }



}

