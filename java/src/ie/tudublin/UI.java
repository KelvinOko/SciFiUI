package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;
import processing.data.Table;
import processing.data.TableRow;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;

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
    PlanetInfo p1cInfo, p2cInfo, p3cInfo, p4cInfo, p5cInfo,
    p6cInfo, p7cInfo, p8cInfo, p9cInfo;
    LoadScreen s, e;
    PImage sImage, eImage;
    PImage sun, mercury, venus, earth, mars, 
    jupiter, saturn, uranus, neptune;
    PImage sunInfo, mercuryInfo, venusInfo, earthInfo, marsInfo, 
    jupiterInfo, saturnInfo, uranusInfo, neptuneInfo;
    PImage suncInfo, mercurycInfo, venuscInfo, earthcInfo, marscInfo, 
    jupitercInfo, saturncInfo, uranuscInfo, neptunecInfo;
    Rings saturnRing1, saturnRing2, uranusRing, saturncRing1, saturncRing2, uranuscRing;
    int mode = -1;
    int back = 0;
    private ArrayList<Coords> coords = new ArrayList<Coords>();
    private ArrayList<PlanetFacts> FactsS = new ArrayList<PlanetFacts>();
    private ArrayList<PlanetFacts> FactsMY = new ArrayList<PlanetFacts>();
    private ArrayList<PlanetFacts> FactsV = new ArrayList<PlanetFacts>();
    private ArrayList<PlanetFacts> FactsE = new ArrayList<PlanetFacts>();
    private ArrayList<PlanetFacts> FactsMS = new ArrayList<PlanetFacts>();
    private ArrayList<PlanetFacts> FactsJ = new ArrayList<PlanetFacts>();
    private ArrayList<PlanetFacts> FactsST = new ArrayList<PlanetFacts>();
    private ArrayList<PlanetFacts> FactsU = new ArrayList<PlanetFacts>();
    private ArrayList<PlanetFacts> FactsN = new ArrayList<PlanetFacts>();
    AudioPlayer track, pTrack;
    Minim minim, pMinim;
    boolean start = false;
    PImage starfield;

    public void settings()
    {
        fullScreen(P3D);  
    }

    

    public void setup()
    {
        starfield = loadImage("stars.jpg");
        minim = new Minim(this);
        pMinim = new Minim(this);
        track = minim.loadFile("spaceship.mp3");
        track.play();
        track.loop();
        track.setGain(-15);

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

        saturnRing1 = new Rings(20, 255, 221, 153, 160, 0, 0, 400, 400, this);
        saturnRing2 = new Rings(20, 153, 153, 102, 170, 0, 0, 435, 435, this);
        saturncRing1 = new Rings(7, 255, 221, 153, 100, 0, 0, 128, 128, this);
        saturncRing2 = new Rings(7, 153, 153, 102, 110, 0, 0, 145, 145, this);
        uranusRing = new Rings(2, 220, 255, 255, 100, 0, 0, 400, 400, this);
        uranuscRing = new Rings(2, 220, 255, 255, 100, 0, 0, 135, 135, this);

        //the sun
        p1 = new Images(600, 70, 150, 150, this);
        sun = p1.loadImages("sun.png");
        p1Info = new PlanetInfo(150, this);
        sunInfo = p1Info.loadInfo("3dsun.jpg");
        p1cInfo = new PlanetInfo(50, this);
        suncInfo = p1cInfo.loadInfo("3dsun.jpg");
        //mercury
        p2 = new Images(750, 140, 24, 24, this);
        mercury = p2.loadImages("mercury.png");
        p2Info = new PlanetInfo(150, this);
        mercuryInfo = p2Info.loadInfo("3dmercury.jpg");
        p2cInfo = new PlanetInfo(50, this);
        mercurycInfo = p2cInfo.loadInfo("3dmercury.jpg");
        //venus
        p3 = new Images(790, 137, 30, 30, this);
        venus = p3.loadImages("venus.png");
        p3Info = new PlanetInfo(150, this);
        venusInfo = p3Info.loadInfo("3dvenus.jpg");
        p3cInfo = new PlanetInfo(50, this);
        venuscInfo = p3cInfo.loadInfo("3dvenus.jpg");
        //earth
        p4 = new Images(830, 134, 36, 36, this);
        earth = p4.loadImages("earth.png");
        p4Info = new PlanetInfo(150, this);
        earthInfo = p4Info.loadInfo("3dearth.jpg");
        p4cInfo = new PlanetInfo(50, this);
        earthcInfo = p4cInfo.loadInfo("3dearth.jpg");
        //mars
        p5 = new Images(875, 138, 26, 26, this);
        mars = p5.loadImages("mars.png");
        p5Info = new PlanetInfo(150, this);
        marsInfo = p5Info.loadInfo("3dmars.jpg");
        p5cInfo = new PlanetInfo(50, this);
        marscInfo = p5cInfo.loadInfo("3dmars.jpg");
        //jupiter
        p6 = new Images(923, 105, 90, 90, this);
        jupiter = p6.loadImages("jupiter.png");
        p6Info = new PlanetInfo(150, this);
        jupiterInfo = p6Info.loadInfo("3djupiter.jpg");
        p6cInfo = new PlanetInfo(50, this);
        jupitercInfo = p6cInfo.loadInfo("3djupiter.jpg");
        //saturn
        p7 = new Images(1025, 120, 120, 65, this);
        saturn = p7.loadImages("saturn.png");
        p7Info = new PlanetInfo(150, this);
        saturnInfo = p7Info.loadInfo("3dsaturn.jpg");
        p7cInfo = new PlanetInfo(50, this);
        saturncInfo = p7cInfo.loadInfo("3dsaturn.jpg");
        //uranus
        p8 = new Images(1150, 130, 44, 44, this);
        uranus = p8.loadImages("uranus.png");
        p8Info = new PlanetInfo(150, this);
        uranusInfo = p8Info.loadInfo("3duranus.jpg");
        p8cInfo = new PlanetInfo(50, this);
        uranuscInfo = p8cInfo.loadInfo("3duranus.jpg");
        //neptune
        p9 = new Images(1210, 125, 50, 50, this);
        neptune = p9.loadImages("neptune.png");
        p9Info = new PlanetInfo(150, this);
        neptuneInfo = p9Info.loadInfo("3dneptune.jpg");
        p9cInfo = new PlanetInfo(50, this);
        neptunecInfo = p9cInfo.loadInfo("3dneptune.jpg");

        //loadingScreen
        s = new LoadScreen(150, this);
        sImage = s.load("3dsun.jpg");
        e = new LoadScreen(75, this);
        eImage = e.load("3dearth.jpg");

        loadCoords();
        loadSunFacts();
        loadMercuryFacts();
        loadVenusFacts();
        loadEarthFacts();
        loadMarsFacts();
        loadJupiterFacts();
        loadSaturnFacts();
        loadUranusFacts();
        loadNeptuneFacts();
    }

    public void mousePressed()
    {
        
        if((mouseX > 610 && mouseX < 740) && (mouseY > 80 && mouseY < 210))//sun
        {
            mode = 1;
            pTrack = minim.loadFile("sun.mp3");
            pTrack.play();
        }else if((mouseX > 754 && mouseX < 770) && (mouseY > 143 && mouseY < 161))//mercury 
        {
            mode = 2; 
            pTrack = minim.loadFile("mercury.mp3");
            pTrack.play();
        }else if((mouseX > 791 && mouseX < 819) && (mouseY > 138 && mouseY < 167))//venus
        {
            mode = 3;
            pTrack = minim.loadFile("venus.mp3");
            pTrack.play();
        }else if((mouseX > 833 && mouseX < 863) && (mouseY > 138 && mouseY < 167))//earth
        {
            mode = 4;
            pTrack = minim.loadFile("earth.mp3");
            pTrack.play();
        }else if((mouseX > 876 && mouseX < 900) && (mouseY > 139 && mouseY < 162))//mars
        {
            mode = 5;
            pTrack = minim.loadFile("mars.mp3");
            pTrack.play();
        }else if((mouseX > 925 && mouseX < 1012) && (mouseY > 106 && mouseY < 194))//jupiter
        {
            mode = 6;
            pTrack = minim.loadFile("jupiter.mp3");
            pTrack.play();
        }else if((mouseX > 1038 && mouseX < 1130) && (mouseY > 127 && mouseY < 174))//saturn
        {
            mode = 7;
            pTrack = minim.loadFile("saturn.mp3");
            pTrack.play();
        }else if((mouseX > 1151 && mouseX < 1193) && (mouseY > 131 && mouseY < 172))//uranus
        {
            mode = 8;
            pTrack = minim.loadFile("uranus.mp3");
            pTrack.play();
        }else if((mouseX > 1218 && mouseX < 1251) && (mouseY > 133 && mouseY < 167))//neptune
        {
            mode = 9;
            pTrack = minim.loadFile("neptune.mp3");
            pTrack.play();
        }

        if((mode == 1 || mode == 2 || mode == 3 || mode == 4 || mode == 5 || mode == 6 || mode == 7 || mode == 8 || mode == 9) && (mouseX > 100 && mouseX < 200) && (mouseY > 600 && mouseY < 650))
            {
                mode = 0;
            }
    }



    public void loadCoords() 
    {
        Table table = loadTable("coords.csv", "header");
        for (TableRow row : table.rows()) 
        {
            Coords coord = new Coords(row);
            coords.add(coord);
        }
    }

    
    public void drawCoords()
    {
        for(Coords coord : coords)
        {
            stroke(255);
            fill(255);
            ellipse(coord.getX(), coord.getY(), coord.getDiameter(), coord.getDiameter());
            if(coord.hover)
            {
              fill(255);
              textAlign(CENTER);
              text(coord.getName(), coord.getX(), coord.getY() + coord.getDiameter()/2 + 20);
              noStroke();
              if((mouseX > 950 && mouseX < 956) && (mouseY > 470 && mouseY < 476))//sun
              {
                  p1cInfo.drawCInfo(suncInfo);
              }else if((mouseX > 1000 && mouseX < 1006) && (mouseY > 470 && mouseY < 476))//mercury 
              {
                  p2cInfo.drawCInfo(mercurycInfo);
              }else if((mouseX > 1005 && mouseX < 1011) && (mouseY > 430 && mouseY < 436))//venus
              {
                p3cInfo.drawCInfo(venuscInfo);
              }else if((mouseX > 880 && mouseX < 886) && (mouseY > 405 && mouseY < 411))//earth
              {
                p4cInfo.drawCInfo(earthcInfo);
              }else if((mouseX > 1037 && mouseX < 1043) && (mouseY > 538 && mouseY < 544))//mars
              {
                p5cInfo.drawCInfo(marscInfo);
              }else if((mouseX > 868 && mouseX < 874) && (mouseY > 574 && mouseY < 580))//jupiter
              {
                p6cInfo.drawCInfo(jupitercInfo);
              }else if((mouseX > 1075 && mouseX < 1081) && (mouseY > 387 && mouseY < 393))//saturn
              {
                p7cInfo.drawCInfo(saturncInfo);
                saturncRing1.drawcRings();
                saturncRing2.drawcRings();
              }else if((mouseX > 964 && mouseX < 970) && (mouseY > 295 && mouseY < 301))//uranus
              {
                p8cInfo.drawCInfo(uranuscInfo);
                uranuscRing.drawcRings();
              }else if((mouseX > 750 && mouseX < 756) && (mouseY > 457 && mouseY < 463))//neptune
              {
                p9cInfo.drawCInfo(neptunecInfo);
              }
            }
            noFill();
            noStroke();
        }
    }

    public void loadSunFacts() 
    {
        Table table = loadTable("sun.csv", "header");
        for (TableRow row : table.rows()) 
        {
            PlanetFacts sFacts = new PlanetFacts(row);
            FactsS.add(sFacts);
        }
    }

    public void drawSunFacts()
    {
        for(PlanetFacts sFacts : FactsS)
        {
            stroke(255);
            fill(255);
            textSize(20);
            textAlign(LEFT);
            text(sFacts.getName(), 100, 150);
            text(sFacts.getAge(), 100, 230);
            text(sFacts.getFacts(), 100, 260, 500, 450);
            noFill();
            noStroke();
        }
    }

    public void loadMercuryFacts() 
    {
        Table table = loadTable("mercury.csv", "header");
        for (TableRow row : table.rows()) 
        {
            PlanetFacts myFacts = new PlanetFacts(row);
            FactsMY.add(myFacts);
        }
    }

    public void drawMercuryFacts()
    {
        for(PlanetFacts myFacts : FactsMY)
        {
            stroke(255);
            fill(255);
            textSize(20);
            textAlign(LEFT);
            text(myFacts.getName(), 100, 150);
            text(myFacts.getAge(), 100, 230);
            text(myFacts.getFacts(), 100, 260, 500, 450);
            noFill();
            noStroke();
        }
    }

    public void loadVenusFacts() 
    {
        Table table = loadTable("venus.csv", "header");
        for (TableRow row : table.rows()) 
        {
            PlanetFacts vFacts = new PlanetFacts(row);
            FactsV.add(vFacts);
        }
    }

    public void drawVenusFacts()
    {
        for(PlanetFacts vFacts : FactsV)
        {
            stroke(255);
            fill(255);
            textSize(20);
            textAlign(LEFT);
            text(vFacts.getName(), 100, 150);
            text(vFacts.getAge(), 100, 230);
            text(vFacts.getFacts(), 100, 260, 500, 450);
            noFill();
            noStroke();
        }
    }

    public void loadEarthFacts() 
    {
        Table table = loadTable("earth.csv", "header");
        for (TableRow row : table.rows()) 
        {
            PlanetFacts eFacts = new PlanetFacts(row);
            FactsE.add(eFacts);
        }
    }

    public void drawEarthFacts()
    {
        for(PlanetFacts eFacts : FactsE)
        {
            stroke(255);
            fill(255);
            textSize(20);
            textAlign(LEFT);
            text(eFacts.getName(), 100, 150);
            text(eFacts.getAge(), 100, 230);
            text(eFacts.getFacts(), 100, 260, 500, 450);
            noFill();
            noStroke();
        }
    }

    public void loadMarsFacts() 
    {
        Table table = loadTable("mars.csv", "header");
        for (TableRow row : table.rows()) 
        {
            PlanetFacts msFacts = new PlanetFacts(row);
            FactsMS.add(msFacts);
        }
    }

    public void drawMarsFacts()
    {
        for(PlanetFacts msFacts : FactsMS)
        {
            stroke(255);
            fill(255);
            textSize(20);
            textAlign(LEFT);
            text(msFacts.getName(), 100, 150);
            text(msFacts.getAge(), 100, 230);
            text(msFacts.getFacts(), 100, 260, 500, 450);
            noFill();
            noStroke();
        }
    }

    public void loadJupiterFacts() 
    {
        Table table = loadTable("jupiter.csv", "header");
        for (TableRow row : table.rows()) 
        {
            PlanetFacts jFacts = new PlanetFacts(row);
            FactsJ.add(jFacts);
        }
    }

    public void drawJupiterFacts()
    {
        for(PlanetFacts jFacts : FactsJ)
        {
            stroke(255);
            fill(255);
            textSize(20);
            textAlign(LEFT);
            text(jFacts.getName(), 100, 150);
            text(jFacts.getAge(), 100, 230);
            text(jFacts.getFacts(), 100, 260, 500, 450);
            noFill();
            noStroke();
        }
    }

    public void loadSaturnFacts() 
    {
        Table table = loadTable("saturn.csv", "header");
        for (TableRow row : table.rows()) 
        {
            PlanetFacts stFacts = new PlanetFacts(row);
            FactsST.add(stFacts);
        }
    }

    public void drawSaturnFacts()
    {
        for(PlanetFacts stFacts : FactsST)
        {
            stroke(255);
            fill(255);
            textSize(20);
            textAlign(LEFT);
            text(stFacts.getName(), 100, 150);
            text(stFacts.getAge(), 100, 230);
            text(stFacts.getFacts(), 100, 260, 500, 450);
            noFill();
            noStroke();
        }
    }

    public void loadUranusFacts() 
    {
        Table table = loadTable("uranus.csv", "header");
        for (TableRow row : table.rows()) 
        {
            PlanetFacts uFacts = new PlanetFacts(row);
            FactsU.add(uFacts);
        }
    }

    public void drawUranusFacts()
    {
        for(PlanetFacts uFacts : FactsU)
        {
            stroke(255);
            fill(255);
            textSize(20);
            textAlign(LEFT);
            text(uFacts.getName(), 100, 150);
            text(uFacts.getAge(), 100, 230);
            text(uFacts.getFacts(), 100, 260, 500, 450);
            noFill();
            noStroke();
        }
    }

    public void loadNeptuneFacts() 
    {
        Table table = loadTable("neptune.csv", "header");
        for (TableRow row : table.rows()) 
        {
            PlanetFacts nFacts = new PlanetFacts(row);
            FactsN.add(nFacts);
        }
    }

    public void drawNeptuneFacts()
    {
        for(PlanetFacts nFacts : FactsN)
        {
            stroke(255);
            fill(255);
            textSize(20);
            textAlign(LEFT);
            text(nFacts.getName(), 100, 150);
            text(nFacts.getAge(), 100, 230);
            text(nFacts.getFacts(), 100, 260, 500, 450);
            noFill();
            noStroke();
        }
    }

    float bar = 0;
    public void load()
    {   
        float cx = width /2;
        fill(0, 0, 102);
        stroke(0);
        rect(cx - 220, height - 150, 450, 50);
        fill(255);
        rect(cx - 220, height - 150, bar, 50);
        if(bar == 450)
        {
            bar = 450;
            fill(255);
            rect(cx - 220, height - 150, bar, 50);
            start = true;
            mode = 0;
        } else {
            bar++;
        }
    }

    public void draw()
    {
        if(start == false)
        {
            background(starfield);
            noStroke();
            pushMatrix();
            translate(width/2, height/2, -300);
            pushMatrix();
            rotateY(PI * frameCount / 500);
            s.drawInfo(sImage);
            popMatrix();
            pointLight(255,  255,  255,  0,  0,  0);  
            rotateY(PI * frameCount / 300);
            translate(0, 0, 270);
            e.drawInfo(eImage);
            popMatrix();
            noLights();
            load();
        }
        else if(mode == 0)
        {
            background(0);

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

            for(int c = 0; c < coords.size(); c++)
            {
                coords.get(c).rollover(mouseX, mouseY);
            }

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

            for(int w = 0; w < coords.size(); w++)
            {
                drawCoords();
            }

        }else if(mode == 1)
        {
            background(0);
            stars.drawStars();
            noStroke();
            p1Info.drawInfo(sunInfo);
            p1Info.drawBack();
            for(int w = 0; w < FactsS.size(); w++)
            {
                drawSunFacts();
            }
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    mode = 0;
                }
            }
        
        }else if(mode == 2)
        {
            background(0);
            stars.drawStars();
            noStroke();
            p2Info.drawInfo(mercuryInfo);
            p2Info.drawBack();
            for(int w = 0; w < FactsMY.size(); w++)
            {
                drawMercuryFacts();
            }
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    mode = 0;
                }
            }
        }else if(mode == 3)
        {
            background(0);
            stars.drawStars();
            noStroke();
            p3Info.drawInfo(venusInfo);
            p3Info.drawBack();
            for(int w = 0; w < FactsMY.size(); w++)
            {
                drawVenusFacts();
            }
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    mode = 0;
                }
            }
        }else if(mode == 4)
        {
            background(0);
            stars.drawStars();
            noStroke();
            p4Info.drawInfo(earthInfo);
            p4Info.drawBack();
            for(int w = 0; w < FactsMY.size(); w++)
            {
                drawEarthFacts();
            }
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    mode = 0;
                }
            }
        }else if(mode == 5)
        {
            background(0);
            stars.drawStars();
            noStroke();
            p5Info.drawInfo(marsInfo);
            p5Info.drawBack();
            for(int w = 0; w < FactsMY.size(); w++)
            {
                drawMarsFacts();
            }
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    mode = 0;
                }
            }
        }else if(mode == 6)
        {
            background(0);
            stars.drawStars();
            noStroke();
            p6Info.drawInfo(jupiterInfo);
            p6Info.drawBack();
            for(int w = 0; w < FactsMY.size(); w++)
            {
                drawJupiterFacts();
            }
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    mode = 0;
                }
            }
        }else if(mode == 7)
        {
            background(0);
            stars.drawStars();
            noStroke();
            p7Info.drawInfo(saturnInfo);
            p7Info.drawBack();
            saturnRing1.drawRings();
            saturnRing2.drawRings();
            for(int w = 0; w < FactsMY.size(); w++)
            {
                drawSaturnFacts();
            }
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    mode = 0;
                }
            }
        }else if(mode == 8)
        {
            background(0);
            stars.drawStars();
            noStroke();
            p8Info.drawInfo(uranusInfo);
            p8Info.drawBack();
            uranusRing.drawRings();
            for(int w = 0; w < FactsMY.size(); w++)
            {
                drawUranusFacts();
            }
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    mode = 0;
                }
            }
        }else if(mode == 9)
        {
            background(0);
            stars.drawStars();
            noStroke();
            p9Info.drawInfo(neptuneInfo);
            p9Info.drawBack();
            for(int w = 0; w < FactsMY.size(); w++)
            {
                drawNeptuneFacts();
            }
            if(keyPressed)
            {
                if (key == 'b' || key == 'B')
                {
                    mode = 0;
                }
            }
        }
        
    }
}