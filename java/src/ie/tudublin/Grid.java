package ie.tudublin;

import processing.core.PApplet;

public class Grid
{
    int x;
    int y;
    int limitX1 = 500;
    int limitY1 = 150;
    int limitX2 = 900;
    int limitY2 = 550;
    int noOfTextS;
    int noOfTextD;
    PApplet ui;

    public Grid(int x, int y, int limitX1, int limitY1, 
    int limitX2, int limitY2, int noOfTextS,
    int noOfTextD, PApplet ui)
    {
        this.x = x; 
        this.y = y; 
        this.limitX1 = limitX1;
        this.limitY1 = limitY1; 
        this.limitX2 = limitX2; 
        this.limitY2 = limitY2;
        this.noOfTextS = noOfTextS;
        this.noOfTextD = noOfTextD;
        this.ui = ui;
    }

    public void drawGrid()
    {

        x = limitX1;
        noOfTextS = 0;
        while (x < limitX2 + 40)
        {
            ui.fill(255);
            ui.textSize(15);
            ui.text(noOfTextS, x - 5, limitY1 - 15);
            ui.stroke(128, 0, 128);
            ui.line(x, limitY1 - 10, x, limitY2);
            x = x + 40;
            noOfTextS = noOfTextS + 1;
        }

        y = limitY1;
        noOfTextD = 0;
        while (y < limitY2 + 40)
        {
            ui.fill(255);
            ui.textSize(15);
            ui.text(noOfTextD, limitX1 - 25, y + 7);
            ui.stroke(128, 0, 128);
            ui.line(limitX1 - 10, y, limitX2, y);
            y = y + 40;
            noOfTextD = noOfTextD + 1;
        }
    }

}