public class LessonSeven{

    public final String TOMBSTONE = "Here lives a dead monster";

    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPosition = 0;
    private int yPosition = 0;
    private boolean alive = true;

    public String name = "Big Monster";
    public int getAttack(){
        return attack;
    }
    public int getMovement(){
        return movement;
    }
    public int getHealth() {
        return health;
    }

    //overloading
    public void setHealth(int decreaseHealth){
        health = health - decreaseHealth;
        if(health < 0){
            alive = false;
        }
    }

    public void setHealth(double decreaseHealth){
        int intDecreseHealth = (int) decreaseHealth;
        health = health - intDecreseHealth;
        if (health < 0) {
            alive = false;
        }
    }

    public LessonSeven(int health, int attack, int movement){
        this.health = health;
        this.attack = attack;
        this.movement = movement;
    }

    //default constucter
    public LessonSeven(){

    }

    public static void main(String[] args) {
        LessonSeven Frank = new LessonSeven();
        System.out.println(Frank.attack);
    }

}