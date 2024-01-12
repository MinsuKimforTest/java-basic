package access.ex;

public class Item {

    private String itemNm;
    private int itemValue;
    private int itemCount;

    public Item(String itemNm, int itemValue, int itemCount){
        this.itemNm = itemNm;
        this.itemValue = itemValue;
        this.itemCount = itemCount;
    }

    public String getName(){
        return itemNm;
    }

    public int getitemValue(){
        return itemValue;
    }

    public int getCount(){
        return itemCount;
    }

}
