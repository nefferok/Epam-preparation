package entitiy.sweet.builder;

import entitiy.sweet.BoxWithSweets;
import entitiy.sweet.PackagingSweets;
import entitiy.sweet.Sweets;

import java.util.ArrayList;

public class BuilderBox {
    private BoxWithSweets box;

    public BuilderBox() {
        reset();
    }

    public void reset() {
        box = new BoxWithSweets();
    }

    public void setForWhom (String forWhom){
        box.setForWhom(forWhom);
    }

    public void setPackaging (PackagingSweets packaging){
        box.packagingSweets = packaging;
    }

    public void addFSweets(Sweets sweet){
        if (box.sweets==null){
            box.sweets = new ArrayList<Sweets>();
        }
        box.sweets.add(sweet);
    }

    public BoxWithSweets getBox() {
        return box;
    }
}
