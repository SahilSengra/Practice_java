package SnakeGame;

import javax.swing.*;
import java.awt.*;

;

public class Snake extends JFrame {
    GridBagConstraints gridConstraints = new GridBagConstraints();
    private JPanel developerPanel = new JPanel();
    private JLabel db = new JLabel("Developed By ");
    private  JLabel name = new JLabel("Sahil_Sengra");
    public Snake() {
        initUI();
    }

    private void initUI() {
        setDeveloperInfo();
        getContentPane().add(new Board(),BorderLayout.CENTER);
        getContentPane().add(developerPanel,BorderLayout.SOUTH);
        setResizable(false);
        pack();
        setTitle("Snake Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setDeveloperInfo(){
        db.setFont(new Font("Arial",Font.PLAIN,18));
        developerPanel.add(db);
        name.setFont(new Font("Cursive",Font.BOLD+Font.ITALIC,30));
        name.setForeground(Color.BLUE);
        developerPanel.add(name);
    }

    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }
        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }

}

