import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonExample {
    public static void main(String[] args) {
        // Create a new frame (window)
        JFrame frame = new JFrame("Button Example");

        // Create a button
        JButton button = new JButton("Click Me");

        // Set the button's position and size (x, y, width, height)
        button.setBounds(100, 100, 150, 40);

        // Add action listener for button click event
        button.addActionListener(e -> System.out.println("Button clicked!"));

        // Add the button to the frame
        frame.add(button);

        // Set the frame size and close operation
        frame.setSize(400, 400);
        frame.setLayout(null); // No layout manager, using absolute positioning
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
