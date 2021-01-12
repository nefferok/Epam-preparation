package entitiy.bouquet.builder;

import entitiy.bouquet.Bouquet;
import entitiy.bouquet.Flowers;
import entitiy.bouquet.PackagingFlowers;

public class PreparedBouquet {
    public static Bouquet bouquetRoses(String forWhom){
        BuilderBouquet bouquet = new BuilderBouquet();
        bouquet.setForWhom(forWhom);
        bouquet.setPackaging(PackagingFlowers.BASKET);
        bouquet.addFlowers(Flowers.ROSE_1);
        bouquet.addFlowers(Flowers.ROSE_1);
        bouquet.addFlowers(Flowers.ROSE_2);
        bouquet.addFlowers(Flowers.ROSE_2);
        bouquet.addFlowers(Flowers.ROSE_3);
        return bouquet.getBouquet();
    }

    public static Bouquet bouquetTulips(String forWhom){
        BuilderBouquet bouquet = new BuilderBouquet();
        bouquet.setForWhom(forWhom);
        bouquet.setPackaging(PackagingFlowers.PAPER);
        bouquet.addFlowers(Flowers.TULIP_1);
        bouquet.addFlowers(Flowers.TULIP_2);
        bouquet.addFlowers(Flowers.TULIP_3);
        return bouquet.getBouquet();
    }

    public static Bouquet bouquetShort(String forWhom){
        BuilderBouquet bouquet = new BuilderBouquet();
        bouquet.setForWhom(forWhom);
        bouquet.setPackaging(PackagingFlowers.CELLOPHANE);
        bouquet.addFlowers(Flowers.ROSE_4);
        bouquet.addFlowers(Flowers.ROSE_5);
        bouquet.addFlowers(Flowers.ROSE_6);
        return bouquet.getBouquet();
    }
}
