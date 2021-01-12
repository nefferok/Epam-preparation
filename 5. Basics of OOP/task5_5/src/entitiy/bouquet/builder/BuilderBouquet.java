package entitiy.bouquet.builder;

import entitiy.bouquet.Bouquet;
import entitiy.bouquet.Flowers;
import entitiy.bouquet.PackagingFlowers;


public class BuilderBouquet {
    private Bouquet bouquet;

    public BuilderBouquet() {
        reset();
    }

    public void reset() {
        bouquet = new Bouquet();
    }

    public void setForWhom (String forWhom){
        bouquet.setForWhom(forWhom);
    }

    public void setPackaging (PackagingFlowers packaging){
        bouquet.setPackaging(packaging);
    }

    public void addFlowers(Flowers flowers){
        bouquet.addFlowers(flowers);
    }

    public Bouquet getBouquet() {
        return bouquet;
    }
}
