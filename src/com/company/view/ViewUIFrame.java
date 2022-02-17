package com.company.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class ViewUIFrame extends JFrame{
    public ViewMainPanel getVmp() {
        return vmp;
    }

    public void setVmp(ViewMainPanel vmp) {
        this.vmp = vmp;
    }

    ViewMainPanel vmp;

    public ViewUIFrame(){
        this.setVmp(new ViewMainPanel());
        Dimension size = Toolkit. getDefaultToolkit(). getScreenSize();
        this.setTitle("Plattenshop24");
        this.setSize(size.width,size.height);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(getVmp());

        getVmp().setPreferredSize(new Dimension(size.width, size.height));
        JScrollPane jsp = new JScrollPane(getVmp());
        this.add(jsp);
        this.getVmp().getUiHeader().getCatBar().getBtnStart().setActionCommand("start");
        this.getVmp().getUiHeader().getCatBar().getBtnHipHop().setActionCommand("hiphop");
        this.getVmp().getUiHeader().getCatBar().getBtnSchlager().setActionCommand("schlager");
        this.getVmp().getUiHeader().getCatBar().getBtnTechno().setActionCommand("techno");
        this.getVmp().getUiHeader().getSearchArea().getSearchBar().getSearchButton().setActionCommand("suche");
        this.getVmp().getUiHeader().getSearchArea().getBtnWarenkorb().setActionCommand("warenkorb");

        this.setVisible(true);
    }

    public void addAltoBtns(ActionListener al) {
        this.getVmp().getUiHeader().getCatBar().getBtnStart().addActionListener(al);
        this.getVmp().getUiHeader().getCatBar().getBtnHipHop().addActionListener(al);
        this.getVmp().getUiHeader().getCatBar().getBtnSchlager().addActionListener(al);
        this.getVmp().getUiHeader().getCatBar().getBtnTechno().addActionListener(al);
        this.getVmp().getUiHeader().getSearchArea().getSearchBar().getSearchButton().addActionListener(al);
        this.getVmp().getUiHeader().getSearchArea().getBtnWarenkorb().addActionListener(al);

    }

    public void changeView(boolean start, boolean hiphop, boolean schlager, boolean techno, boolean suche, boolean warenkorb) {
        this.getVmp().getUiContent().getVcLanding().setVisible(start);
        this.getVmp().getUiContent().getVcHipHop().setVisible(hiphop);
        this.getVmp().getUiContent().getVcSchlager().setVisible(schlager);
        this.getVmp().getUiContent().getVcTechno().setVisible(techno);
        this.getVmp().getUiContent().getVcSearch().setVisible(suche);
        this.getVmp().getUiContent().getVcWarenkorb().setVisible(warenkorb);


    }
}
