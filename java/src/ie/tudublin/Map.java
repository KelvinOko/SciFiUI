package ie.tudublin;

import processing.core.PApplet;

public class Map extends PApplet
{
    public void settings() 
    {
        size(1000, 600);
    }

    public void setup()
    {
        
    }
    public void draw()
    {
        background(0);
        
        stroke(128, 0, 128);
        fill(50, 150);
        ellipse(width/2, height/2, 350, 350);
        
        
        stroke(128, 0, 128);
        line(width/2, height/2, mouseX, mouseY);
        //println(mouseX, mouseY);
    }

}

