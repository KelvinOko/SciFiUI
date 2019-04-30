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
Most of the classes created are basically blueprints for the objects to be created. Radar, circle, lines, planets, addtions, planetlines

A total of 6 classes were needed in order to create the 2D solar system model. The Radar class, as the name suggest, created the radar (outermost circle of the radar and the rotating line) in which everything lies upon. The Circle class was needed to draw the remaining circles within the radar while the lines class created the horizontal and vertical lines within the radar. The Planets class drew the 2D planets on the radar. The Planets class is also responsible for orbiting each planet around the sun at their own sepa the planets 


The Additions class assits in the creation of the 2D solar system model, by drawing the earth/clouds on the 2D earth model and the multiple lines on the 2D jupiter model.
I created the a Circle class to draw circles wherever & whenever needed, they are used to draw the decreasing circles inside my radar.
The Coords was created to load the coords file with it's contents used in the making of the coordinate graph. The grid class created the graph used for the coordinates. 

# What I am most proud of in the assignment
I'm really proud of the fact that I've been able to create what I consider to be a stepping stone to advancing our knowledge of the solar system and it's constituents. With this UI, people are able to gain more knowledge and possibly acquire further insights into the gravitationally bound planetary system we know and call the solar system.

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

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

