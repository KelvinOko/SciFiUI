package ie.tudublin;

import processing.core.PApplet;

public class SolarSystem
{
    float WLines, BLines, LBLines;
    float wx1, wy1, wx2, wy2, bx1, by1, bx2, by2, lbx1, lby1, lbx2, lby2;
    PApplet ui;

    public SolarSystem(float Wlines, float BLines, float LBLines, float wx1, float wy1, 
    float wx2, float wy2, float bx1, float by1, float bx2, float by2, float lbx1, float lby1, 
    float lbx2, float lby2, PApplet ui)
    {
        this.WLines = Wlines;
        this.BLines = BLines;
        this.LBLines = LBLines;
        this.wx1 = wx1;
        this.wy1 = wy1;
        this.wx2 = wx2;
        this.wy2 = wy2;

        this.bx1 = bx1;
        this.by1 = by1;
        this.bx2 = bx2;
        this.by2 = by2;

        this.lbx1 = lbx1;
        this.lby1 = lby1;
        this.lbx2 = lbx2;
        this.lby2 = lby2;
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