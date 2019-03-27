package ie.tudublin;

import processing.core.PApplet;

public class Planet
{
    float x;
    float y;
    float s1;
    float s2;
    float c1;
    float c2;
    float c3;
    float a;
    PApplet ui;

    public Planet(float x, float y, float s1, float s2, float c1, float c2, float c3, float a, PApplet ui)
    {
        this.x = x;
        this.y = y;
        this.s1 = s1;
        this.s2 = s2;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.a = a;
        this.ui = ui;
    }

    public void drawPlanet()
    {
        ui.fill(c1, c2, c3, a);
        ui.ellipse(x, y, s1, s2);
    }

}