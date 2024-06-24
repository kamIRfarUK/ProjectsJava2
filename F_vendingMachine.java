import java.sql.SQLOutput;
import java.util.Scanner;

public class F_vendingMachine {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("\n\t******************************************************\t");
        System.out.println("\t***************     VENDING MACHINE      *************\t");
        System.out.println("\t******************************************************\t");

/*
        //01 testing F_Item

        F_Item item = new F_Item("Pepsi", 3.99 , 3);
        System.out.println(item);
*/
        //02 testing F_Item[][]
        F_Item[][] items = new F_Item[][]{
                {new F_Item("Pepsi",1.99,3), new F_Item("Fresca",1.49,3 ),new F_Item("Brisk", 2.99 ,2)},
                {new F_Item("Pepsi",1.99,3), new F_Item("Fresca",1.49,3 ),new F_Item("Brisk", 2.99 ,2)},
                {new F_Item("Pepsi",1.99,3), new F_Item("Fresca",1.49,3 ),new F_Item("Brisk", 2.99 ,2)}
        };

        //testing getter
        /*
        F_Machine machine = new F_Machine(items);
        System.out.println(machine.getItem(2,1));
        */

        //testing setter
        /*
        F_Machine machine = new F_Machine(items);
        F_Item item = machine.getItem(2,1);
        item.setPrice(3.00);
        machine.setItems(item,2,1 );
        System.out.println(machine.getItem(2,1));
        */

        //testing dispense()
        /*
        F_Machine machine = new F_Machine(items);
        machine.dispense(0,0);
        machine.dispense(0,0);
        System.out.println(machine.getItem(0,0));
        */

        //testing toString()
        /*
        F_Machine machine = new F_Machine(items);
        System.out.println(machine);
        */

        F_Machine machine = new F_Machine(items);

        while (true) {
            System.out.println("pick a row :");
            int row = scan.nextInt();
            System.out.println("pick a spot :");
            int spot = scan.nextInt();

            boolean dispensed = machine.dispense(row, spot);
            System.out.println("\n" + machine);

            if (dispensed == true){
                System.out.println("\nEnjoy your drink!  ");
            }else{
                System.out.println("\nSorry! We are out of stock for that item.");
            }
            System.out.println("Press 1 to purchase another.");
            if (scan.nextInt() != 1 ){
                break;
            }


        }
    }
}
