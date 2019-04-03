package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;
//import peasy.*;

public class PlanetInfo
{
    // PeasyCam cam;
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
        ui.translate(ui.width/2, ui.height/2);
        globe = ui.createShape(ui.SPHERE, size); 
        globe.setTexture(planet);
        ui.noStroke();
        ui.shape(globe);
        ui.popMatrix();
    }
}