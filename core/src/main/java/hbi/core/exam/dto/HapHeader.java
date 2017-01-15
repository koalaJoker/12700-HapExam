package hbi.core.exam.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

/**
 * Created by 袁媛 on 2017/1/11.
 */

@Table(
        name = "hap_om_order_headers"
)
public class HapHeader {
    @Id
    @Column
    private Long headerId;

    @Column
    private String  orderNumber;

    @Transient
    private HapCompany hapCompany;

    @Column
    private Date orderDate;

    @Column
    private String orderStatus;

    @Transient
    private HapCustomers hapCustomers;

    @Column
    private  Integer objectVersionNumber;

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public HapCompany getHapCompany() {
        return hapCompany;
    }

    public void setHapCompany(HapCompany hapCompany) {
        this.hapCompany = hapCompany;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public HapCustomers getHapCustomers() {
        return hapCustomers;
    }

    public void setHapCustomers(HapCustomers hapCustomers) {
        this.hapCustomers = hapCustomers;
    }

    public Integer getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(Integer objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }
}
