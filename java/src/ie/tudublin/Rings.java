package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;

public class Rings
{
    // float weight, x, y, s1, s2;
    PImage ringTexture; 
    PShape ring;
    int s;
    PApplet ui;

    public Rings(int s, PApplet ui)//float weight, float x, float y, float s, float s1, float s2, PApplet ui)
    {
        // this.weight = weight;
        // this.x = x;
        // this.y = y;
        this.s = s;
        // this.s1 = s1;
        // this.s2 = s2;
        this.ui = ui;
    }

    public PImage loadRings(String FileName)
    {
        ringTexture = ui.loadImage(FileName);
        return ringTexture;
    }

    public void drawRings(PImage name)
    {
        ui.pushMatrix();
        ui.translate(ui.width - 400, ui.height/2);
        ui.rotateY(ui.PI * ui.frameCount / 500);
        ui.rotateX((float) (ui.HALF_PI - .45));
        ui.noFill();
        ring = ui.createShape(ui.ELLIPSE, s);
        ring.setTexture(ringTexture);
        ui.shape(ring);
        // ui.stroke(255);
        // ui.strokeWeight(weight);
        // ui.noFill();
        // ui.rotateX((float) (ui.HALF_PI - .45));
        // ui.ellipse(x, y, s1, s2);
        ui.popMatrix();
        //ui.strokeWeight(1);
    }
}