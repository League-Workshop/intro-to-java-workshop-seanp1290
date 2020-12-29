PImage rainbow;
PImage unicorn;

void setup() {
  background(#FF8000);
  rainbow = loadImage("rainbow_.jpg");
size(800, 600);
rainbow.resize(800,600);
unicorn = loadImage("unicorn.png");
}

void draw() {
 background(rainbow); 
 image(unicorn, mouseX, mouseY);
 if( mousePressed ) {
   
 }
}
