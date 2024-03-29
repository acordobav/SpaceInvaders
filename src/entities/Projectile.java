package entities;

import java.lang.String;
import java.lang.Integer;
import gui.Sprite;
import tools.SplitString;

public class Projectile implements Comparable<Projectile> {
    private Sprite sprite;

    public Projectile(String file_path, Double x, Double y, Integer velocity) {
        sprite = new Sprite(file_path);
        sprite.setPosition(x, y);
        sprite.setVelocity(0, velocity);
    }

    public Sprite getSprite() {
        return sprite;
    }

    @Override
    public int compareTo(Projectile projectile) {
        if((sprite.getPositionX() == projectile.getSprite().getPositionX()) && (sprite.getPositionY() == projectile.getSprite().getPositionY())){
            return 0;
        } else{
            return 1;
        }
    }

    @Override
    public String toString() {
        return SplitString.split(this.getClass().toString(), ".").getElement(0).getDataT() + "," + sprite;
    }

}
