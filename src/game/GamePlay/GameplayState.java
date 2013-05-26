package game.GamePlay;


import game.Start;
import game.Entitati.Player;
import game.Extra.Camera;
import game.MapBlocks.BlockMap;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.tiled.TiledMap;

public class GameplayState extends BasicGameState {

    private final int ID;
    
    private Camera camera ;
    
    private Player player;
    private TiledMap map;
    
    private static BlockMap blockMap ;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        player = new Player(100, 100);
        map = new TiledMap("res/nivele/nivel (1).tmx");
        camera = new Camera(map.getWidth() * map.getTileWidth(), map.getHeight() * map.getTileHeight());
        blockMap = new BlockMap(map);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        Start.setHEIGHT(gc.getHeight());
        Start.setWIDTH(gc.getWidth());
        player.update(gc, sbg, delta);
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        camera.translate(g, player);
        map.render(0, 0);
        player.render(gc, sbg, g);
    }

    public GameplayState(int ID) {
        this.ID = ID;
    }

    @Override
    public int getID() {
        return ID;
    }

    public Camera getCamera() {
        return camera;
    }

    public TiledMap getMap() {
        return map;
    }

    public static BlockMap getBlockMap() {
        return blockMap;
    }
    
    
}
