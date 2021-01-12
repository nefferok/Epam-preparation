package entitiy.sweet.builder;

import entitiy.sweet.BoxWithSweets;
import entitiy.sweet.PackagingSweets;
import entitiy.sweet.Sweets;

public class PreparedBoxes {
    public static BoxWithSweets box_1(String forWhom){
        BuilderBox builder = new BuilderBox();
        builder.setForWhom(forWhom);
        builder.addFSweets(Sweets.CHOCOLATE);
        builder.addFSweets(Sweets.COOKIES);
        builder.addFSweets(Sweets.LOLLIPOPS);
        builder.setPackaging(PackagingSweets.CARDBOARD);
        return builder.getBox();
    }

    public static BoxWithSweets box_2(String forWhom){
        BuilderBox builder = new BuilderBox();
        builder.setForWhom(forWhom);
        builder.addFSweets(Sweets.CHOCOLATE);
        builder.addFSweets(Sweets.COOKIES);
        builder.addFSweets(Sweets.SWEETS);
        builder.setPackaging(PackagingSweets.METAL);
        return builder.getBox();
    }

    public static BoxWithSweets box_3(String forWhom){
        BuilderBox builder = new BuilderBox();
        builder.setForWhom(forWhom);
        builder.addFSweets(Sweets.CHOCOLATE);
        builder.addFSweets(Sweets.COOKIES);
        builder.setPackaging(PackagingSweets.CELLOPHANE);
        return builder.getBox();
    }
}
