package ie.tudublin;

import processing.core.PApplet;

public class Rings
{
    float weight, r, g, b, x, y, s1, s2;
    PApplet ui;

    public Rings(float weight, float r, float g, float b, float x, float y, float s1, float s2, PApplet ui)
    {
        this.weight = weight;
        this.r = r;
        this.g = g;
        this.b = b;
        this.x = x;
        this.y = y;
        this.s1 = s1;
        this.s2 = s2;
        this.ui = ui;
    }

    public void drawRings()
    {
        ui.pushMatrix();
        ui.translate(ui.width - 400, ui.height/2);
        ui.rotateY(ui.PI * ui.frameCount / 500);
        ui.stroke(r, g, b);
        ui.strokeWeight(weight);
        ui.noFill();
        ui.rotateX((float) (ui.HALF_PI - .45));
        ui.ellipse(x, y, s1, s2);
        ui.popMatrix();
        ui.strokeWeight(1);
    }
}