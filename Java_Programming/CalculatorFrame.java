import javax.swing.*;
import java.awt.event.*;

class MarvellousCalculator implements ActionListener 
{

    // Characteristics
    JFrame fobj;
    JButton btnAdd, btnSub, btnMult, btnDiv;
    JTextField t1obj, t2obj;
    JLabel Num1label, Num2label, Resultlabel;

    public MarvellousCalculator(String title, int width, int height) 
    {
        fobj = new JFrame(title);
        fobj.setSize(width, height);

        Num1label = new JLabel("NumbPer1");
        Num1label.setBounds(50, 50, 100, 30);

        t1obj = new JTextField();
        t1obj.setBounds(150, 50, 150, 30);

        Num2label = new JLabel("Number2");
        Num2label.setBounds(50, 100, 100, 30);

        t2obj = new JTextField();
        t2obj.setBounds(150, 100, 150, 30);

        btnAdd = new JButton("+");
        btnAdd.setBounds(50, 150, 80, 30);

        btnSub = new JButton("-");
        btnSub.setBounds(150, 150, 80, 30);

        btnMult = new JButton("*");
        btnMult.setBounds(250, 150, 80, 30);

        btnDiv = new JButton("/");
        btnDiv.setBounds(350, 150, 80, 30);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(150, 200, 250, 30);

        fobj.add(btnAdd);
        fobj.add(btnSub);
        fobj.add(btnMult);
        fobj.add(btnDiv);
        fobj.add(t1obj);
        fobj.add(t2obj);
        fobj.add(Num1label);
        fobj.add(Num2label);
        fobj.add(Resultlabel);

        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnMult.addActionListener(this);
        btnDiv.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width, height);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Number1 : 10
    // Number2 : 11

    public void actionPerformed(ActionEvent aobj) 
    {
        try 
        {
            int num1 = Integer.parseInt(t1obj.getText());
            int num2 = Integer.parseInt(t2obj.getText());
            double result = 0;

            if (aobj.getSource() == btnAdd) 
            {
                result = num1 + num2;
                Resultlabel.setText("Addition: " + result);
            } 
            else if (aobj.getSource() == btnSub) 
            {
                result = num1 - num2;
                Resultlabel.setText("Subtraction: " + result);
            } 
            else if (aobj.getSource() == btnMult)
            {
                result = num1 * num2;
                Resultlabel.setText("Multiplication: " + result);
            } 
            else if (aobj.getSource() == btnDiv)
            {
                if (num2 == 0) 
                {
                    Resultlabel.setText("Cannot divide by zero!");
                } 
                else
                {
                    result = (double) num1 / num2;
                    Resultlabel.setText("Division: " + result);
                }
            }
        }
        catch (Exception eobj) 
        {
            Resultlabel.setText("Please enter valid numbers!");
        }
    }
}

class CalculatorFrame
{
    public static void main(String A[])
    {
        MarvellousCalculator mobj = new MarvellousCalculator("Calculator", 500, 300);
    }
}
