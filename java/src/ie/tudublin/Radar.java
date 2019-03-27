package ie.tudublin;

//import processing.core.PApplet;
import processing.core.PVector;

public class Radar
{
    UI ui;
    private float x;
    private float y;
    private float diameter;
    private float radius;
    private float rotation;
    private PVector pos;


    public Radar(UI ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        radius = (diameter / 2) - 62;
        pos = new PVector(x, y);
        
    }

    public void render()
    {
        
        //big outer circle
        ui.stroke(128, 0, 128);
        ui.fill(50, 50);
        ui.translate(pos.x, pos.y);
        //ui.strokeWeight(2);
        ui.ellipse(x, y, diameter, diameter);
        //rotating line
        ui.fill(255);
        ui.rotate(rotation);
        ui.line(x , y , x - radius  , y - radius );
    }

    public void update()
    {
        this.x = (float) Math.sin(rotation);
        this.y = - (float) Math.cos(rotation);
        rotation += 0.03f; 
    }

    /**
     * @return the ui
     */
    public UI getUi() {
        return ui;
    }

    /**
     * @param ui the ui to set
     */
    public void setUi(UI ui) {
        this.ui = ui;
    }

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * @return the diameter
     */
    public float getDiameter() {
        return diameter;
    }

    /**
     * @param diameter the diameter to set
     */
    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    /**
     * @return the radius
     */
    public float getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     * @return the rotation
     */
    public float getRotation() {
        return rotation;
    }

    /**
     * @param rotation the rotation to set
     */
    public void setRotation(float rotation) {
        this.rotation = rotation;
    }
}