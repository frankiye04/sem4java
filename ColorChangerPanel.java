//EX10
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ColorChangerPanel extends JFrame {
    public ColorChangerPanel() {
        setTitle("Color Changer Panel");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JButton redButton = new JButton("Red");
        JButton blueButton = new JButton("Blue");
        JButton yellowButton = new JButton("Yellow");
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
            }
        });
        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);
            }
        });
        yellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.YELLOW);
            }
        });
        panel.add(redButton);
        panel.add(blueButton);
        panel.add(yellowButton);
        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ColorChangerPanel();
    }
}
