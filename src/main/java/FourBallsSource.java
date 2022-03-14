import processing.core.PApplet;


public class FourBallsSource extends PApplet {
    public static int height = 488;
    public static int width = 640;
    public static int x1=0;
    public static int x2=0;
    public static int x3=0;public static int x4=0;
    public static int diameter = 20;
    @Override
    public void settings() {
        super.settings();
        size(width,height);
    }

    @Override
    public void setup() {
        loop();
    }

    @Override
    public void draw() {
        drawCircle();
    }
    //  drawCircle draws the balls at specified heights and draws new balls at specified speed.
    public void drawCircle(){
//  Circle 1

        ellipse(x1,(height)/5,diameter,diameter);
        x1= x1+1;
        if(x1>width){
            x1=0;
        }
//  Circle 2

        ellipse(x2,(2*height)/5,diameter,diameter);
        x2= x2+2;
        if(x2>width){
            x2=0;
        }

//  Circle 3
        ellipse(x3,(3*height)/5,diameter,diameter);
        x3= x3+3;
        if(x3>width){
            x3=0;
        }

//  Circle 4
        ellipse(x4,(4*height)/5,diameter,diameter);
        x4= x4+4;
        if(x4>width){
            x4=0;
        }
    }

}
