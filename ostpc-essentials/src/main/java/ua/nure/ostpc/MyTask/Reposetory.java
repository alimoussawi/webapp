package ua.nure.ostpc.MyTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reposetory extends MyMarket {
    private List<Goods> goods = new ArrayList<>();

    public Reposetory() {
        Goods bounty = new Goods("bounty",12,"bounty company");
        Goods snikers = new Goods("snikers",22,"snikers company");
        Goods mars =new Goods("mars",15,"mars company");
        Goods twix =new Goods("twix",10,"twix company");
        goods.addAll(Arrays.asList(bounty, snikers,mars,twix));
    }

    public Goods find(String name) {
        for (int i=0;i<goods.size();i++){
System.out.println(getGoodName());

        }
        return null;}

}
