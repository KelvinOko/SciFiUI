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
        
    }

}