package game.Entitati;


import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

public class Entitate {

    protected float x;
    protected float y;
    protected Image img;
    protected Rectangle poly;
    protected int team;
    protected int viata;

    public Entitate(float x, float y){
        this.x=x;
        this.y=y;
        Imagine();
        setPoly(x, y, img);
        setViata();
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta){
        
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g){
        
    }

    protected void setViata() {
        viata = 100 ;
    }

    protected void setPoly(float x, float y, Image img) {
        poly = new Rectangle(x, y, img.getWidth(), img.getHeight());
    }

    protected void Imagine()  {
        img = null;
    }
    
    protected void modX(float amont){
        x += amont;
        poly.setX(x);
    }
    
    protected void modY(float amont){
        y += amont;
        poly.setY(y);
    }

}
