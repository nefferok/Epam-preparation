package entitiy.sweet;

import entitiy.Present;

import java.util.ArrayList;
import java.util.Objects;

public class BoxWithSweets extends Present {
    public ArrayList<Sweets> sweets;
    public PackagingSweets packagingSweets;


    public BoxWithSweets(String forWhom, ArrayList<Sweets> sweets, PackagingSweets packagingSweets) {
        super(forWhom);
        this.sweets = sweets;
        this.packagingSweets = packagingSweets;
    }

    public BoxWithSweets(String forWhom, PackagingSweets packagingSweets) {
        super(forWhom);
        this.packagingSweets = packagingSweets;
        this.sweets = new ArrayList<Sweets>();
    }

    public BoxWithSweets() {
        super();
    }

    public ArrayList<Sweets> getSweets() {
        return sweets;
    }

    public PackagingSweets getPackagingSweets() {
        return packagingSweets;
    }


    public void setPackaging(PackagingSweets packagingSweets) {
        this.packagingSweets = packagingSweets;
    }

    public void createPresent(Sweets sweets) {
        if (this.sweets==null){
            this.sweets = new ArrayList<Sweets>();
        }
        this.sweets.add(sweets);
    }

    @Override
    public int getCost() {
        int totalCost = 0;
        for (int i = 0; i < this.sweets.size(); i++) {
            totalCost += sweets.get(i).getCost();
        }
        totalCost += this.packagingSweets.getCost();
        return totalCost;
    }

    @Override
    public String toString() {
        return "BoxWithSweets{" +
                "sweets=" + sweets +
                ", packagingSweets=" + packagingSweets +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BoxWithSweets that = (BoxWithSweets) o;
        return Objects.equals(sweets, that.sweets) &&
                packagingSweets == that.packagingSweets;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sweets, packagingSweets);
    }
}

