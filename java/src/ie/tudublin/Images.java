package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class Images
{
    float x, y, width, height;
    PImage img;
    PApplet ui;

    public Images(float x, float y, float width, float height, PApplet ui)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.ui = ui;
    }

    public PImage loadImages(String name)
    {
        img =  ui.loadImage(name);
        return img;
    }

    public void drawImages(PImage name)
    {
        ui.image(name, x, y, width, height);
    }
}