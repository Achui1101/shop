package com.company.view;

import javax.swing.*;
import java.awt.*;

public class ViewUIHeaderSearchArea extends JPanel {

    public ViewUIHeaderSearchAreaLogo getLogo() {
        return logo;
    }

    public void setLogo(ViewUIHeaderSearchAreaLogo logo) {
        this.logo = logo;
    }

    public ViewUIHeaderSearchAreaSearchBar getSearchBar() {
        return searchBar;
    }

    public void setSearchBar(ViewUIHeaderSearchAreaSearchBar searchBar) {
        this.searchBar = searchBar;
    }

    public JButton getBtnWarenkorb() {
        return btnWarenkorb;
    }

    public void setBtnWarenkorb(JButton btnWarenkorb) {
        this.btnWarenkorb = btnWarenkorb;
    }

    private ViewUIHeaderSearchAreaLogo logo;
    private ViewUIHeaderSearchAreaSearchBar searchBar;
    private JButton btnWarenkorb;


    ViewUIHeaderSearchArea(){
        this.setLogo(new ViewUIHeaderSearchAreaLogo());
        this.setSearchBar(new ViewUIHeaderSearchAreaSearchBar());
        this.setBtnWarenkorb(new JButton("Warenkorb"));
        GridLayout gridLayout14 = new GridLayout(1,4);
        this.add(getLogo());
        this.add(getSearchBar());
        this.add(getBtnWarenkorb());

    }
}
