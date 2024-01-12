package access.ex;

import java.util.Map;
import java.util.Objects;

public class ShoppingCart {
    private Item[] item = new Item[10];
    private int count;
    void addItem(Item item) {
        if(isValid()){
            this.item[count] = item;
            count++;
        }else{
            System.out.println("10개초과금지");
        }
    }

    boolean isValid(){
        return count < 11;
    }

    void displayItems(){
        System.out.println("장바구니 상품 출력");
        for(int i=0; i<count; i++){
            System.out.println("1번 : "+item[i].getName() + " 2번 : "+item[i].getitemValue() + " 3번 : "+item[i].getCount()  );
        }
    }
}
