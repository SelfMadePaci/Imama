import javax.swing.*;
import java.awt.*;

public class DonationPage extends JFrame {

    public DonationPage() {
        setTitle("Donate to Imama Nutrition");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("Make a Donation", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 16));

        JTextField nameField = new JTextField();
        JTextField amountField = new JTextField();

        JButton donateButton = new JButton("Donate Now");
        donateButton.addActionListener(e -> {
            String name = nameField.getText();
            String amount = amountField.getText();
            JOptionPane.showMessageDialog(this, "Thank you, " + name + ", for donating R" + amount + "!");
        });

        JPanel form = new JPanel(new GridLayout(3, 2, 10, 10));
        form.add(new JLabel("Full Name:"));
        form.add(nameField);
        form.add(new JLabel("Donation Amount (R):"));
        form.add(amountField);
        form.add(new JLabel(""));
        form.add(donateButton);

        form.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(title, BorderLayout.NORTH);
        add(form, BorderLayout.CENTER);
        setVisible(true);
    }
}
