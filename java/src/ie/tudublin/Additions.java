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
        ui.popMatrix();
        rotation += r;
        // //cloud1
        // ui.fill(255);
        // ui.ellipse(160, 155, 5, 5);
        // ui.ellipse(163, 153, 5, 5);
        // ui.ellipse(162, 158, 5, 5);
        // ui.ellipse(158, 152, 5, 5);
        // ui.ellipse(158, 158, 5, 5);
        // //cloud2
        // ui.fill(255);
        // ui.ellipse(148, 166, 5, 5);
        // ui.ellipse(152, 164, 5, 5);
        // ui.ellipse(150, 169, 5, 5);
        // ui.ellipse(146, 164, 5, 5);
        // ui.ellipse(146, 169, 5, 5);
    }
}