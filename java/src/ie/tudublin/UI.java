package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class UI extends PApplet
{
   
    Circle circle;
    Radar radar;
    Grid grid;
    SolarSystem sys1;

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
        size(1200, 700);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(); 
    }

    ArrayList<Planet> planets = new ArrayList<>();

    public void setup()
    {
        circle = new Circle(200, this);
        radar = new Radar(this, 310, 310, 530);
        grid = new Grid(500, 150, 500, 150, 900, 550, 0, 0, this);
        sys1 = new SolarSystem(this);

        planets.add(new Planet(310, 310, 100, 100, 255, 150, 0, 255, this));//sun
        planets.add(new Planet(370, 310, 20, 20, 204, 102, 0, 255, this));//mercury
        planets.add(new Planet(376, 260, 33, 33, 255, 102, 0, 255, this));//venus
        planets.add(new Planet(230, 235, 40, 40, 0, 0, 190, 255, this));//earth
        planets.add(new Planet(426, 380, 25, 25, 255, 51, 0, 255, this));//mars
        planets.add(new Planet(202, 435, 75, 75, 255, 204, 102, 255, this));//jupiter
        planets.add(new Planet(465, 205, 65, 65, 255, 204, 102, 255, this));//saturn
        planets.add(new Planet(320, 90, 55, 55, 40, 204, 240, 255, this));//uranus
        planets.add(new Planet(45, 290, 50, 50, 0, 102, 204, 255, this));//neptune
        

    }

    public void draw()
    {

        background(0);
        for(int i = 0; i < planets.size(); i++)
        {
            planets.get(i).drawPlanet();
            println(i);
        }
        //sys1.drawSolarSystem();
        circle.drawCircle();
        //grid.drawGrid();
        
        radar.render();
        radar.update();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }

        
    }
}

