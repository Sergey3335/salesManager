public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = 1000;
        for (long saleMin : sales) {
            if (saleMin < min) {
                min = saleMin;
            }
        }
        return min;
    }

    public long sum() {
        long sum = 0;
        for (long saleSum : sales) {
            sum += saleSum;
        }
        return sum;
    }

    public long mediumSale() {
        long mediumSale = (sum() - max() - min()) / (sales.length - 2);
        return mediumSale;
    }
}
