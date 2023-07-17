import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ElectricityBillingSystem extends JFrame implements ActionListener {
    // GUI components
    private JLabel meterLabel;
    private JTextField meterField;
    private JButton calculateButton;
    private JLabel usageLabel;
    private JLabel costLabel;

    // Constructor
    public ElectricityBillingSystem() {
        setTitle("Electricity Billing System");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Initialize GUI components
        meterLabel = new JLabel("Enter the number of units:");
        meterField = new JTextField(10);
        calculateButton = new JButton("Calculate");
        usageLabel = new JLabel("");
        costLabel = new JLabel("");

        // Set layout
        setLayout(new GridLayout(4, 1));

        // Add components to the frame
        add(meterLabel);
        add(meterField);
        add(calculateButton);
        add(usageLabel);
        add(costLabel);

        // Add action listener to the button
        calculateButton.addActionListener(this);
    }

    // ActionListener implementation
    public void actionPerformed(ActionEvent e) {
        // Calculate electricity usage and cost
        double units = Double.parseDouble(meterField.getText());
        double usage = units * 1.5;
        double cost = usage * 0.10;

        // Display results
        usageLabel.setText("Electricity usage: " + usage + " kWh");
        costLabel.setText("Electricity cost: " + cost + " $");
    }

    // Main method
    public static void main(String[] args) {
        // Create and show the GUI
        ElectricityBillingSystem gui = new ElectricityBillingSystem();
        gui.setVisible(true);
    }
}
