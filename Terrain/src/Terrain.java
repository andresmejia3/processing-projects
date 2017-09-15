import processing.core.PApplet;

public class Terrain extends PApplet {

  private static final int WINDOW_WIDTH = 900;
  private static final int WINDOW_HEIGHT = 900;
  private static final int SCL = 20;
  private static final int W = 1200;
  private static final int H = 900;
  private static final int ROWS = H / SCL;
  private static final int COLS = W / SCL;

  private float[][] terrain = new float[COLS][ROWS];
  private float flying = 0;


  static public void main(String[] args) {
    PApplet.main("Terrain", args);
  }

  public void settings() {  size(WINDOW_WIDTH, WINDOW_HEIGHT, P3D); }


  public void setup(){}

  public void draw(){
    flying -= 0.07f;
    float yoff = flying;
    for (int y=0; y< ROWS; y++){
      float xoff = 0.0f;
      for (int x=0; x< COLS; x++){
        terrain[x][y] = map(noise(xoff, yoff), 0, 1, -75, 75);

        xoff += 0.2f;
      }
      yoff += 0.2f;
    }

    background(0);
    //int r = (int)random(0,255);
    //int g = (int)random(0,255);
    //int b = (int)random(0,255);
    //stroke(r,g,b);
    stroke(255,0,0);
    noFill();

    translate(width/2, height/2);
    rotateX(PI/3);
    translate(-W /2, -H /2);

    for (int y=0; y< ROWS -1; y++){
      beginShape(TRIANGLE_STRIP);
      for (int x=0; x< COLS; x++){
        vertex(x* SCL, y* SCL, terrain[x][y]);
        vertex(x* SCL, (y+1)* SCL, terrain[x][y+1]);
      }
      endShape();
    }
  }
}
