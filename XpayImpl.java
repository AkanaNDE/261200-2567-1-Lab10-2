import com.teamrocket.Xpay;

public class XpayImpl implements Xpay {

    private String creditCardNO;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private double amount;



    @Override
    public String getCreditCardNo() {
        return this.creditCardNO;
    }

    @Override
    public String getCustomerName() {
        return this.customerName;
    }

    @Override
    public String getCardExpMonth() {
        return this.cardExpMonth;
    }

    @Override
    public String getCardExpYear() {
        return this.cardExpYear;
    }

    @Override
    public Short getCardCVVNo() {
        return this.cardCVVNo;
    }

    @Override
    public Double getAmount() {
        return this.amount;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNO = creditCardNo;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}