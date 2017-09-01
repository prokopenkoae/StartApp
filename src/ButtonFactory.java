import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by iram on 01.09.2017.
 */
public class ButtonFactory {

    public JPanel getButPane(String type, String text) {
        if (type == "toggle") {
            return getToggle(text);
        }

        return null;
    }

    private JPanel getToggle(String text) {
        JComponent component = new JPanel();
        JPanel pane = new JPanel();
        JToggleButton toggleBut = new JToggleButton();
        Dimension sizePane = new Dimension(150, 100);
        Dimension sizeBut = new Dimension(130, 70);
        component.setMaximumSize(sizePane);
        component.setPreferredSize(sizePane);
        component.setMinimumSize(sizePane);
        TitledBorder border = new TitledBorder(new LineBorder(Color.black), text, TitledBorder.CENTER, TitledBorder.BELOW_TOP);
        border.setTitleColor(Color.black);
        component.setBorder(border);
        toggleBut.setMaximumSize(sizeBut);
        toggleBut.setMinimumSize(sizeBut);
        toggleBut.setPreferredSize(sizeBut);
        toggleBut.setText(text);
        component.add(toggleBut);
        JLabel label = new JLabel("Удалить");
        String title;
        pane.setBorder(BorderFactory.createTitledBorder("статус"));
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        pane.add(label);
        pane.add(component);
        return pane;
    }

}
