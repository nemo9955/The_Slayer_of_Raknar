package game.Entitati;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.state.StateBasedGame;

public class Player extends Entitate {

    public Player(float x, float y){
        super(x,y);
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta){
        if( gc.getInput().isKeyDown(Input.KEY_W) ){
            modY(-0.5f * delta);
        }

        if( gc.getInput().isKeyDown(Input.KEY_S) ){
            modY(0.5f * delta);
        }

        if( gc.getInput().isKeyDown(Input.KEY_D) ){
            modX(0.5f * delta);
        }
            

        if( gc.getInput().isKeyDown(Input.KEY_A) ){
            modX(-0.5f * delta);
        }
    }
    
    
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g){
        img.draw(x,y);
    }

    protected void setViata() {
        viata = 150;
    }

    protected void Imagine() {
        try {
            img = new Image("res/entitati/player.png");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
