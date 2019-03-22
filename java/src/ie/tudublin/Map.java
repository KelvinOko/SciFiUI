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

    int x;
    int y;
    int limitX1 = 500;
    int limitY1 = 150;
    int limitX2 = 900;
    int limitY2 = 550;
    int noOfCircles;
    int currCircles;
    int noOfTextS;
    int noOfTextD;
    public void draw()
    {
        background(0);

        noOfCircles = 100;
        currCircles = 0;
        while (currCircles <= noOfCircles)
        {
            stroke(255, 255, 204);
            fill(255, 255, 204);
            ellipse(random(0,1000), random(0,600), 2, 2);
            currCircles = currCircles + 1;
        }

        stroke(128, 0, 128);
        fill(50, 150);
        ellipse(220, 220, 400, 400);

        stroke(128, 0, 128);
        line(220, 220, mouseX, mouseY);
        //println(mouseX, mouseY);

        x = limitX1;
        noOfTextS = 0;
        while (x < limitX2 + 40)
        {
            fill(255);
            textSize(15);
            text(noOfTextS, x - 5, limitY1 - 15);
            stroke(128, 0, 128);
            line(x, limitY1 - 10, x, limitY2);
            x = x + 40;
            noOfTextS = noOfTextS + 1;
        }

        y = limitY1;
        noOfTextD = 0;
        while (y < limitY2 + 40)
        {
            fill(255);
            textSize(15);
            text(noOfTextD, limitX1 - 25, y + 7);
            stroke(128, 0, 128);
            line(limitX1 - 10, y, limitX2, y);
            y = y + 40;
            noOfTextD = noOfTextD + 1;
        }
    }

}

