public class CustomerSegmentClass {

    private String CustomerSegment;
    private boolean typeOfBusiness;
    private int amountOfbillingAccounts;
    private int amountOfrootAssets;
    private boolean needNumberInport;

    public String getCustomerSegment() {
        return CustomerSegment;
    }

    public void setCustomerSegment(String customerSegment) {
        CustomerSegment = customerSegment;
    }

    public boolean isTypeOfBusiness() {
        return typeOfBusiness;
    }

    public void setTypeOfBusiness(boolean typeOfBusiness) {
        this.typeOfBusiness = typeOfBusiness;
    }

    public int getAmountOfbillingAccounts() {
        return amountOfbillingAccounts;
    }

    public void setAmountOfbillingAccounts(int amountOfbillingAccounts) {
        this.amountOfbillingAccounts = amountOfbillingAccounts;
    }

    public int getAmountOfrootAssets() {
        return amountOfrootAssets;
    }

    public void setAmountOfrootAssets(int amountOfrootAssets) {
        this.amountOfrootAssets = amountOfrootAssets;
    }

    public boolean isNeedNumberInport() {
        return needNumberInport;
    }

    public void setNeedNumberInport(boolean needNumberInport) {


    }
}
