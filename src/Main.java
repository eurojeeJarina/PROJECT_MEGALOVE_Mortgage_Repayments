import javax.swing.*;
import java.awt.*;

/*
* HOW TO CALCULATE MORTGAGE REPAYMENTS:
* M = P [i(1+i)^n]/[(1+i)^n-1]
* */

public class Main extends JFrame {



    public static void main(String[] args) {
        int a, b;
        JButton calculateBtn;
        JTextField firstInputField, secondInputField;
        JPanel mainPanel;

        JFrame f = new JFrame();
        mainPanel = new JPanel();
        calculateBtn = new JButton("Calulate");


        mainPanel.add(calculateBtn);
        mainPanel.setSize(200,220);
        mainPanel.setBackground(Color.BLUE);

        f.add(mainPanel);
        f.setSize(400,500);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminates java programm
        f.setLayout(null);
        f.setVisible(true);



    }

}
