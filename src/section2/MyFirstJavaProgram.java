package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
    	// This code makes a new Robot
    	Robot rob = new Robot();
    	
//    	rob.move(100);
//    	rob.turn(90);
//    	rob.move(100);
   
        // PEN.  Put the robot's pen down so it can draw, Use this command:
		 /**     rob.penDown();    **/
    	rob.penDown();
    	
        // SPEED. Make the robot move quickly. Use this command:
		  /**     rob.setSpeed();    **/
 rob.setSpeed(25);
    	// COUNT. Create an int variable that will count how many sides of the square we have drawn.
    	//        The start value will be zero because no sides have yet been drawn. Use this code:
		  /**     int count = 0;    **/
    	int count = 0;

        // DRAW.  Draw a line. Use this command:
    		  /**     rob.move();    **/
  
rob.move(300);
	// TURN.  Turn 90 degrees. Use this command:
    		  /**     rob.turn();    **/

    	rob.turn(90);
    	// INCREASE COUNT. Add one to the number of sides that have now been drawn like this:
    		  /**     count += 1;    **/
count += 1;
    	
    	// Run the program. Did the Robot draw a line and turn?
    	 
    	
        // LOOP.  Make a while loop and move the DRAW, TURN, and INCREASE COUNT code 
    	//        so it is between the curly braces like the example below. 
    	//        The code in the loop will now repeat 4 times to draw a square.
    	
    	/**     while ( count < 4 ) { 
    	 *            DRAW
    	 *            TURN
    	 *            INCREASE COUNT
    	 *      }
    	 **/
    	while (count < 4) {
    		rob.move(100);
    		rob.turn(90);
            count = count +1;
    	
    		
    	}
    	
    	// Run the program again. Did your Robot draw a square?
		
	}
}
