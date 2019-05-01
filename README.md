# SciFi UI Project

Name: Kelvin Oko

Student Number: C17306113 

Fork this repository and use it a starter project for your assignment

# Description of the assignment
This assignment is based off the idea of a planetarium. I created it as a fun/interactive way to learn more about our solar system and the planets in it.

# Instructions
It starts off with a loading screen, which when finished will redirect the user to the main screen. The main screen features a non-interactive 2D model of the solar system, with the planets orbiting the sun. To the right of that model are a series of interactive pictures of the sun and each planet. When you click on any of these pictures, the user will be taken to another screen, showing a 3D model of the corresponding planet rotating on it's y-axis. On a separate screen will also feature some information about the corresponding planet.
At the buttom of each of these pages is a back button that will redirect the user back to the main page.
The main page also features a graph with coordinates (not accurate) of the planets. When the user hovers over each coordinate, the corrsponding name of the planet will appear underneath the coordinate, while a miniature 3D model of the planet will be displayed on the right side of this graph.

# How it works
Most of the classes created are basically blueprints for the objects to be created. stars, Radar, circle, lines, planets, addtions, planetlines, planetinfo, grid, coords, images, planetfacts, rings

The Stars class was the first class made. It was created to generate the stars seen in the background of the ui.

A total of 6 classes were needed in order to create the 2D solar system model. The Radar class, as the name suggest, created the radar (outermost circle of the radar and the rotating line) in which everything lies upon. The Circle class was needed to draw the remaining circles within the radar while the lines class created the horizontal and vertical lines within the radar. The Planets class drew the 2D planets on the radar. The Planets class is also responsible for orbiting each planet around the sun with their own individual speeds. I made the Additions class to draw the land & clouds on the 2D model of the earth on the radar. Lastly the PlanetLines class drew and rotated the lines on the 2D model of jupiter on the radar as well as the rings around saturn and uranus.

The graph was created and implemented using 3 classes. The Grid class was used to draw out the actual grid. The Coords class was created to retrieve information from the coords file which was then used to plot the coordinates onto the graph. The UI class featured code that loaded and drew these coordinates. Inside the Coords class is code for a hover function which was used to display the name & the corresponding miniature 3D model of each planet when you hover over the corrsponding coordinate on the graph. In order to generate these miniature 3D models, I created the PlanetInfo class. This class is responsible for creating 3D spheres and loading & wrapping different planet textures around each sphere to create a different planet

In order to create the series of interactive pictures at the top, I created the Images class to firstly display the pictures. In the UI file, in a mousePressed function, there is a piece of code responsible for directing the user to another page, featuring information of each planet and a larger 3D model of each of them when their corresponding image is clicked. The PlanetFacts class was created to retrieve this information about each planet from their corresponding csv files. While in the UI file I created 2 more functions for each planet which loaded and displayed the retrieved information. There is a back button on each of these pages corrsponding to a piece of code in the mousePressed function in the UI class to take the user back to the main page.

The Rings class was created to draw Rings around the 3D models of Saturn and Uranus. It did this by drawing an ellipse without a fill but with a thick stroke thus creating the illusion of a ring. As well as drawing them, it rotated the rings around their y-axis to correspond with the roatation of the 3D models.


# What I am most proud of in the assignment
I'm really proud of the fact that I've been able to create what I consider to be a stepping stone to advancing our knowledge of the solar system and it's constituents. With this UI, people are able to gain more knowledge and possibly acquire further insights into the gravitationally bound planetary system we know and call the solar system. Coding wise, I was really happy with the way the 3D model of the planets turned out. It wasn't easy to implement but turned out to work well and it proved to be really useful for this assignment.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](https://i.ytimg.com/vi/hZGYoId13vs/hqdefault.jpg)](https://www.youtube.com/watch?v=hZGYoId13vs&feature=youtu.be)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

