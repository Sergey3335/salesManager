public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = 1000;
        for (int saleMin : sales) {
            if (saleMin < min) {
                min = saleMin;
            }
        }
        return min;
    }

    public int sum() {
        int sum = 0;
        for (int saleSum : sales) {
            sum += saleSum;
        }
        return sum;
    }

    public int mediumSale() {
        int mediumSale = (sum() - max() - min()) / (sales.length - 2);
        return mediumSale;
    }
}
