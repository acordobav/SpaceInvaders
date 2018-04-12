package entities;

import gui.AnimateSprite;
import gui.Sprite;

public class Squid extends Enemy {
    public Squid(Double x, Double y) {
        sprite = new AnimateSprite("resources/squid", 2, ".png", 0.50);
        sprite.setPosition(x, y);
        score = 10;
    }
}
