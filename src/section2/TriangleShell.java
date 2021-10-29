package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// Create a new Robot
	Robot geoff = new Robot();
	
	void go() {
		// This code will draw one triangle whose sides are 100 pixels long....
		// but first you have to write some code. Find the drawTriangle() method and 
		// write the code to draw a triangle.
		
		 //drawTriangle(100);
		
		// Run the program. Check that your triangle is the same as the first picture in the recipe.
		// Remove the drawTriangle(100) from the program before you proceed.
		
		
		// Make the robot go as fast as possible
		geoff.setSpeed(9999);

		// Make a variable to hold the length of the triangle and set it to 50
		int triangle_length = 50;
		// Make another variable to count how many triangles have been drawn and set it to 0
		int count= 0;
		// Start a while loop to draw 60 triangles
		while(count <60){
				//  Change the color of the pen to a random color
				geoff.setRandomPenColor();
				//  Increase the length variable by 10
				triangle_length +=10;
				//  Call the drawTriangle() method using the length variable
				drawTriangle(triangle_length);
				//  Turn the robot 6 degrees to the right
				geoff.turn(120);
				// Increase the number of triangles that have been drawn by 1
				count++;

		// End the while loop here
		}
// Run the program. Check that your pattern looks like the picture in the recipe.
// See if you can figure out how to modify the program so the pattern fits in the window.

	}

	private void drawTriangle(int length) {
		/* Write code here to draw a triangle. Use the length variable when you call move(). */
		geoff.penDown();
		geoff.move(length);
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}

