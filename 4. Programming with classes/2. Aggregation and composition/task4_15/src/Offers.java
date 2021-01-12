import java.util.ArrayList;

public class Offers {
    private ArrayList<Voucher> list;

    public Offers(ArrayList<Voucher> list) {
        this.list = list;
    }
    public void find (Criterias find){
        int count = 0;
        for (int i = 0; i <list.size() ; i++) {
                if ((list.get(i).getType().equals(find.getType()) || find.getType().equals(Type.ALL))
                        && (list.get(i).getTransport().equals(find.getTransport()) || find.getTransport().equals(Transport.ALL))
                        &&  (list.get(i).getNutrition().equals(find.getNutrition()) || find.getNutrition().equals(Nutrition.ALL))
                        && list.get(i).getDays()>=find.getDays()){

                    System.out.println(list.get(i).toString());
                    count++;
                }
                }
        if(count == 0){
            System.out.println("Result isn't found");
        }
        }
    }


