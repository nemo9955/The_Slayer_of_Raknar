package game.GamePlay;

import game.Entitati.Entitate;
import game.Entitati.Player;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameplayState extends BasicGameState {

    private final int ID;
    
    private Entitate player ;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        player = new Player(100,100);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        player.update(gc, sbg, delta);
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException { 
        player.render(gc, sbg, g);
    }

    public GameplayState(int ID) {
        this.ID = ID;
    }

    @Override
    public int getID() {
        return ID;
    }
}
