package ie.tudublin;

import processing.core.PApplet;

public class SolarSystem
{
    PApplet ui;

    public SolarSystem(PApplet ui)
    {
        this.ui = ui;
    }


    public void drawSolarSystem()
    {
        ui.stroke(255, 100);
        //the sun 
        ui.fill(255, 150, 0);
        ui.ellipse(220, 220, 100, 100);
        
        //mercury
        ui.fill(204, 102, 0);
        ui.ellipse(285, 220, 20, 20);
        
        //venus
        ui.fill(255, 102, 0);
        ui.ellipse(280, 180, 25, 25);
        
        //earth
        ui.fill(0, 0, 190);
        ui.ellipse(155, 160, 40, 40);
        //land1
        ui.fill(0, 255, 0);
        ui.noStroke();
        ui.ellipse(162, 160, 15, 10);
        ui.triangle(160, 162, 164, 172, 169, 162);
        //land2
        ui.fill(0, 255, 0);
        ui.noStroke();
        ui.ellipse(147, 154, 15, 10);
        ui.triangle(139, 156, 148, 162, 154, 156);
        //cloud1
        ui.fill(255);
        ui.ellipse(160, 155, 5, 5);
        ui.ellipse(163, 153, 5, 5);
        ui.ellipse(162, 158, 5, 5);
        ui.ellipse(158, 152, 5, 5);
        ui.ellipse(158, 158, 5, 5);
        //cloud2
        ui.fill(255);
        ui.ellipse(148, 166, 5, 5);
        ui.ellipse(152, 164, 5, 5);
        ui.ellipse(150, 169, 5, 5);
        ui.ellipse(146, 164, 5, 5);
        ui.ellipse(146, 169, 5, 5);
        
        //mars
        ui.fill(255, 51,0);
        ui.ellipse(320, 300, 32, 32);
        
        //jupiter
        ui.fill(255, 204, 102);
        ui.ellipse(125, 320, 52, 52);
        ui.stroke(190, 101, 0);//1
        ui.line(99, 316, 150, 316);
        /////////////////////////
        ui.stroke(240, 153, 51);//2
        ui.line(99, 324, 150, 324);
        /////////////////////////
        ui.stroke(255, 100);//3
        ui.line(99, 319, 150, 319);
        /////////////////////////
        ui.stroke(190, 101, 0);//4
        ui.line(100, 327, 149, 327);
        /////////////////////////
        ui.stroke(255, 100);//5
        ui.line(101, 329, 148, 329);
        /////////////////////////
        ui.stroke(190, 101, 0);//6
        ui.line(103, 335, 146, 335);
        /////////////////////////
        ui.stroke(255, 100);//7
        ui.line(106, 339, 143, 339);
        /////////////////////////
        ui.stroke(240, 153, 51);//8
        ui.line(112, 343, 138, 343);
        /////////////////////////
        ui.stroke(255, 100);//9
        ui.line(100, 313, 149, 313);
        /////////////////////////
        ui.stroke(255, 154, 51);//10
        ui.line(102, 307, 148, 307);
        /////////////////////////
        ui.stroke(255, 100);//11
        ui.line(104, 304, 145, 304);
        /////////////////////////
        ui.stroke(240, 153, 51);//12
        ui.line(108, 300, 141, 300);
        /////////////////////////
        ui.stroke(255, 100);//13
        ui.line(111, 297, 138, 297);
        
        //saturn
        ui.fill(255, 204, 102);
        ui.ellipse(370, 120, 43, 43);
        ui.stroke(255, 150);
        ui.line(345, 132, 392, 105);
        
        //uranus
        ui.fill(40, 204, 240);
        ui.ellipse(230, 70, 41, 41);
        ui.stroke(255, 105);
        ui.line(215, 82, 245, 56);
        
        //neptune
        ui.fill(0, 102, 204);
        ui.ellipse(24, 200, 41, 41);
    }

}