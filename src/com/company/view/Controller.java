package com.company.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class Controller implements ActionListener {
    public ViewUIFrame getUiFrame() {
        return uiFrame;
    }

    public void setUiFrame(ViewUIFrame uiFrame) {
        this.uiFrame = uiFrame;
    }

    private ViewUIFrame uiFrame;

    Controller(){
        this.setUiFrame(new ViewUIFrame());
        this.getUiFrame().addAltoBtns(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "start":
                this.getUiFrame().changeView(true,false, false, false, false, false);
                break;

            case "hiphop":
                this.getUiFrame().changeView(false,true, false, false, false, false);
                break;

            case "schlager":
                this.getUiFrame().changeView(false,false,true, false, false, false);
                break;

            case "techno":
                this.getUiFrame().changeView(false,false, false, true, false, false);
                break;

            case "suche":
                this.getUiFrame().changeView(false, false, false, false, true, false);
                System.out.println("suche");
                break;

            case "warenkorb":
                this.getUiFrame().changeView(false, false, false, false, false, true);
                break;
        }

    }
}
