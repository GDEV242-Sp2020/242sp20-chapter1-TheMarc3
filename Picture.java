/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @original author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 * 
 * @current edits author Marc Weitze
 */
public class Picture
{
    private Square background;
    private Triangle triangle1;
    private Triangle triangle2;
    private Circle circle1;
    private Circle circle2;
    private Square square1;
    private Square square2;
    private Square square3;
    private Square square4;
    private Square square5;
    private Square square6;
    private Person person1;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        background = new Square(1000000, 0, 0, "white");
        triangle1 = new Triangle(60, 70, 210, 140, "black");
        triangle2 = new Triangle(50, 60, 210, 147, "white");
        circle1 = new Circle(40, 190, 160, "black");
        circle2 = new Circle(34, 193, 163, "white");
        square1 = new Square(9, 206, 189, "black");
        square2 = new Square(9, 206, 180, "black");
        square3 = new Square(9, 206, 171, "black");
        square4 = new Square(9, 206, 162, "black");
        square5 = new Square(9, 206, 152, "black");
        square6 = new Square(7, 206, 145, "black");
        person1 = new Person(-50, 40, 210, 136, "black");
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            background.makeVisible();
            triangle1.makeVisible();
            triangle2.makeVisible();
            circle1.makeVisible();
            circle2.makeVisible();
            square1.makeVisible();
            square2.makeVisible();
            square3.makeVisible();
            square4.makeVisible();
            square5.makeVisible();
            square6.makeVisible();
            person1.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        background.changeColor("black");
        triangle1.changeColor("white");
        triangle2.changeColor("black");
        circle1.changeColor("white");
        circle2.changeColor("black");
        square1.changeColor("white");
        square2.changeColor("white");
        square3.changeColor("white");
        square4.changeColor("white");
        square5.changeColor("white");
        square6.changeColor("white");
        person1.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        triangle1.changeColor("red");
        triangle2.changeColor("blue");
        circle1.changeColor("red");
        circle2.changeColor("blue");
        square1.changeColor("red");
        square2.changeColor("red");
        square3.changeColor("red");
        square4.changeColor("red");
        square5.changeColor("red");
        square6.changeColor("red");
        person1.changeColor("red");
    }
}
