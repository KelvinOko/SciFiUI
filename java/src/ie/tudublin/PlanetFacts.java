package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class PlanetFacts
{
    private String name, age, facts;
    PApplet ui;

    public PlanetFacts(TableRow row)
    {
        this.name = row.getString("Name:");
        this.age = row.getString("Age:");
        this.facts = row.getString("Interesting Facts:");
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

    /**
     * @return the age
     */
    public String getAge() 
    {
        return age;
    }

    /**
     * @param name the age to set
     */
    public void setAge(String age) 
    {
        this.age = age;
    }

    /**
     * @return the facts
     */
    public String getFacts() 
    {
        return facts;
    }

    /**
     * @param name the facts to set
     */
    public void setFacts(String facts) 
    {
        this.facts = facts;
    }

    

    

}