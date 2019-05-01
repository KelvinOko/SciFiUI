# SciFi UI Project

Name: Kelvin Oko

Student Number: C17306113 

Fork this repository and use it a starter project for your assignment

# Description of the assignment
This assignment is based off the idea of a planetarium. I created it as a fun/interactive way to learn more about our solar system and the planets in it.

# Instructions
Throughout the user's use of the ui, a soundtrack will be played. It starts off with a loading screen, which when finished will redirect the user to the main screen. The main screen features a non-interactive 2D model of the solar system, with the planets orbiting the sun. To the right of that model are a series of interactive pictures of the sun and each planet. When you click on any of these pictures, the user will be taken to another screen, showing a 3D model of the corresponding planet rotating on it's y-axis. On a separate screen will also feature some information about the corresponding planet.
At the buttom of each of these pages is a back button that will redirect the user back to the main page.
The main page also features a graph with coordinates (not accurate) of the planets. When the user hovers over each coordinate, the corrsponding name of the planet will appear underneath the coordinate, while a miniature 3D model of the planet will be displayed on the right side of this graph.

# How it works
Most of the classes created are basically blueprints for the objects to be created.

Main Classes: UI, Super, Stars, Radar, Circles, Lines, Planets, Additions, PlanetLines, PlanetInfo, Grid, Coords, Images, PlanetFacts, Rings, LoadScreen

The UI class is the main class where everything is called and rendered.

The Super Class is the super class which other classes will need to inherit from.

The Stars class was the first class made. It was created to generate the stars seen in the background of the ui.

A total of 6 classes were needed in order to create the 2D solar system model. The Radar class, as the name suggest, created the radar (outermost circle of the radar and the rotating line) in which everything lies upon. The Circle class was needed to draw the remaining circles within the radar while the lines class created the horizontal and vertical lines within the radar. The Planets class drew the 2D planets on the radar. The Planets class is also responsible for orbiting each planet around the sun with their own individual speeds. I made the Additions class to draw the land & clouds on the 2D model of the earth on the radar. Lastly the PlanetLines class drew and rotated the lines on the 2D model of jupiter on the radar as well as the rings around saturn and uranus.

The graph was created and implemented using 3 classes. The Grid class was used to draw out the actual grid. The Coords class was created to retrieve information from the coords file which was then used to plot the coordinates onto the graph. The UI class featured code that loaded and drew these coordinates. Inside the Coords class is code for a hover function which was used to display the name & the corresponding miniature 3D model of each planet when you hover over the corrsponding coordinate on the graph. In order to generate these miniature 3D models, I created the PlanetInfo class. This class is responsible for creating 3D spheres and loading & wrapping different planet textures around each sphere to create a different planet

In order to create the series of interactive pictures at the top, I created the Images class to firstly display the pictures. In the UI file, in a mousePressed function, there is a piece of code responsible for directing the user to another page, featuring information of each planet and a larger 3D model of each of them when their corresponding image is clicked. The PlanetFacts class was created to retrieve this information about each planet from their corresponding csv files. While in the UI file I created 2 more functions for each planet which loaded and displayed the retrieved information. There is a back button on each of these pages corrsponding to a piece of code in the mousePressed function in the UI class to take the user back to the main page. In the UI file, I created a variable called mode, which would be used to set different modes for the user interface. Each mode will be drawn depending on which picture was clicked. For example if the picture of the Sun was clicked, the value of mode would become 1 and as a result only the things associated with the Sun would be drawn, i.e. the page containing information about the Sun with it's 3D model. When each picture is clicked, a soundtrack stating the name of the planet's picture clicked is played. 

The Rings class was created to draw Rings around the 3D models of Saturn and Uranus. It did this by drawing an ellipse without a fill but with a thick stroke thus creating the illusion of a ring. As well as drawing them, it rotated the rings around their y-axis to correspond with the roatation of the 3D models.

The LoadScreen class had the responsibility of creating the loading screen by loading the background image, and on top of this image, drawing a 3D model of the Sun with the Earth orbiting it.

