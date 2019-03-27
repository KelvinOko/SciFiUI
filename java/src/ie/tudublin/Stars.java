package ie.tudublin;

import processing.core.PApplet;

public class Stars{
    int noOfStars;
    PApplet ui;

    public Stars(int noOfStars, PApplet ui)
    {
        this.noOfStars = noOfStars;
        this.ui = ui;
    }

    public void drawStars()
    {
        for(int numStars = 0; numStars <= noOfStars; numStars++)
        {
            ui.stroke(255, 255, 204);
            ui.fill(255, 255, 204);
            ui.ellipse(ui.random(0,1400), ui.random(0,700), 2, 2);
        }

    }
}