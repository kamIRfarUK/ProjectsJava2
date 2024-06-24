public class F_Machine {
    private F_Item[][] items;

    public F_Machine( F_Item[][] items){
        this.items = new F_Item[items.length][items[0].length];
        for (int i = 0;i < items.length;i++){
            for (int j = 0;j < items[i].length;j++){
                this.items[i][j] = new F_Item(items[i][j]);
            }
        }
    }
    public F_Item getItem(int row, int spot){
        return new F_Item(this.items[row][spot]);
    }
    public void setItems(F_Item item, int row, int spot){
        this.items[row][spot] = new F_Item(item);
    }



    /*
    Function name - dispense()
    * @param row (int)
    * @param spot (int)
    * @return (boolean)
    * Inside the function:
        1. Checks if the requested item has a quantity bigger than 0.
                .if so: decreases its quantity by one and returns true.
                .otherwise: returns false.
    */
    public boolean dispense(int row ,int spot ){

        if(this.items[row][spot].getQuantity() > 0){
           this.items[row][spot].setQuantity(this.items[row][spot].getQuantity() - 1);
           return true;

        }
        return false;
    }

    public String toString(){
        String temp = "";
        for (int i = 0;i < items.length;i++) {
            temp +="\t";
            for (int j = 0; j < items[i].length; j++) {
                temp += this.items[i][j].toString();
            }
            temp +="\n\n";
        }
        return temp;
    }

}
