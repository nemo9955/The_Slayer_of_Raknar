package game.Entitati;

import game.GamePlay.GameplayState;

import org.newdawn.slick.geom.Rectangle;

public class Physics {

    protected float x;
    protected float y;
    protected float speed = 0.2f;
    
    protected Rectangle poly;

    public boolean colid() {
        
        for( float i = x; i <= x + poly.getWidth(); i += (int) poly.getWidth() / Math.ceil(poly.getWidth() / 32) )
            for( float j = y; j <= y + poly.getHeight(); j += (int) poly.getHeight() / Math.ceil(poly.getHeight() / 32) ) {
                if( GameplayState.getBlockMap().isBlock((int) i / 32, (int) j / 32) ) {
                    Rectangle rec = GameplayState.getBlockMap().getBlock((int) i / 32, (int) j / 32);
                    if( poly.intersects(rec) ) {
                        if( GameplayState.getBlockMap().is_solid((int) i / 32, (int) j / 32) )
                            return true;
                    }
                }
            }
        return false;
    }

}
