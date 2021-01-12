package entitiy.bouquet;

import entitiy.Present;

import java.util.ArrayList;
import java.util.Objects;

public class Bouquet extends Present {
    private ArrayList<Flowers> flowers;
    private PackagingFlowers packagingFlowers;

    public Bouquet(){
        super();
    }

    public Bouquet(String forWhom) {
        super(forWhom);
    }

    public Bouquet(String forWhom, ArrayList<Flowers> flowers, PackagingFlowers packagingFlowers) {
        super(forWhom);
        this.flowers = flowers;
        this.packagingFlowers = packagingFlowers;
    }

    public void setPackaging(PackagingFlowers packagingFlowers) {
        this.packagingFlowers = packagingFlowers;
    }

    public void addFlowers(Flowers flower) {
        if (this.flowers==null){
            this.flowers = new ArrayList<Flowers>();
        }
        this.flowers.add(flower);
    }

    public ArrayList<Flowers> getFlowers() {
        return flowers;
    }

    public PackagingFlowers getPackagingFlowers() {
        return packagingFlowers;
    }

    @Override
    public int getCost() {
        int totalCost = 0;
        for (int i = 0; i < this.flowers.size(); i++) {
            totalCost += flowers.get(i).getCost();
        }
        totalCost += this.packagingFlowers.getCost();
        return totalCost;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                ", packagingFlowers=" + packagingFlowers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bouquet bouquet = (Bouquet) o;
        return Objects.equals(flowers, bouquet.flowers) &&
                packagingFlowers == bouquet.packagingFlowers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flowers, packagingFlowers);
    }
}
