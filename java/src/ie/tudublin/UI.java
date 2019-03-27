package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
   
    Circle circle;
    Radar radar;
    Grid grid;
    SolarSystem sys1;
    //for planets
    //Planet[] planet = new Planet[8];

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
        radar = new Radar(this, 220, 220, 420);
        grid = new Grid(500, 150, 500, 150, 900, 550, 0, 0, this);
        sys1 = new SolarSystem(this);
        //for planets
        // for(int i = 0; i < planet.length; i++)
        // {
        //     planet[i] = new Planet(200, 200, 50, 50, 5, 6, 7, 255, this);
        // }

    }

    public void draw()
    {

        background(0);
        circle.drawCircle();
        grid.drawGrid();
        sys1.drawSolarSystem();
        //for planets
        // for(int i = 0; i < planet.length; i++)
        // {
        //     planet[i].drawPlanet();
        // }
        radar.render();
        radar.update();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

