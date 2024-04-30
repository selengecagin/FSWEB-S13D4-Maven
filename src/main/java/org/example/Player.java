package org.example;

enum Weapon{
    SWORD(10, 1.2),
    AXE(12, 1.5),
    BOW(8, 1.8);

    private final int damage;
    private final double attackSpeed;

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
}

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.weapon = weapon;
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void loseHealth(int damage){
        this.healthPercentage -= damage;
        if(this.healthPercentage<0){
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion){
        this.healthPercentage += healthPotion;
        if(this.healthPercentage<100){
            this.healthPercentage =100;
        }
    }
}
