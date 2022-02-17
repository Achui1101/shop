package com.company.view;

import javax.swing.*;
import java.awt.*;

public class ViewContentSearch extends JPanel {
    ViewContentSearch(){

        Dimension size = Toolkit. getDefaultToolkit(). getScreenSize();
        int kategorien = 3;
        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
        this.setBounds(0,100,size.width,1000);
        this.setLayout(boxLayout);
        this.setBackground(Color.pink);
        this.add(new JLabel("Suchergebnisse"));
        for (int i=0; i<kategorien; i++){
            this.add(new ViewContentProductSlider());
        }

        this.repaint();

    }
}
