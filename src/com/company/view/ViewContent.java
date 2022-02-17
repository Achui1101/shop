package com.company.view;

import javax.swing.*;
import java.awt.*;

public class ViewContent extends JPanel {
    public ViewContentLanding getVcLanding() {
        return vcLanding;
    }

    public void setVcLanding(ViewContentLanding vcLanding) {
        this.vcLanding = vcLanding;
    }

    public ViewContentHipHop getVcHipHop() {
        return vcHipHop;
    }

    public void setVcHipHop(ViewContentHipHop vcHipHop) {
        this.vcHipHop = vcHipHop;
    }

    public ViewContentSchlager getVcSchlager() {
        return vcSchlager;
    }

    public void setVcSchlager(ViewContentSchlager vcSchlager) {
        this.vcSchlager = vcSchlager;
    }

    public ViewContentTechno getVcTechno() {
        return vcTechno;
    }

    public void setVcTechno(ViewContentTechno vcTechno) {
        this.vcTechno = vcTechno;
    }

    public ViewContentSearch getVcSearch() {
        return vcSearch;
    }

    public void setVcSearch(ViewContentSearch vcSearch) {
        this.vcSearch = vcSearch;
    }

    public ViewContentWarenkorb getVcWarenkorb() {
        return vcWarenkorb;
    }

    public void setVcWarenkorb(ViewContentWarenkorb vcWarenkorb) {
        this.vcWarenkorb = vcWarenkorb;
    }


    private ViewContentLanding vcLanding;
    private ViewContentHipHop vcHipHop;
    private ViewContentSchlager vcSchlager;
    private ViewContentTechno vcTechno;
    private  ViewContentSearch vcSearch;
    private ViewContentWarenkorb vcWarenkorb;

    ViewContent(){
        this.setVcHipHop(new ViewContentHipHop());
        this.setVcLanding(new ViewContentLanding());
        this.setVcSchlager(new ViewContentSchlager());
        this.setVcTechno(new ViewContentTechno());
        this.setVcSearch(new ViewContentSearch());
        this.setVcWarenkorb(new ViewContentWarenkorb());
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds(0,100,size.width,100000);
        this.setLayout(null);
        this.setBackground(Color.lightGray);
        this.add(getVcLanding());
        this.add(getVcHipHop());
        this.add(getVcSchlager());
        this.add(getVcTechno());
        this.add(getVcSearch());
        this.add(getVcWarenkorb());




    }
}
