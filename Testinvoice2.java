//Invoice using object and class

import java.util.ArrayList;
        import java.util.Scanner;

public class Invoice3 {
    public static void main(String[] args) {
        Invoice1 item = new Invoice1();
        Invoice1 item2 = new Invoice1();
        Invoice1 item3 = new Invoice1();
        Invoice1 item4 = new Invoice1();

        ArrayList<String> items = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();

        ArrayList<Invoice1> invoice = new ArrayList<>();



        item.display();
        item.setItem("bison sweater");
        item.setPrice(55.99);

        item2.setItem("bison tee");
        item2.setPrice(14.99);

        item3.setItem("bison hoodie");
        item3.setPrice(23.99);

        item4.setItem("bison bumpersticker");
        item4.setPrice(4.99);
        item.toString();
        item2.toString();
        item3.toString();
        item4.toString();



        items.add("Bison Sweater");
        prices.add(55.99);
        items.add("Bison Tee");
        prices.add(14.99);
        items.add("Bison Hoodie");
        prices.add(23.99);
        items.add("Bison Bumpersticker");
        prices.add(4.99);

        Scanner input = new Scanner(System.in);
        while(true)
        {

            System.out.println("1)Add a purchase");
            System.out.println("2)Display all purchase");

            System.out.println("3) display total ");
            System.out.print("Enter Your choice: ");

            int choice = input.nextInt();
            input.nextLine();
            switch(choice)
            {

                case 1:
                    System.out.print("Enter item ");
                    String item1 = input.nextLine();
                    System.out.print("enter price ");
                    double price = input.nextDouble();
                    invoice.add(new Invoice1(item1, price));
                    break;
                case 2:
                    for(int i = 0; i < invoice.size(); i++)
                    {
                        Invoice1 c = invoice.get(i);
                        System.out.print(c.getItem() + "  " + c.getPrice());
                        System.out.println();
                    }
                    break;
                case 3:
                    double totalcost = 0.0;

                    for(int i=0; i< invoice.size(); i++) {
                        Invoice1 total = invoice.get(i);
                        totalcost = totalcost + total.getPrice();
                    }
                    System.out.println("total cost: $ "+ totalcost);
                    System.exit(0);

            }


        }
    }
}
