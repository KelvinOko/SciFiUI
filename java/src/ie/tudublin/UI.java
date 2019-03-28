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

        //jupiter lines
        planetLines.add(new PlanetLines(187, 400, 217, 400, 190, 101, 0, 255, this));//1
        planetLines.add(new PlanetLines(179, 405, 225, 405, 240, 153, 51, 255, this));//2
        planetLines.add(new PlanetLines(174, 410, 230, 410, 255, 255, 255, 100, this));//5
        planetLines.add(new PlanetLines(169, 415, 234, 415, 240, 153, 51, 100, this));//3
        planetLines.add(new PlanetLines(167, 420, 236, 420, 190, 101, 0, 255, this));//4
        planetLines.add(new PlanetLines(165, 425, 238, 425, 255, 255, 255, 100, this));//5
        planetLines.add(new PlanetLines(164, 430, 237, 430, 190, 101, 0, 255, this));//6
        planetLines.add(new PlanetLines(164, 435, 237, 435, 255, 255, 255, 100, this));//7
        planetLines.add(new PlanetLines(165, 440, 238, 440, 240, 153, 51, 255, this));//8
        planetLines.add(new PlanetLines(166, 445, 237, 445, 190, 101, 0, 255, this));//9
        planetLines.add(new PlanetLines(168, 451, 236, 451, 255, 154, 51, 255, this));//10
        planetLines.add(new PlanetLines(171, 456, 233, 456, 255, 255, 255, 100, this));//11
        planetLines.add(new PlanetLines(174, 460, 229, 460, 240, 153, 51, 255, this));//12
        planetLines.add(new PlanetLines(180, 465, 224, 465, 255, 255, 255, 100, this));//13
        planetLines.add(new PlanetLines(189, 470, 215, 470, 240, 153, 51, 255, this));//14

        //saturn line
        planetLines.add(new PlanetLines(427, 228, 500, 182, 255, 255, 255, 100, this));

        //uranus line
        planetLines.add(new PlanetLines(289, 104, 350, 77, 255, 255, 255, 30, this));

        stars = new Stars(200, this);
        radar = new Radar(this, 310, 310, 530);
        grid = new Grid(700, 150, 1100, 550, 0, 0, this);

        planets.add(new Planet(310, 310, 100, 100, 231, 116, 0, 255, this));//sun
        planets.add(new Planet(370, 310, 20, 20, 153, 153, 102, 255, this));//mercury
        planets.add(new Planet(376, 260, 33, 33, 255, 204, 0, 255, this));//venus
        planets.add(new Planet(230, 235, 40, 40, 0, 0, 190, 255, this));//earth
        planets.add(new Planet(426, 380, 25, 25, 204, 51, 0, 255, this));//mars
        planets.add(new Planet(202, 435, 75, 75, 255, 204, 102, 255, this));//jupiter
        planets.add(new Planet(465, 205, 65, 65, 255, 204, 51, 255, this));//saturn
        planets.add(new Planet(320, 90, 55, 55, 153, 204, 255, 255, this));//uranus
        planets.add(new Planet(45, 290, 50, 50, 102, 153, 255, 255, this));//neptune
        
        additions = new Additions(this);

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

