package game.Extra;

import game.Start;
import game.Entitati.Player;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Vector2f;



public class Camera {

    private int transX;
    private int transY;
    private int mapWidth, mapHeight;
    private Vector2f cen;

    public Camera(int mapWidth, int mapHeight) {
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;
        transX = 0;
        transY = 0;
    }

    public void translate(Graphics g, Player player) {

        cen = new Vector2f(player.getX() + player.getPoly().getWidth() / 2, player.getY() + player.getPoly().getHeight() / 2);

        /*
         * verifica fiecare axa in parte astfel incat camera sa fie centrata pe
         * jucator cand este posibil , dar sa nu afiseze in afara hartii
         */

        // axa x
        if( cen.x - Start.getWIDTH() / 2 < 0 )
            transX = 0;
        else if( cen.x + Start.getWIDTH() / 2 > mapWidth )
            transX = -mapWidth + Start.getWIDTH();
        else transX = (int) -cen.x + Start.getWIDTH() / 2;

        // axa y
        if( cen.y - Start.getHEIGHT() / 2 < 0 )
            transY = 0;
        else if( cen.y + Start.getHEIGHT() / 2 > mapHeight )
            transY = -mapHeight + Start.getHEIGHT();
        else transY = (int) -cen.y + Start.getHEIGHT() / 2;

        g.translate(transX, transY);
    }

    public int getX() {
        return transX;
    }

    public int getY() {
        return transY;
    }

}
