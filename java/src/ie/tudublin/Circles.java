package ie.tudublin;

import processing.core.PApplet;

public class Circles extends Super
{
    float s1, s2;

    public Circles(float x, float y, float s1, float s2, PApplet ui)
    {
        super(x, y, ui);
        this.s1 = s1;
        this.s2 = s2;
    }

    public void drawCircles()
    {
        ui.stroke(128, 0, 128);
        ui.noFill();
        ui.ellipse(x, y, s1, s2);
    }
}