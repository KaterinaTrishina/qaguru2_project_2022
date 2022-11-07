public class DiscountsClass {
    private String residentialDiscounts;
    private String businessDiscounts;
    private boolean heritableDiscount;
    private int durationOfDiscount;
    private long totalDiscount;

    public String getResidentialDiscounts() {
        return residentialDiscounts;
    }

    public void setResidentialDiscounts(String residentialDiscounts) {
        this.residentialDiscounts = residentialDiscounts;
    }

    public String getBusinessDiscounts() {
        return businessDiscounts;
    }

    public void setBusinessDiscounts(String businessDiscounts) {
        this.businessDiscounts = businessDiscounts;
    }

    public boolean isHeritableDiscount() {
        return heritableDiscount;
    }

    public void setHeritableDiscount(boolean heritableDiscount) {
        this.heritableDiscount = heritableDiscount;
    }

    public int getDurationOfDiscount() {
        return durationOfDiscount;
    }

    public void setDurationOfDiscount(int durationOfDiscount) {
        this.durationOfDiscount = durationOfDiscount;
    }

    public long getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(long totalDiscount) {
        this.totalDiscount = totalDiscount;
    }
}
