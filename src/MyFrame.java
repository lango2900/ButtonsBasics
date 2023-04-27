import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrame(){

        ImageIcon icon = new ImageIcon("HandsUp.png");
        ImageIcon icon2 = new ImageIcon("MILLERTIME.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(100,250,250,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,250,105);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setText("press me");
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-10);
        button.setForeground(Color.black);
        button.setBackground(Color.magenta);
        button.setBorder(BorderFactory.createEtchedBorder());




        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("balls");
            label.setVisible(true);
            //button.setEnabled(false); // makes it so button can only be pressed once
        }
    }
}



