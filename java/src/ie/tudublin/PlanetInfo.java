package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;

public class PlanetInfo
{
    PImage planet;
    PShape globe;
    int size;
    PApplet ui;
    public PlanetInfo(int size, PApplet ui)
    {
        this.size = size;
        this.ui = ui;
    }

    public PImage loadInfo(String FileName)
    {
        planet = ui.loadImage(FileName);
        return planet;
    }


    public void drawInfo(PImage name)
    {
        ui.pushMatrix();
        ui.translate(ui.width - 400, ui.height/2);
        ui.rotateY(ui.PI * ui.frameCount / 500);
        globe = ui.createShape(ui.SPHERE, size); 
        globe.setTexture(planet);
        ui.noStroke();
        ui.shape(globe);
        ui.popMatrix();
        ui.stroke(255);
        ui.fill(255);
        ui.textSize(20);
        // ui.textAlign(CENTER);
        ui.text("Back", 128, 632);
        ui.noFill();
        ui.rect(100, 600, 100, 50);
        ui.noStroke();
    }
}