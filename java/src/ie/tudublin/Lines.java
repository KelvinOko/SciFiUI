package ie.tudublin;

import processing.core.PApplet;

public class Lines
{
    int x1, y1, x2, y2;
    PApplet ui;

    public Lines(int x1, int y1, int x2, int y2, PApplet ui)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.ui = ui;
    }


    public void drawLines()
    {
        ui.stroke(128, 0, 128);
        ui.line(x1, y1, x2, y2);
    }

}