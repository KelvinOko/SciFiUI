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
        ui.noFill();
        ui.ellipse(220, 220, 320, 320);
        ui.ellipse(220, 220, 220, 220);
        ui.ellipse(220, 220, 120, 120);

        ui.stroke(128, 0, 128);
        //ui.line(220, 220, ui.mouseX, ui.mouseY);
        ui.line(220, 20, 220, 420);
        ui.line(20, 220, 420, 220);
        //println(mouseX, mouseY);

        }
}