import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame
{
    private JTextArea display;

    private JButton decimal;
    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton posneg;

    private JButton equals;
    private JButton multiply;
    private JButton divide;
    private JButton minus;
    private JButton add;
    private JButton clear;

    private double tempFirst = 0.0;
    private boolean[] operation = new boolean[4];


    public static void main(String[] args)
    {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e){
            System.out.println("Could't find ur shit theme");
        }
        new Main();
    }
    private Main()
    {
        SendDisplay();
        SendButtons();
        SendUI(this);


    }
    private void SendDisplay()
    {
        display = new JTextArea("0");
        display.setBounds(10,15,320,40);
        display.setEditable(false);
        //display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        display.setFont(new Font("Arial", Font.PLAIN, 30));
        add(display);
    }
    private void SendButtons()
    {
        posneg = new JButton("+/-");
        posneg.setBounds(154,256,65,55);
        posneg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().equalsIgnoreCase("0"))
                    return;
                display.setText(Double.toString(Double.parseDouble(display.getText()) * (-1)));
                if(display.getText().endsWith(".0"))
                    display.setText(display.getText().replace(".0", ""));
            }

        });
        add(posneg);
        decimal = new JButton(".");
        decimal.setBounds(10,256,65,55);
        decimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().contains("."))
                    return;
                display.append(".");
            }
        });
        add(decimal);
        zero = new JButton("0");
        zero.setBounds(82,256,65,55);
        zero.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(display.getText().length() > 12)
                    return;
                if(display.getText().equalsIgnoreCase("0")){
                    display.setText("0");
                    return;
                }
                display.append("0");
            }
        });
        add(zero);
        one = new JButton("1");
        one.setBounds(10,194,65,55);
        one.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(display.getText().length() > 13)
                    return;
                if(display.getText().equalsIgnoreCase("0")){
                    display.setText("1");
                    return;
                }
                display.append("1");
            }
        });
        add(one);
        two = new JButton("2");
        two.setBounds(82,194,65,55);
        two.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(display.getText().length() > 13)
                    return;
                if(display.getText().equalsIgnoreCase("0")){
                    display.setText("2");
                    return;
                }
                display.append("2");
            }
        });
        add(two);
        three = new JButton("3");
        three.setBounds(154,194,65,55);
        three.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(display.getText().length() > 13)
                    return;
                if(display.getText().equalsIgnoreCase("0")){
                    display.setText("3");
                    return;
                }
                display.append("3");
            }
        });
        add(three);
        four = new JButton("4");
        four.setBounds(10, 132,65,55);
        four.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(display.getText().length() > 13)
                    return;
                if(display.getText().equalsIgnoreCase("0")){
                    display.setText("4");
                    return;
                }
                display.append("4");
            }
        });
        add(four);
        five = new JButton("5");
        five.setBounds(82,132,65,55);
        five.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(display.getText().length() > 13)
                    return;
                if(display.getText().equalsIgnoreCase("0")){
                    display.setText("5");
                    return;
                }
                display.append("5");
            }
        });
        add(five);
        six = new JButton("6");
        six.setBounds(154,132,65,55);
        six.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(display.getText().length() > 13)
                    return;
                if(display.getText().equalsIgnoreCase("0")){
                    display.setText("6");
                    return;
                }
                display.append("6");
            }
        });
        add(six);
        seven = new JButton("7");
        seven.setBounds(10, 70, 65,55);
        seven.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(display.getText().length() > 13)
                    return;
                if(display.getText().equalsIgnoreCase("0")){
                    display.setText("7");
                    return;
                }
                display.append("7");
            }
        });
        add(seven);
        eight = new JButton("8");
        eight.setBounds(82,70,65,55);
        eight.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(display.getText().length() > 13)
                    return;
                if(display.getText().equalsIgnoreCase("0")){
                    display.setText("8");
                    return;
                }
                display.append("8");
            }
        });
        add(eight);
        nine = new JButton("9");
        nine.setBounds(154,70,65,55);
        nine.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(display.getText().length() > 13)
                    return;
                if(display.getText().equalsIgnoreCase("0")){
                    display.setText("9");
                    return;
                }
                display.append("9");
            }
        });
        add(nine);
        equals = new JButton("=");
        equals.setBounds(10,318,138,55);
        equals.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(operation[0]) {
                    display.setText(Double.toString(getTempFirst() / Double.parseDouble(display.getText())));
                    operation[0] = false;
                }
                if(operation[1]) {
                    display.setText(Double.toString(getTempFirst() * Double.parseDouble(display.getText())));
                    operation[1] = false;
                }

                if(operation[2]) {
                    display.setText(Double.toString(getTempFirst() + Double.parseDouble(display.getText())));
                    operation[2]= false;
                }

                if(operation[3]) {
                    display.setText(Double.toString(getTempFirst() - Double.parseDouble(display.getText())));
                    operation[3]= false;
                }
                setTempFirst(0.0);
            }
        });
        add(equals);

        multiply = new JButton("x");
        multiply.setBounds(226,132 , 65,55);
        multiply.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                operation[1] = true;
                setTempFirst(Double.parseDouble(display.getText()));
                display.setText("0");
            }
        });
        add(multiply);

        divide = new JButton("/");
        divide.setBounds(226, 70, 65, 55);
        divide.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                operation[0] = true;
                setTempFirst(Double.parseDouble(display.getText()));
                display.setText("0");
            }
        });
        add(divide);

        add = new JButton("+");
        add.setBounds(226, 194, 65, 55);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation[2] = true;
                setTempFirst(Double.parseDouble(display.getText()));
                display.setText("0");
            }
        });
        add(add);

        minus = new JButton("-");
        minus.setBounds(226, 256, 65,55 );
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operation[3] = true;
                setTempFirst(Double.parseDouble(display.getText()));
                display.setText("0");
            }
        });
        add(minus);

        clear = new JButton("clear");
        clear.setBounds(154,318,138,55 );
        add(clear);
        clear.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("0");
            }
        });
    }
    private void SendUI(Main app)
    {
        app.setTitle("Calculator");
        app.setLayout(null);
        app.setSize(320,420);
        app.setLocation(200,200);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setResizable(false);
        app.setVisible(true);


    }
    public double getTempFirst()
    {
        return tempFirst;
    }
    public void setTempFirst(double tempFirst)
    {
        this.tempFirst = tempFirst;
    }

  }