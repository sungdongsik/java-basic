package class1.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    //TODO 나머지 코드를 완성해라
    public void addItem(Item item){

        if(itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount++] = item;

    }

    public void displayItems(){

        System.out.println("장바구니 상품 출력");

        for(int i = 0; i < itemCount; i++){
            Item items1 = items[i];
            System.out.println("상품명: " + items1.getName() + ", 합계: " + items1.getPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice(){
        int total = 0;

        for (int i = 0; i < itemCount; i++){
            Item item = items[i];

            total += item.getPrice();
        }

       return total;
    }
}
