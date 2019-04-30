package ie.tudublin;

import processing.core.PApplet;

public class Planet extends Super
{
    float s1;
    float s2;
    float r, g, b;
    float a;
    float rotation;
    float rotateSpeed;

    public Planet(float x, float y, float s1, float s2, float r, float g, float b, float a, float rotateSpeed, PApplet ui)
    {
        super(x, y, ui);
        this.s1 = s1;
        this.s2 = s2;
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
        this.rotateSpeed = rotateSpeed;
    }

    public void drawPlanet()
    {
        ui.pushMatrix();
        ui.stroke(255, 100);
        ui.fill(r, g, b, a);
        ui.translate(310, 310);
        ui.rotate(rotation);
        ui.ellipse(x, y, s1, s2);
        ui.popMatrix();
        rotation += rotateSpeed; 
    }

}