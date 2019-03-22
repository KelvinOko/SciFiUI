package ie.tudublin;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new UI());
		
	}

	public void starMap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StarMap());
		
	}

	public void map()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Map());
		
	}

	public void ui()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new UI());
		
	}
	public static void main(String[] args)
	{
		Main main = new Main();
		main.ui();			
	}
}