import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class Main {


    public static void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.X_AXIS));
        addButton("Add", pane);
    }


    private static void addButton(String text, Container container) {
        final JFileChooser fc = new JFileChooser();
        Dimension sizePane = new Dimension(150, 130);
        JButton button = new JButton(text);
        button.setMaximumSize(sizePane);
        button.setMinimumSize(sizePane);
        button.setPreferredSize(sizePane);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);

        button.addActionListener((ActionEvent e) -> {
            ButtonFactory bf = new ButtonFactory();
            container.add(bf.getButPane("toggle", "Button"));
            container.revalidate();
            container.validate();

        });
    }

    public static void main(String[] args) {
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(() -> createAndShowUI());
    }

    private static void createAndShowUI() {
        //Create and set up the window.
        Dimension d = new Dimension(500,180);
        JFrame frame = new JFrame("StartApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
        //Use the content pane's default BorderLayout. No need for
        //setLayout(new BorderLayout());
        //Display the window.
        frame.setSize(d);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