# What I am most proud of in the assignment
I'm really proud of the fact that I've been able to create what I consider to be a stepping stone to advancing our knowledge of the solar system and it's constituents. With this UI, people are able to gain more knowledge and possibly acquire further insights into the gravitationally bound planetary system we know and call the solar system. Coding wise, I was really happy with the way the 3D model of the planets turned out. It wasn't easy to implement but turned out to work well and it proved to be really useful for this assignment.

# Images

https://github.com/KelvinOko/SciFiUI/blob/master/images/loadingScreen.JPG


This is a link to my youtube video:

[![YouTube](https://i.ytimg.com/vi/hZGYoId13vs/hqdefault.jpg)](https://www.youtube.com/watch?v=hZGYoId13vs&feature=youtu.be)

# CSV Files

# Coords.csv
| x | y | diameter | name |
|---|---|----------|------|
|954|474|6|sun|
|1004|474|6|mercury|
|1008|434|6|venus|
|883|408|6|earth|
|1041|541|6|mars|
|871|577|6|jupiter|
|1078|390|6|saturn|
|967|298|6|uranus|
|754|461|6|neptune|

# Sun.csv
| Name: | Age: | Interesting Facts: |
|-------|------|--------------------|
|The Sun|4.603 billion years old|The sun lies at the heart of the solar system, where it is by far the largest object. It holds 99.8 percent of the solar system's mass and is roughly 109 times the diameter of the Earth — about one million Earths could fit inside the sun|

# Mercury.csv
| Name: | Age: | Interesting Facts: |
|-------|------|--------------------|
|Mercury|4.5 billion years old|Mercury is the closest planet to the Sun and is also the smallest of the eight planets in our solar system. It is named for the Roman god Mercury, the messenger to the gods – most likely related to the orbiting speed of the planet|

# Venus.csv
| Name: | Age: | Interesting Facts: |
|-------|------|--------------------|
|Venus|4.5 billion years old|Venus is the second planet from the Sun and the third brightest object in Earth's sky after the Sun and Moon. The planet is named for Venus, the Roman goddess of love and beauty|

# Earth.csv
| Name: | Age: | Interesting Facts: |
|-------|------|--------------------|
|Earth|4.54 billion years old|Earth is the third planet from the Sun and largest of the terrestrial planets. A year on Earth lasts just over 365 days. It is actually 1/4 of a day over 365 days which is why we have a leap year every four years|

# Mars.csv
| Name: | Age: | Interesting Facts: |
|-------|------|--------------------|
|Mars|4.6 billion years old|Mars is the fourth planet from the Sun, named after Mars, the Roman god of war. Mars is the only other planet besides Earth that has polar ice caps. The northern cap is called the Planum Boreum, with Planum Australe in the south|

# Jupiter.csv
| Name: | Age: | Interesting Facts: |
|-------|------|--------------------|
|Jupiter|4.5 billion years old|Named after the Roman king of the gods, Jupiter is fitting of its name. Jupiter is easily the largest planet in the Solar System. To put this in perspective, it would take 11 Earths lined up next to each other to stretch from one side of Jupiter to the other and it would take 317 Earths to equal the mass of Jupiter|

# Saturn.csv
| Name: | Age: | Interesting Facts: |
|-------|------|--------------------|
|Saturn|4.5 billion years old|Saturn, named after the father of the god Jupiter in Roman mythology, is the sixth planet from the Sun and second largest planet of the Solar System in terms of diameter and mass|

# Uranus.csv
| Name: | Age: | Interesting Facts: |
|-------|------|--------------------|
|Uranus|4.5 billion years old|Uranus, named after the the father of the Roman god Saturn, is the seventh planet in the Solar System and third of the gas giants. It is the third largest planet by diameter, yet fourth most massive|

# Neptune.csv
| Name: | Age: | Interesting Facts: |
|-------|------|--------------------|
|Neptune|4.5 billion years old|Neptune is the eighth planet from the Sun and last of the known planets. While it is the third largest planet with respect to mass, it is only the fourth largest in terms of diameter. Due to its blue coloration, Neptune was named after the Roman god of the Sea|
