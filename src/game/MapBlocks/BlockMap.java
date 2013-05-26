package game.MapBlocks;

import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.tiled.TiledMap;

public class BlockMap {
    
    private Block blocks[][];
    private int solidL ;
    private int mapH , mapW ;
    
    public BlockMap(TiledMap map){
        
        blocks = new Block[map.getWidth()][map.getHeight()];
        mapW = map.getWidth();
        mapH = map.getHeight();
        solidL = map.getLayerIndex("solid");
        
        for( int j = 0; j < map.getHeight(); j++ )
            for( int i = 0; i < map.getWidth(); i++ ) {
                if(map.getTileId(i, j, solidL)>0){
                    blocks[i][j] = new BlockSolid(i,j);
                }else{
                    blocks[i][j] = new Block(i,j);
                }
            }
    }
    
    public boolean isBlock(int x, int y) {
        if( x < 0 || x > mapW - 1 || y < 0 || y > mapH - 1 )
            return false;
        return blocks[x][y].isExists();
    }
    
    public Rectangle getBlock(int x, int y) {
        return blocks[x][y].getZon();
    }

    public boolean is_solid(int x, int y) {
        return blocks[x][y].isSolid();
    }
    
}
