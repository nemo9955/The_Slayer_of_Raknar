package game.Entitati;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.state.StateBasedGame;

public class Player extends Entitate {

    public Player(float x, float y) {
        super(x, y);
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) {

        isMoving = false;

        if( gc.getInput().isKeyDown(Input.KEY_W) ) {
            activ = 3;
            isMoving = true;
            modY(-speed * delta);
            if( colid() ) {
                modY(speed * delta);
            }
        }

        if( gc.getInput().isKeyDown(Input.KEY_S) ) {
            activ = 0;
            isMoving = true;
            modY(speed * delta);
            if( colid() ) {
                modY(-speed * delta);
            }
        }

        if( gc.getInput().isKeyDown(Input.KEY_D) ) {
            activ = 2;
            isMoving = true;
            modX(speed * delta);
            if( colid() ) {
                modX(-speed * delta);
            }
        }

        if( gc.getInput().isKeyDown(Input.KEY_A) ) {
            activ = 1;
            isMoving = true;
            modX(-speed * delta);
            if( colid() ) {
                modX(speed * delta);
            }
        }

        if( isMoving == true )
            interval += delta;
        else{
            frame=0;
            interval=0;
        }
        
        if( interval > intervalTo ) {
            interval = 0;
            frame++;
        }
        
        if( frame == img[0].length )
            frame = 0;

    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) {

        //        img.draw(x, y);
        g.draw(poly);
        img[activ][frame].draw(x, y);

    }

    protected void setViata() {
        viata = 150;
    }

    protected void Imagini() {
        SpriteSheet sheet = null;
        try {
            sheet = new SpriteSheet("res/entitati/player.png", 32, 48);
        } catch (Exception e) {
            e.printStackTrace();
        }
        dimW = 32;
        dimH = 48;

        img = new Image[sheet.getVerticalCount()][sheet.getHorizontalCount()];

        //        System.out.println(img[0].length);

        for( int j = 0; j < sheet.getVerticalCount(); j++ )
            for( int i = 0; i < sheet.getHorizontalCount(); i++ ) {
                img[j][i] = sheet.getSprite(i, j);
            }

    }
}
