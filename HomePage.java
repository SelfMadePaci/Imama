import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame {

    public HomePage() {
        setTitle("Imama Nutrition - Home");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("Welcome to Imama Nutrition Community and Skill Development Centre", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        title.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JTextArea info = new JTextArea(
                "We are dedicated to feeding children, supporting communities, and offering educational activities.\n\n" +
                "Join us in making a difference through donations, volunteering, and community events."
        );
        info.setWrapStyleWord(true);
        info.setLineWrap(true);
        info.setEditable(false);
        info.setFont(new Font("Arial", Font.PLAIN, 14));

        JButton donateButton = new JButton("Go to Donation Page");
        donateButton.addActionListener(e -> {
            new DonationPage();
            dispose();
        });

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(title, BorderLayout.NORTH);
        panel.add(info, BorderLayout.CENTER);
        panel.add(donateButton, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HomePage();
    }
}
