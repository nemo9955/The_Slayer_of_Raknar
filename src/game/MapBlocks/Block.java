package game.MapBlocks;

public class Block {
    
    protected int x , y ;
    protected boolean solid ;
    protected boolean exists ;
    
    public Block(int x , int y){
        this.x=x;
        this.y=y;
        Exist();
        Solid();
    }

    protected void Solid() {
        solid=false;
    }

    protected void Exist() {
        exists=false;
    }

}
