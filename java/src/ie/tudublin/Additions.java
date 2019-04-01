package ie.tudublin;

import processing.core.PApplet;

public class Additions{
    float rotation, r;
    PApplet ui;

    public Additions(float r, PApplet ui)
    {
        this.r = r;
        this.ui = ui;
    }

    public void drawAdditions()
    {
        //earth
        //land1
        ui.pushMatrix();
        ui.translate(310, 310);
        ui.rotate(rotation);
        ui.fill(0, 255, 0);
        ui.noStroke();
        ui.ellipse(-73, -77, 15, 10);
        ui.triangle(-77, -75, -69, -60, -66, -75);
        //land2
        ui.fill(0, 255, 0);
        ui.noStroke();
        ui.ellipse(-90, -80, 15, 10);
        ui.triangle(-96, -78, -85, -70, -83, -78);
        //land3
        ui.fill(0, 255, 0);
        ui.noStroke();
        ui.ellipse(-84, -64, 15, 10);
        
        //cloud1
        ui.fill(255);
        ui.ellipse(-80, -84, 6, 6);//
        ui.ellipse(-83, -82, 6, 6);//
        ui.ellipse(-81, -79, 6, 6);//
        ui.ellipse(-85, -85, 6, 6);//
        ui.ellipse(-85, -79, 6, 6);//
        //cloud2
        ui.fill(255);
        ui.ellipse(-75, -68, 7, 5);
        ui.ellipse(-78, -70, 7, 5);
        ui.ellipse(-76, -63, 7, 9);
        ui.ellipse(-80, -69, 5, 7);
        ui.ellipse(-80, -63, 5, 7);
        ui.popMatrix();
        rotation += r;
    }
}