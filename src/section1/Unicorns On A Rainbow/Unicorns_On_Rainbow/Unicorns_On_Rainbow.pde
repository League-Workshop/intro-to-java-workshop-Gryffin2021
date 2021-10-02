PImage rainbow;
PImage unicorn;

void setup() {
  rainbow = loadImage("heaven.jpg");
size(800, 600);
rainbow.resize(width,height);
background(rainbow);
unicorn = loadImage("unicorn.png");
unicorn.resize(600,200);
}

void draw() {
  
 if (mousePressed){
   background(rainbow);
   image(unicorn,mouseX-5,mouseY-3);
 }
 
}
