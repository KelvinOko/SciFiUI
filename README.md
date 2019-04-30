# SciFi UI Project

Name: Kelvin Oko

Student Number: C17306113 

Fork this repository and use it a starter project for your assignment

# Description of the assignment
This assignment is based off the idea of a planetarium. I created it as a fun/interactive way to learn more about our solar system and the planets in it.

# Instructions
It starts of with a loading screen, which when finished will redirect the user to the main screen. The main screen features a 2D model of the solar system, with the planets orbiting the sun. To the right of that model are a series of interactive pictures of the sun and each planet. When you click on any of these pictures, the user will be taken to another screen, showing a 3D model of the corresponding planet rotating on it's y-axis. In this separate screen will also feature some information about the corresponding planet.
At the buttom of each of these pages is a back button that will redirect the user back to the main page.

# How it works

# What I am most proud of in the assignment
The 3D planets. They took a lot of work to understand and implement, and turned out better than I expected.

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

