package com.company.view;

import javax.swing.*;
import java.awt.*;

public class ViewContentSchlager extends JPanel {
    ViewContentSchlager(){

        Dimension size = Toolkit. getDefaultToolkit(). getScreenSize();
        int kategorien = 3;
        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
        this.setBounds(0,100,size.width,1000);
        this.setLayout(boxLayout);
        this.setBackground(Color.green);
        this.add(new JLabel("Schlager"));
        for (int i=0; i<kategorien; i++){
            this.add(new ViewContentProductSlider());
        }

        this.repaint();

    }
}
