public class Main {
    public static void main(String[] arse) {
        int[] salesPrice = {23, 45, 61, 39};
        SalesManager salesManager = new SalesManager(salesPrice);
        System.out.println("Самая больша цена продажи " + salesManager.max());
    }
}
