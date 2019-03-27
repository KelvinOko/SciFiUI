package ie.tudublin;

import processing.core.PApplet;

public class Circle{
    int noOfCircles;
    PApplet ui;

    public Circle(int noOfCircles, PApplet ui)
    {
        this.noOfCircles = noOfCircles;
        this.ui = ui;
    }

    public void drawCircle()
    {
        for(int numCircles = 0; numCircles <= noOfCircles; numCircles++)
        {
            ui.stroke(255, 255, 204);
            ui.fill(255, 255, 204);
            ui.ellipse(ui.random(0,1400), ui.random(0,700), 2, 2);
        }

        ui.stroke(128, 0, 128);
        ui.noFill();
        ui.ellipse(310, 310, 120, 120);//m
        ui.ellipse(310, 310, 168, 168);//v
        ui.ellipse(310, 310, 220, 220);//e
        ui.ellipse(310, 310, 270, 270);//m
        ui.ellipse(310, 310, 330, 330);//j
        ui.ellipse(310, 310, 385, 385);//s
        ui.ellipse(310, 310, 445, 445);//u

        ui.stroke(128, 0, 128);
        ui.line(310, 45, 310, 575);//vertical
        ui.line(45, 310, 575, 310);//horizontal

        }
}