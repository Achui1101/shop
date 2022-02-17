package com.company.view;

import javax.swing.*;

public class ViewUIHeaderSearchAreaSearchBar extends JPanel {
    public JTextField getSearchText() {
        return searchText;
    }

    public void setSearchText(JTextField searchText) {
        this.searchText = searchText;
    }

    public JButton getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(JButton searchButton) {
        this.searchButton = searchButton;
    }

    JTextField searchText;
    JButton searchButton;

    ViewUIHeaderSearchAreaSearchBar(){
        this.setSearchText(new JTextField(30));
        this.setSearchButton(new JButton("Suche"));
        this.add(getSearchText());
        this.add(getSearchButton());
        this.setBounds(0,0,200,20);
    }
}

