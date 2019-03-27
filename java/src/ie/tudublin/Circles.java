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
        // ui.ellipse(310, 310, 120, 120);//m
        // ui.ellipse(310, 310, 168, 168);//v
        // ui.ellipse(310, 310, 220, 220);//e
        // ui.ellipse(310, 310, 270, 270);//m
        // ui.ellipse(310, 310, 330, 330);//j
        // ui.ellipse(310, 310, 385, 385);//s
        // ui.ellipse(310, 310, 445, 445);//u

        // ui.stroke(128, 0, 128);
        // ui.line(310, 45, 310, 575);//vertical
        // ui.line(45, 310, 575, 310);//horizontal

        }
}