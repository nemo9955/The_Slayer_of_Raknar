package game.Entitati;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.state.StateBasedGame;

public class Player extends Entitate {

    public Player(float x, float y) {
        super(x, y);
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) {
        if( gc.getInput().isKeyDown(Input.KEY_W) ) {
            modY(-speed * delta);
            if(colid()){
                modY(speed * delta);
            }
        }

        if( gc.getInput().isKeyDown(Input.KEY_S) ) {
            modY(speed * delta);
            if(colid()){
                modY(-speed * delta);
            }
        }

        if( gc.getInput().isKeyDown(Input.KEY_D) ) {
            modX(speed * delta);
            if(colid()){
                modX(-speed * delta);
            }
        }

        if( gc.getInput().isKeyDown(Input.KEY_A) ) {
            modX(-speed * delta);
            if(colid()){
                modX(speed * delta);
            }
        }
    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) {
               img.draw(x,y);
        //       img.draw(32, 32, 0, 0, x, y, 32, 32);
      //  img.draw(x, y, 0, 0, 32, 48);
        g.draw(poly);
    }

    protected void setViata() {
        viata = 150;
    }

    protected void Imagine() {
        try {
            img = new Image("res/entitati/player 1.png");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
