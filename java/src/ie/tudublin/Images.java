package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class Images extends Super
{
    float width, height;
    PImage img;

    public Images(float x, float y, float width, float height, PApplet ui)
    {
        super(x, y, ui);
        this.width = width;
        this.height = height;
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