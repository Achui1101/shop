package com.company.view;
import javax.swing.*;
import java.awt.*;

public class ViewMainPanel extends JPanel{
    public ViewUIHeader getUiHeader() {
        return uiHeader;
    }

    public void setUiHeader(ViewUIHeader uiHeader) {
        this.uiHeader = uiHeader;
    }

    public ViewContent getUiContent() {
        return uiContent;
    }

    public void setUiContent(ViewContent uiContent) {
        this.uiContent = uiContent;
    }

    private ViewUIHeader uiHeader;
    private ViewContent uiContent;

    ViewMainPanel(){
        this.setUiHeader(new ViewUIHeader());
        this.setUiContent(new ViewContent());
        Dimension size = Toolkit. getDefaultToolkit(). getScreenSize();
        this.setBounds(0,0,size.width,100000);
        this.setLayout(null);

        this.add(uiHeader);
        this.add(uiContent);

        this.repaint();

    }
}
