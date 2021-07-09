package GUI;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public Button(String name) {
        super(name);
        this.setFont(new Font("Tahoma", Font.BOLD, 11));
        this.setBackground(new Color(255, 240, 245));
    }

    public void attachTo(Container layer, int x, int y) {

        GridBagConstraints settings = new GridBagConstraints();
        settings.insets = new Insets(3, 3, 3, 3);
        settings.gridx = x;
        settings.gridy = y;
        settings.fill = GridBagConstraints.BOTH;
        layer.add(this, settings);
    }
}
