package ie.tudublin;

import processing.core.PApplet;

public class PlanetLines
{
    int x1, y1, x2, y2, r, g, b, a;
    PApplet ui;

    public PlanetLines(int x1, int y1, int x2, int y2, int r, int g, int b, int a, PApplet ui)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.r = r;
        this.g = g;
        this.b = b;
        this.ui = ui;
    }


    public void drawPlanetLines()
    {
        ui.stroke(r, g, b);
        ui.line(x1, y1, x2, y2);
    }

}