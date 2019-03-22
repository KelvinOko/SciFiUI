package ie.tudublin;

import processing.core.PApplet;

public class Circle{
    int noOfCircles;
    int currCircles;
    PApplet ui;

    public Circle(int noOfCircles, int currCircles, PApplet ui)
    {
        this.noOfCircles = noOfCircles;
        this.currCircles = currCircles;
        this.ui = ui;
    }

    public void drawCircle()
    {

        int numCircles = currCircles;
        while (numCircles <= noOfCircles)
        {
            ui.stroke(255, 255, 204);
            ui.fill(255, 255, 204);
            ui.ellipse(ui.random(0,1000), ui.random(0,600), 2, 2);
            numCircles = numCircles + 1;
        }

        ui.stroke(128, 0, 128);
        ui.fill(50, 150);
        ui.ellipse(220, 220, 400, 400);

        ui.stroke(128, 0, 128);
        ui.line(220, 220, ui.mouseX, ui.mouseY);
        //println(mouseX, mouseY);

        }
}