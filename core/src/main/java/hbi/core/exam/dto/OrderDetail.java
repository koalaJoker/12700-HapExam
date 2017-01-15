package hbi.core.exam.dto;

/**
 * Created by 袁媛 on 2017/1/13.
 */
public class OrderDetail {

    private Long lineId;

    private String lineNumber;

    private String itemCode;

    private String itemDescription;

    private String  orderQuantityUom;

    private Long  orderQuantity;

    private Long unitSellingPrice;

    private Long orderMoney;

    private String description;

    private Long itemId;

    private String addition1;

    private String addition2;

    private String addition3;

    private String addition4;

    private String addition5;

    public Long getLineId() {
        return lineId;
    }

    public OrderDetail setLineId(Long lineId) {
        this.lineId = lineId;
        return this;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public OrderDetail setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    public String getItemCode() {
        return itemCode;
    }

    public OrderDetail setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getOrderQuantityUom() {
        return orderQuantityUom;
    }

    public OrderDetail setOrderQuantityUom(String orderQuantityUom) {
        this.orderQuantityUom = orderQuantityUom;
        return this;
    }

    public Long getOrderQuantity() {
        return orderQuantity;
    }

    public OrderDetail setOrderQuantity(Long orderQuantity) {
        this.orderQuantity = orderQuantity;
        return this;
    }

    public Long getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public OrderDetail setUnitSellingPrice(Long unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
        return this;
    }

    public Long getOrderMoney() {
        return orderMoney;
    }

    public OrderDetail setOrderMoney(Long orderMoney) {
        this.orderMoney = orderMoney;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OrderDetail setDescription(String description) {
        this.description = description;
        return this;
    }

    public Long getItemId() {
        return itemId;
    }

    public OrderDetail setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }

    public String getAddition1() {
        return addition1;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    public String getAddition3() {
        return addition3;
    }

    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }

    public String getAddition4() {
        return addition4;
    }

    public void setAddition4(String addition4) {
        this.addition4 = addition4;
    }

    public String getAddition5() {
        return addition5;
    }

    public void setAddition5(String addition5) {
        this.addition5 = addition5;
    }
}
