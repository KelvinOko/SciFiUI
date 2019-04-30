package ie.tudublin;

import processing.core.PApplet;

public abstract class Super
{
    protected float x, y;
    protected PApplet ui;

    public Super(float x, float y, PApplet ui)
    {
        this.x = x;
        this.y = y;
        this.ui = ui;
    }
}