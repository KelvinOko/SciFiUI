package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;
//import peasy.*;

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
    Images p1, p2, p3, p4, p5, p6, p7, p8, p9;
    PlanetInfo p1Info, p2Info, p3Info, p4Info, p5Info, 
    p6Info, p7Info, p8Info, p9Info;
    PImage sun, mercury, venus, earth, mars, 
    jupiter, saturn, uranus, uranusRing, neptune;
    PImage sunInfo, mercuryInfo, venusInfo, earthInfo, marsInfo, 
    jupiterInfo, saturnInfo, uranusInfo, neptuneInfo;
    int mode, back = 0;
    // float camSize = 800;
    // PeasyCam cam;
    
    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = false;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }

    public void settings()
    {
        fullScreen(P3D);   
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen();
    }

    

    public void setup()
    {
        //cam = new PeasyCam(this, camSize);

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
        grid = new Grid(755, 275, 1155, 675, 0, 0, this);

        planets.add(new Planet(0, 0, 100, 100, 231, 116, 0, 255, 0, this));//sun
        planets.add(new Planet(60, 0, 20, 20, 153, 153, 102, 255, 0.06f, this));//mercury
        planets.add(new Planet(66, -50, 33, 33, 255, 204, 0, 255, 0.02f, this));//venus
        planets.add(new Planet(-80, -75, 40, 40, 0, 0, 190, 255, 0.017f, this));//earth
        planets.add(new Planet(116, 70, 25, 25, 204, 51, 0, 255, 0.015f, this));//mars
        planets.add(new Planet(-108, 125, 75, 75, 255, 204, 102, 255, 0.009f, this));//jupiter
        planets.add(new Planet(155, -105, 65, 65, 255, 204, 51, 255, 0.0082f, this));//saturn
        planets.add(new Planet(20, -220, 55, 55, 153, 204, 255, 255, 0.0079f, this));//uranus
        planets.add(new Planet(-265, -20, 50, 50, 102, 153, 255, 255, 0.0077f, this));//neptune

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
        //saturn line
        planetLines.add(new PlanetLines(117, -82, 190, -128, 255, 255, 255, 100,  0.0082f, this));
        //uranus line
        planetLines.add(new PlanetLines(-14, -206, 53, -233, 255, 255, 255, 50, 0.0079f, this));
        
        additions = new Additions(0.017f, this);

        //the sun
        p1 = new Images(600, 70, 150, 150, this);
        sun = p1.loadImages("sun.png");
        p1Info = new PlanetInfo(150, this);
        sunInfo = p1Info.loadInfo("3dsun.jpg");
        //mercury
        p2 = new Images(750, 140, 24, 24, this);
        mercury = p2.loadImages("mercury.png");
        p2Info = new PlanetInfo(150, this);
        mercuryInfo = p2Info.loadInfo("3dmercury.jpg");
        //venus
        p3 = new Images(790, 137, 30, 30, this);
        venus = p3.loadImages("venus.png");
        p3Info = new PlanetInfo(150, this);
        venusInfo = p3Info.loadInfo("3dvenus.jpg");
        //earth
        p4 = new Images(830, 134, 36, 36, this);
        earth = p4.loadImages("earth.png");
        p4Info = new PlanetInfo(150, this);
        earthInfo = p4Info.loadInfo("3dearth.jpg");
        //mars
        p5 = new Images(875, 138, 26, 26, this);
        mars = p5.loadImages("mars.png");
        p5Info = new PlanetInfo(150, this);
        marsInfo = p5Info.loadInfo("3dmars.jpg");
        //jupiter
        p6 = new Images(923, 105, 90, 90, this);
        jupiter = p6.loadImages("jupiter.png");
        p6Info = new PlanetInfo(150, this);
        jupiterInfo = p6Info.loadInfo("3djupiter.jpg");
        //saturn
        p7 = new Images(1025, 120, 120, 65, this);
        saturn = p7.loadImages("saturn.png");
        p7Info = new PlanetInfo(150, this);
        saturnInfo = p7Info.loadInfo("3dsaturn.jpg");
        //uranus
        p8 = new Images(1150, 130, 44, 44, this);
        uranus = p8.loadImages("uranus.png");
        p8Info = new PlanetInfo(150, this);
        uranusInfo = p8Info.loadInfo("3duranus.jpg");
        //neptune
        p9 = new Images(1210, 125, 50, 50, this);
        neptune = p9.loadImages("neptune.png");
        p9Info = new PlanetInfo(150, this);
        neptuneInfo = p9Info.loadInfo("3dneptune.jpg");
        
    }

    public void mousePressed()
    {
        
        if((mouseX > 610 && mouseX < 740) && (mouseY > 80 && mouseY < 210))//sun
        {
            mode = 1;
        }else if((mouseX > 754 && mouseX < 770) && (mouseY > 143 && mouseY < 161))//mercury 
        {
            mode = 2; 
        }else if((mouseX > 791 && mouseX < 819) && (mouseY > 138 && mouseY < 167))//venus
        {
            mode = 3;
        }else if((mouseX > 833 && mouseX < 863) && (mouseY > 138 && mouseY < 167))//earth
        {
            mode = 4;
        }else if((mouseX > 876 && mouseX < 900) && (mouseY > 139 && mouseY < 162))//mars
        {
            mode = 5;
        }else if((mouseX > 925 && mouseX < 1012) && (mouseY > 106 && mouseY < 194))//jupiter
        {
            mode = 6;
        }else if((mouseX > 1038 && mouseX < 1130) && (mouseY > 127 && mouseY < 174))//saturn
        {
            mode = 7;
        }else if((mouseX > 1151 && mouseX < 1193) && (mouseY > 131 && mouseY < 172))//uranus
        {
            mode = 8;
        }else if((mouseX > 1218 && mouseX < 1251) && (mouseY > 133 && mouseY < 167))//neptune
        {
            mode = 9;
        }
    }

    public void draw()
    {

        if(mode == 0)
        {
            background(0);
            // stroke(255);
            // line(200, 300, mouseX, mouseY);
            // println(mouseX, mouseY);
            //println(mode);

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

            p1.drawImages(sun);
            p2.drawImages(mercury);
            p3.drawImages(venus);
            p4.drawImages(earth);
            p5.drawImages(mars);
            p6.drawImages(jupiter);
            p7.drawImages(saturn);
            p8.drawImages(uranus);
            p9.drawImages(neptune);
        }else if(mode == 1)
        {
            background(0);
            p1Info.drawInfo(sunInfo);
            // stroke(255);
            // rect(40, 40, 100, 50);
            // noStroke();
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    background(255);
                }
            }
        
        }else if(mode == 2)
        {
            background(0);
            p2Info.drawInfo(mercuryInfo);
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    background(255);
                }
            }
        }else if(mode == 3)
        {
            background(0);
            p3Info.drawInfo(venusInfo);
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    background(255);
                }
            }
        }else if(mode == 4)
        {
            background(0);
            p4Info.drawInfo(earthInfo);
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    background(255);
                }
            }
        }else if(mode == 5)
        {
            background(0);
            p5Info.drawInfo(marsInfo);
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    background(255);
                }
            }
        }else if(mode == 6)
        {
            background(0);
            p6Info.drawInfo(jupiterInfo);
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    background(255);
                }
            }
        }else if(mode == 7)
        {
            background(0);
            p7Info.drawInfo(saturnInfo);
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    background(255);
                }
            }
        }else if(mode == 8)
        {
            background(0);
            p8Info.drawInfo(uranusInfo);
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    background(255);
                }
            }
        }else if(mode == 9)
        {
            background(0);
            p9Info.drawInfo(neptuneInfo);
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    background(255);
                }
            }
        }

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
        
    }
}