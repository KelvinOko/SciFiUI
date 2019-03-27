package ie.tudublin;

import processing.core.PApplet;

public class Circles{
    float x, y, s1, s2;
    PApplet ui;

    public Circles(float x, float y, float s1, float s2, PApplet ui)
    {
        this.x = x;
        this.y = y;
        this.s1 = s1;
        this.s2 = s2;
        this.ui = ui;
    }

    public void drawCircles()
    {
        ui.stroke(128, 0, 128);
        ui.noFill();
        ui.ellipse(x, y, s1, s2);
    }
}