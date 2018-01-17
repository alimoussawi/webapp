package main.java.ua.nure.ostpc.VegtablesTask;
class Potato extends Vegtables {
    public Potato() {
        System.out.println("  Potato:");

        this.setInfo("round", "Light brown", "sweet");
        this.setCalories(1.5);
        this.getColour();
        this.getShape();
        this.getTaste();
        this.getCalories();
    }

}

class Carrot extends Vegtables{
        public Carrot(){
            System.out.println("  Carrot:");

            this.setInfo("Long","Light orange","Between sweet, fruity and more harsh");
            this.setCalories(2.3);
            this.getColour();
            this.getShape();
            this.getTaste();
            this.getCalories();

        }
}
class Cabbage extends Vegtables{
        public Cabbage (){
            System.out.println("  Cabbage:");

            this.setInfo("conical","Light green","crunchy and alittel sweety");
            this.setCalories(1.5);
            this.getColour();
            this.getShape();
            this.getTaste();
            this.getCalories();
        }
}
class Cucumber extends Vegtables {
    public Cucumber() {
        System.out.println("  Cucumber");
        this.setInfo("Straight", "Light green", "Bitter");
        this.setCalories(16);
        this.getColour();
        this.getShape();
        this.getTaste();
        this.getCalories();

    }
}
        class Onion extends Vegtables{
            public Onion(){
                System.out.println("  Onion");
                this.setInfo("Round","Purple","pungent");
                this.setCalories(40);
                this.getColour();
                this.getShape();
                this.getTaste();
                this.getCalories();
            }
        }
        class Pepper extends Vegtables{
            public Pepper(){
                System.out.println("  Pepper");
                this.setInfo("long and a little curvy","Red","Spicy");
                this.setCalories(40);
                this.getColour();
                this.getShape();
                this.getTaste();
                this.getCalories();

            }
        }








public class Vegtables {
    private String shape,colour,taste;
    private double calories;
   public double getCalories(){
       System.out.println("Calories: "+calories);
       return calories;
   }
   public String getShape() {
       System.out.println("shape: "+shape);
        return shape;
    }

    public String getColour() {
        System.out.println("Colour: "+colour);
        return colour;
    }

    public String getTaste() {
        System.out.println("Taste: "+taste);
        return taste;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
    public void setInfo(String shape,String colour,String taste){
       this.shape=shape;
       this.colour=colour;
       this.taste=taste;
    }

    public static void main(String[] args) {
        Potato potato= new Potato();
        Carrot carrot = new Carrot();
        Cabbage cabbage=new Cabbage();
        Cucumber cucumber=new Cucumber();
        Onion onion=new Onion();
        Pepper pepper= new Pepper();
    }

}
