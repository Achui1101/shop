package com.company.view;
import javax.swing.*;
import java.awt.*;

public class ViewUIHeader extends JPanel{
    public ViewCatBar getCatBar() {
        return catBar;
    }

    public void setCatBar(ViewCatBar catBar) {
        this.catBar = catBar;
    }

    public ViewUIHeaderSearchArea getSearchArea() {
        return searchArea;
    }

    public void setSearchArea(ViewUIHeaderSearchArea searchArea) {
        this.searchArea = searchArea;
    }

    ViewUIHeaderSearchArea searchArea;
    ViewCatBar catBar;

    ViewUIHeader(){
        this.setSearchArea(new ViewUIHeaderSearchArea());
        this.setCatBar(new ViewCatBar());
        Dimension size = Toolkit. getDefaultToolkit(). getScreenSize();
        GridLayout gridlayout21 = new GridLayout(2,1);

        this.setBounds(0, 0, size.width, 100 );
        this.setLayout(gridlayout21);
        this.add(getSearchArea());
        this.add(getCatBar());

    }


}
