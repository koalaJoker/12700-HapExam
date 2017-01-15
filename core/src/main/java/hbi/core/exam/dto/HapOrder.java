package hbi.core.exam.dto;

import java.util.Date;

/**
 * Created by 袁媛 on 2017/1/11.
 */
public class HapOrder {

    private Long orderId;

    private String orderNumber;

    private String companyName;

    private Long companyId;

    private String customerName;

    private Date orderDate;

    private String orderStatus;

    private String orderMoney;

    private String itemDescription;

    public String getOrderNumber() {
        return orderNumber;
    }

    public HapOrder setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public HapOrder setCompanyName(String companyName) {
        this.companyName = companyName;return this;
    }

    public String getCustomerName() {
        return customerName;

    }

    public HapOrder setCustomerName(String customerName) {
        this.customerName = customerName;return this;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public HapOrder setOrderDate(Date orderDate) {
        this.orderDate = orderDate;return this;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public HapOrder setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;return this;
    }

    public String getOrderMoney() {
        return orderMoney;
    }

    public HapOrder setOrderMoney(String orderMoney) {
        this.orderMoney = orderMoney;return this;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public HapOrder setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public HapOrder setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public HapOrder setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
}
