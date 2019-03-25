package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    Circle circle;
    Radar radar;
    Grid grid;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        size(1000, 600);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
    }

    public void setup()
    {
        circle = new Circle(100, this);
        grid = new Grid(500, 150, 500, 150, 900, 550, 0, 0, this);
        radar = new Radar(this, 220, 220, 400);
    }

    public void draw()
    {

        background(0);
        circle.drawCircle();
        grid.drawGrid();
        radar.render();
        radar.update();
        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

