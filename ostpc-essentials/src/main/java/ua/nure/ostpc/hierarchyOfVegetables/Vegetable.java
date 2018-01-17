package ua.nure.ostpc.hierarchyOfVegetables;

public  class Vegetable
{

    String color;
    int weight;
    String quality, ImportedFrom, size, exportedTo,quantitiesImported;
    public static void main(String []args)
    { Potato potato=new Potato();
    Brinjal brinjal=new Brinjal();
    Tomato tomato=new Tomato();
    Carrot carrot=new Carrot();
    Lemon lemon=new Lemon();
potato.getColor();
potato.getQuality();
tomato.getColor();
potato.getWeight();
tomato.getWeight();
carrot.getExportedTo();
lemon.getColor();
lemon.getQuantitiesImported();
    }

    void getColor(){
        System.out.println(color);
    }
    void getWeight(){
        System.out.println(weight);
    }
    void getQuality(){
        System.out.println(quality);
    }
    void getImportedFrom(){
        System.out.println(ImportedFrom);
    }
    void getSize(){
        System.out.println(size);
    }
    void getExportedTo(){
        System.out.println(exportedTo);
    }
    void getQuantitiesImported(){
        System.out.println(quantitiesImported);
    }
}
class Potato extends Vegetable
{
    Potato()
    {this.color="brown potato";
    this.weight=3;
        this.quality="bad quality";
    }

}
class Brinjal extends Vegetable
{
    Brinjal()
    {
        this.color="Purple";
        this.weight=12;
        this.ImportedFrom="india";

    }

}
class Tomato extends Vegetable
{
    Tomato()
    {this.color="red";
    this.weight=16;
this.size="big tomato";
    }


}
class Carrot extends Vegetable {
    Carrot(){
this.color="orange";
this.weight=32;
this.exportedTo="ukraine";
    }

}
class Lemon extends Vegetable {
    Lemon(){
        this.color="yellow";
this.weight=14;
this.quantitiesImported="large quantity";
    }

}
