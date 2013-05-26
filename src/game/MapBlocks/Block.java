package game.MapBlocks;

import org.newdawn.slick.geom.Rectangle;

public class Block {
    
    protected int x , y ;
    protected boolean solid ;
    protected boolean exists ;
    protected Rectangle zon ;
    
    public Block(int x , int y){
        this.x=x;
        this.y=y;
        Exist();
        Solid();
        Zon();
    }

    protected void Zon() {
        zon=null;
    }

    protected void Solid() {
        solid=false;
    }

    protected void Exist() {
        exists=false;
    }

    //                getters
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isSolid() {
        return solid;
    }

    public boolean isExists() {
        return exists;
    }

    public Rectangle getZon() {
        return zon;
    }
    
    

}
