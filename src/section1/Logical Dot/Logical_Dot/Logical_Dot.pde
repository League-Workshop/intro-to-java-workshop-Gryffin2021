
void setup() {
  
// 1. Set the size of the sketch. Make it 600 pixels square. 
  size(600,600);

}

void draw() {
  background(#FFFFFF);
// 2. Draw an ellipse
// Run the program to make sure it works before moving on.
ellipse(mouseX,mouseY,100,100);

// 3. Change the color of the ellipse when the mouse is pressed.
//    Use the following code, but put your colors where indicated
//    Remember to use the   fill()  command to set colors.

if (mousePressed) {
 
   //  put one color here 
  fill(#FF0000);
} else {
  
   // put a different color here
  fill(#000000);
}  
  
  
  
}
