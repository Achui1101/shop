package com.company.view;

import javax.swing.*;

public class ViewContentProductCard extends JPanel {
    ViewContentProductCard(){

        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.PAGE_AXIS);
        this.setLayout(boxLayout);
        JPanel productPic = new JPanel();
        productPic.setLayout(null);
        //productPic.setBackground();
        productPic.setSize(5,5);
        this.add(productPic);
        this.add(new JLabel("Name"));
        this.add(new JLabel("Preis"));
        this.add(new JButton("in den Warenkorb"));

        this.repaint();

    }



}
