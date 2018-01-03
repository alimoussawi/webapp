package ua.nure.ostpc.MyTask;

public class MyMarket {
    private String goodName;
    private int price;
    private String provider;

    private Reposetory reposetory;

    public Reposetory getReposetory() {
        return reposetory;
    }

    public static void main(String[] args) {
        Reposetory reposetory=new Reposetory();
        Reposetory reposetory1=new Reposetory();
    System.out.println(reposetory.getGoodName()+"\t"+reposetory1.getGoodName());
    System.out.println(reposetory.getPrice()+"\t"+reposetory1.getPrice());
    System.out.println(reposetory.getProvider()+"\t"+reposetory1.getProvider());

    }
    public String getGoodName(){
        return goodName;

    }
    public void setGoodName(String goodName){
        if (goodName != "bounty" || goodName != "mars" || goodName != "twix") {
            this.goodName = "wrong good";
            return;
        }
        this.goodName = goodName;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 20) {
            this.price = 200;
            return;
        }
        this.price = price;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        if (provider != "bounty company" || provider != "mars company" || provider != "twix company") {
            this.provider = "wrong provider";
            return;
        }
        this.provider = provider;
    }
}
