package com.company.view;

import javax.swing.*;

public class ViewCategoryLabel extends JPanel {
    ViewCategoryLabel(String Label){
        this.setLayout(null);
        this.setBounds(0,0,1000,250);
        JLabel label = new JLabel(Label);
        label.setHorizontalAlignment(500);
        this.add(label);
    }
}
