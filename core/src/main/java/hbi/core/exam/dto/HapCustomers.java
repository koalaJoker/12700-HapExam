package hbi.core.exam.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Created by 袁媛 on 2017/1/11.
 */
@Table(
        name = "hap_ar_customers"
)
public class HapCustomers {

    @Id
    @Column
    private Long customerId;

    @Column
    private String customerNumber;

    @Column
    private String customerName;

    @Transient
    private HapCompany hapCompany;

    @Column
    private String enabledFlag;

    @Column
    private Long companyId;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public HapCompany getHapCompany() {
        return hapCompany;
    }

    public void setHapCompany(HapCompany hapCompany) {
        this.hapCompany = hapCompany;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}
