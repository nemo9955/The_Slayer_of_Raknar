package game.Entitati;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

public class Entitate extends Physics {

    protected Image img[][];
    protected short activ = 0 , frame = 1;
    protected       int interval = 0  ;
    protected final int intervalTo = 150 ;
    // jos=0 , stanga=1 , dreapta=2 , sus=3
    
    protected boolean isMoving = false ;
    
    protected int team;
    protected int viata;
    protected float dimH, dimW;

    public Entitate(float x, float y) {
        this.x = x;
        this.y = y;
        Imagini();
        setPoly(x, y, dimW, dimH);
        setViata();
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) {

    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) {

    }

    protected void setViata() {
        viata = 100;
    }

    protected void setPoly(float x, float y, float w, float h) {
        poly = new Rectangle (x,y,w,h);
    }

    protected void Imagini() {
    }

    protected void modX(float amont) {
        x += amont;
        poly.setX(x);
    }

    protected void modY(float amont) {
        y += amont;
        poly.setY(y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Rectangle getPoly() {
        return poly;
    }

    public void setPoly(Rectangle poly) {
        this.poly = poly;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public int getViata() {
        return viata;
    }

    public void setViata(int viata) {
        this.viata = viata;
    }

}
