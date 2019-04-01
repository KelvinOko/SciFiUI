package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class UI extends PApplet
{
    ArrayList<Circles> circles = new ArrayList<>();
    ArrayList<Lines> lines = new ArrayList<>();
    Stars stars;
    Radar radar;
    Grid grid;
    ArrayList<Planet> planets = new ArrayList<>();
    ArrayList<PlanetLines> planetLines = new ArrayList<>();
    Additions additions;

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

    

    public void setup()
    {
        circles.add(new Circles(310, 310, 120, 120, this));
        circles.add(new Circles(310, 310, 168, 168, this));
        circles.add(new Circles(310, 310, 220, 220, this));
        circles.add(new Circles(310, 310, 270, 270, this));
        circles.add(new Circles(310, 310, 330, 330, this));
        circles.add(new Circles(310, 310, 385, 385, this));
        circles.add(new Circles(310, 310, 445, 445, this));

        //radar lines
        lines.add(new Lines(310, 45, 310, 575, this));//vertical
        lines.add(new Lines(45, 310, 575, 310, this));//horizontal

        stars = new Stars(200, this);
        radar = new Radar(this, 310, 310, 530);
        grid = new Grid(700, 150, 1100, 550, 0, 0, this);

        planets.add(new Planet(0, 0, 100, 100, 231, 116, 0, 255, 0, this));//sun
        planets.add(new Planet(60, 0, 20, 20, 153, 153, 102, 255, 0.06f, this));//mercury
        planets.add(new Planet(66, -50, 33, 33, 255, 204, 0, 255, 0.02f, this));//venus
        planets.add(new Planet(-80, -75, 40, 40, 0, 0, 190, 255, 0.017f, this));//earth
        planets.add(new Planet(116, 70, 25, 25, 204, 51, 0, 255, 0.015f, this));//mars

        planets.add(new Planet(-108, 125, 75, 75, 255, 204, 102, 255, 0.009f, this));//jupiter
        //jupiter lines
        planetLines.add(new PlanetLines(-123, 90, -93, 90, 190, 101, 0, 255, 0.009f, this));//1
        planetLines.add(new PlanetLines(-131, 95, -85, 95, 240, 153, 51, 255, 0.009f, this));//2
        planetLines.add(new PlanetLines(-136, 100, -80, 100, 255, 255, 255, 100, 0.009f, this));//5
        planetLines.add(new PlanetLines(-141, 105, -76, 105, 240, 153, 51, 100, 0.009f, this));//3
        planetLines.add(new PlanetLines(-143, 110, -74, 110, 190, 101, 0, 255, 0.009f, this));//4
        planetLines.add(new PlanetLines(-145, 115, -72, 115, 255, 255, 255, 100, 0.009f, this));//5
        planetLines.add(new PlanetLines(-146, 120, -73, 120, 190, 101, 0, 255, 0.009f, this));//6
        planetLines.add(new PlanetLines(-146, 125, -73, 125, 255, 255, 255, 100, 0.009f, this));//7
        planetLines.add(new PlanetLines(-145, 130, -72, 130, 240, 153, 51, 255, 0.009f, this));//8
        planetLines.add(new PlanetLines(-144, 135, -73, 135, 190, 101, 0, 255, 0.009f, this));//9
        planetLines.add(new PlanetLines(-142, 141, -74, 141, 255, 154, 51, 255, 0.009f, this));//10
        planetLines.add(new PlanetLines(-139, 146, -77, 146, 255, 255, 255, 100, 0.009f, this));//11
        planetLines.add(new PlanetLines(-136, 150, -81, 150, 240, 153, 51, 255, 0.009f, this));//12
        planetLines.add(new PlanetLines(-130, 155, -86, 155, 255, 255, 255, 100, 0.009f, this));//13
        planetLines.add(new PlanetLines(-121, 160, -95, 160, 240, 153, 51, 255, 0.009f, this));//14
        
        planets.add(new Planet(155, -105, 65, 65, 255, 204, 51, 255, 0.0082f, this));//saturn
        //saturn line
        planetLines.add(new PlanetLines(117, -82, 190, -128, 255, 255, 255, 100,  0.0082f, this));

        planets.add(new Planet(20, -220, 55, 55, 153, 204, 255, 255, 0.0079f, this));//uranus
        //uranus line
        planetLines.add(new PlanetLines(-14, -206, 53, -233, 255, 255, 255, 50, 0.0079f, this));
        
        planets.add(new Planet(-265, -20, 50, 50, 102, 153, 255, 255, 0.0077f, this));//neptune
        
        additions = new Additions(0.017f, this);

    }

    public void draw()
    {

        background(0);
        // stroke(255);
        // line(200, 300, mouseX, mouseY);
        // println(mouseX, mouseY);

        for(int c = 0; c < circles.size(); c++)
        {
            circles.get(c).drawCircles();
        }

        for(int l = 0; l < lines.size(); l++)
        {
            lines.get(l).drawLines();
        }

        stars.drawStars();

        radar.render();
        radar.update();

        grid.drawGrid();


        for(int i = 0; i < planets.size(); i++)
        {
            planets.get(i).drawPlanet();
        }


        for(int pl = 0; pl < planetLines.size(); pl++)
        {
            planetLines.get(pl).drawPlanetLines();
        }

        additions.drawAdditions();
        

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }

        
    }
}

