//Nanette CST112
//hero

float x,y;                          // Position of hero and sun
float sunX, sunY;                


//SETUP: define screen size//
void setup()
{
       size (600, 600 );
       sunX=  width/2;                  // Reset the sun position.
       sunY=  50;
       
       
}
//DRAW: sky, ground, house, tree, sun//
void draw()
{
  //SCENE:
  { 
        stroke( 0, 0, 127 );
        fill ( 0, 75, 255);
        rect ( 0, 0, 600, 250 );        //sky
        stroke( 0, 255, 0 );
        fill ( 0, 255, 0 );
        rect ( 0, 250, 600, 600 );      //ground
        fill (255, 255, 0 );
        ellipse( sunX, sunY, 50,50 );          // sun
        fill (0, 127, 0 );                   //tree
        stroke( 0, 127, 0 );
        triangle ( 400, 150, 450, 100, 500, 150 );
        fill (0, 127, 0 );
        stroke ( 0, 127, 0 );
        triangle ( 375, 200, 450, 125, 525, 200 );
        fill (0, 127, 0 );
        stroke ( 0, 127, 0 );
        triangle ( 350, 250, 450, 150, 550, 250 );
        fill (0, 127, 0 );
        stroke ( 0, 127, 0 );
        triangle ( 325, 300, 450, 200, 575, 300 );
        fill (165, 42, 42 );
        rect (445, 300, 25, 20 );  
         //House
        stroke( 0, 0, 0 );
        fill (165, 42, 42 );                         // Brown
        triangle ( 100, 200, 200, 150, 300, 200 );  // Roof
        fill ( 0, 0, 255 );                         // Blue
        rect (125, 200, 150, 100 );                 // House
        fill ( 255, 0, 0 );                         //Red
        rect ( 160,250, 35,50 );                   //Door
        fill (0, 0, 0 );
        ellipse( 170,275, 5,5 );                  // door knob
        fill ( 255, 255, 255 );                   // Window
        rect (220, 225, 35, 35 );
        stroke( 0, 0, 0 );
        line (238, 225, 238, 260 );
        line (220, 242, 255, 242 );
         
  }
  //// ACTION:  Follow the mouse.
    {
            sunX=  sunX + 1;
            if (sunX > width) sunX=  0;
            x=  mouseX;                         // Move the creature.
            y=  mouseY;
            
    }
    //// SHOW 
    {
    fill ( 250, 50, 250 );
    rect (x, y, 80, 80 );
    fill ( 100, 0, 60 );
    ellipse (x+40, y-30, 60, 60 );
    //line  
   // line
    }
  }
  
  
