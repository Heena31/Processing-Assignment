import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH=640;
    public static final int HEIGHT=480;
    public static final int DIAMETER = 10;
    int p=0;
    int q=0;
    int r=0;
    int s=0;


    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);

    }

    @Override
    public void settings() {
        super.settings();

        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle(DIAMETER);
    }

    private void drawCircle(int diameter) {
        ellipse(p, HEIGHT/5, diameter, diameter);
        ellipse(q, HEIGHT/5*2, diameter, diameter);
        ellipse(r, HEIGHT/5*3, diameter, diameter);
        ellipse(s, HEIGHT/5*4, diameter, diameter);
        p+=1;
        q+=2;
        r+=3;
        s+=4;
    }

}
