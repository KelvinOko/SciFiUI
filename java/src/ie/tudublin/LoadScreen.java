package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;

public class LoadScreen
{
    PImage planet;
    PShape globe;
    int size;
    PApplet ui;
    public LoadScreen(int size, PApplet ui)
    {
        this.size = size;
        this.ui = ui;
    }

    public PImage load(String FileName)
    {
        planet = ui.loadImage(FileName);
        return planet;
    }


    public void drawInfo(PImage name)
    {
        globe = ui.createShape(ui.SPHERE, size); 
        globe.setTexture(planet);
        ui.noStroke();
        ui.shape(globe);
    }
}