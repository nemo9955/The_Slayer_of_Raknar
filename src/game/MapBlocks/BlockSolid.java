package game.MapBlocks;

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
    
}
