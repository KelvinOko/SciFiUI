package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Coords
{
    private float x, y, diameter;
    private String name;
    PApplet ui;

    boolean hover = false;

    public Coords(TableRow row)
    {
        this.x = row.getFloat("x");
        this.y = row.getFloat("y");
        this.diameter = row.getFloat("diameter");
        this.name = row.getString("name");
    }

    public void rollover(float rx, float ry)
    {
        float d = ui.dist(rx, ry, x, y);
        if(d < diameter /2)
        {
            hover = true;
        } else {
            hover = false;
        }
    }

    /**
     * @return the x
     */
    public float getX() 
    {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) 
    {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() 
    {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) 
    {
        this.y = y;
    }

    /**
     * @return the diameter
     */
    public float getDiameter() 
    {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    public void setDiameter(float diameter) 
    {
        this.diameter = diameter;
    }

    /**
     * @return the name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) 
    {
        this.name = name;
    }

}