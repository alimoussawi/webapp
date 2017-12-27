package ua.nure.ostpc.hierarchyOfVegetables;

public abstract class vegetable
{
    String color;
    public abstract String toString();
    //the toString() converts the specified object to a string value.
    public static void main(String []args)
    {
        vegetable v=new Potato();
        System.out.println(v.toString());
        vegetable v1=new Brinjal();
        System.out.println(v1.toString());
        vegetable v2=new Tomato();
        System.out.println(v2);
        vegetable v3=new Carrot();
        System.out.println(v3);
        vegetable v4=new Lemon();
        System.out.println(v4);
    }
}
class Potato extends vegetable
{
    Potato()
    {
        color="white Potato";
    }
    public String toString()
    {
        return("Color of Potato: "+this.color);
    }
}
class Brinjal extends vegetable
{
    Brinjal()
    {
        color="dark purple";
    }
    public String toString()
    {
        return("Color of Brinjal: "+this.color);
    }
}
class Tomato extends vegetable
{
    Tomato()
    {
        color="Red";
    }
    public String toString()
    {
        return("Color of Tomato: "+this.color);
    }

}
class Carrot extends vegetable{
    Carrot(){
color="orange";
    }
    public String toString()
    {
        return("Color of Carrot: "+this.color);
    }
}
class Lemon extends vegetable{
    Lemon(){
        color="yellow";
    }
    public String toString()
    {
        return("Color of Lemon: "+this.color);
    }
}