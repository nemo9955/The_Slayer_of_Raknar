package game.MapBlocks;

import org.newdawn.slick.geom.Rectangle;

public class BlockSolid extends Block {

    public BlockSolid(int x, int y) {
        super(x, y);
    }
    
    protected void Solid() {
        solid=true;
    }

    protected void Exist() {
        exists=true;
    }
    
    protected void Zon() {
        zon= new Rectangle (x*32 , y*32 , 32 , 32);
    }
}
