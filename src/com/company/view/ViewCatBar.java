package com.company.view;

import javax.swing.*;


public class ViewCatBar extends JPanel {
    public JButton getBtnStart() {
        return btnStart;
    }

    public void setBtnStart(JButton btnStart) {
        this.btnStart = btnStart;
    }

    public JButton getBtnHipHop() {
        return btnHipHop;
    }

    public void setBtnHipHop(JButton btnHipHop) {
        this.btnHipHop = btnHipHop;
    }

    public JButton getBtnSchlager() {
        return btnSchlager;
    }

    public void setBtnSchlager(JButton btnSchlager) {
        this.btnSchlager = btnSchlager;
    }

    public JButton getBtnTechno() {
        return btnTechno;
    }

    public void setBtnTechno(JButton btnTechno) {
        this.btnTechno = btnTechno;
    }


    JButton btnStart;
    JButton btnHipHop;
    JButton btnSchlager;
    JButton btnTechno;


    ViewCatBar(){

        setBtnStart(new JButton("Start"));
        this.add(btnStart);

        setBtnHipHop(new JButton("Hip Hop"));
        this.add(btnHipHop);

        setBtnSchlager(new JButton("Schlager"));
        this.add(btnSchlager);

        setBtnTechno(new JButton("Technoo"));
        this.add(btnTechno);

    }
}
