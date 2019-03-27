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
        ui.ellipse(280, 280, 120, 120);//m
        ui.ellipse(280, 280, 148, 148);//v
        ui.ellipse(280, 280, 195, 195);//e
        ui.ellipse(280, 280, 245, 245);//m
        ui.ellipse(280, 280, 295, 295);//j
        ui.ellipse(280, 280, 315, 315);//s
        ui.ellipse(280, 280, 245, 245);//u

        ui.stroke(128, 0, 128);
        ui.line(280, 50, 280, 510);
        ui.line(50, 280, 510, 280);

        }
}