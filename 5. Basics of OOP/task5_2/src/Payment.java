import java.io.IOException;
import java.util.Scanner;

public class Payment {
    private String name;
    private Product [] products;
    private double cost;

    public Payment(String name, Product[] products, double cost) {
        this.name = name;
        this.products = products;
        this.cost = cost;
    }

    public Payment(String name) {
        this.name = name;
    }

    private class Product{
        private String nameOfProduct;
        private double price;

        public Product(String nameOfProduct, double price) {

            this.nameOfProduct = nameOfProduct;
            this.price = price;
        }

        public String getNameOfProduct() {
            return nameOfProduct;
        }

        public void setNameOfProduct(String nameOfProduct) {
            this.nameOfProduct = nameOfProduct;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    public void setPayment() throws IOException {
        this.cost = 0;
        System.out.print("How many products do you want to buy?: ");
        Scanner br = new Scanner(System.in);
        try {
            int dim = br.nextInt();
            Product [] products = new Product[dim];

            for (int i = 0; i < dim; i++) {
                System.out.println("Product " + (i+1) + ": ");

                System.out.print("Name: ");
                String str_name = br.next();
                System.out.print("Price: ");
                double price = br.nextDouble();

                products[i] = new Product(str_name, price);
                this.cost = this.cost + products[i].getPrice();
            }
            this.products = products;
        } catch(NumberFormatException e){
            System.out.println("Incorrect format");
        } catch(NegativeArraySizeException e) {
            System.out.println("Size of array can not be < 0");
        } catch (NullPointerException e){
            System.out.println();
            System.out.println("Array didn't create");
        }
    }
    public void printCheque() throws IOException{
        try {
            if(this.products.length != 0){
                System.out.println("============================");
                System.out.println(" " + this.name);
                System.out.println("============================");
                for(int i = 0; i < this.products.length; i++) {
                    System.out.printf("%3d", i+1);
                    System.out.printf("%15s", this.products[i].getNameOfProduct());
                    System.out.printf("%10.2f", this.products[i].getPrice());
                    System.out.println();
                }
                System.out.println("============================");
                System.out.print("Total cost: ");
                System.out.print(this.cost);
                System.out.println();
                System.out.println("============================");
            } else {
                System.out.println();
                System.out.println("Array didn't create");
            }
        } catch(NullPointerException e) {
            System.out.println();
            System.out.println("Array didn't create");
        }
    }

}
