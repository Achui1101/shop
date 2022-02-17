package com.company.view;

import javax.swing.*;

public class ViewContentProductSlider extends JPanel {
    ViewContentProductSlider(){
        int mengeProdukte = 5;
        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.LINE_AXIS);
        this.setSize(200,200);

        this.setLayout(boxLayout);
        //this.add(new CategoryLabel("Kategorie "));
        for (int i = 0; i<mengeProdukte; i++){
            this.add(new ViewContentProductCard());
        }

    }
}
