package hbi.core.exam.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Created by 袁媛 on 2017/1/11.
 */
@Table(
        name = "hap_om_order_lines"
)
public class HapLine {
    @Id
    @Column
    private Long lineId;
    private HapHeader hapHeader;
    @Column
    private Long lineNumber;
    @Transient
    private HapItems hapItems;
    @Column
    private long orderdQuantity;
    @Column
    private String orderQuantityUom;
    @Column
    private Long unitSellingPrice;
    @Column
    private String description;
    @Transient
    private HapCompany hapCompany;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public HapHeader getHapHeader() {
        return hapHeader;
    }

    public void setHapHeader(HapHeader hapHeader) {
        this.hapHeader = hapHeader;
    }

    public Long getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
    }

    public HapItems getHapItems() {
        return hapItems;
    }

    public void setHapItems(HapItems hapItems) {
        this.hapItems = hapItems;
    }

    public long getOrderdQuantity() {
        return orderdQuantity;
    }

    public void setOrderdQuantity(long orderdQuantity) {
        this.orderdQuantity = orderdQuantity;
    }

    public String getOrderQuantityUom() {
        return orderQuantityUom;
    }

    public void setOrderQuantityUom(String orderQuantityUom) {
        this.orderQuantityUom = orderQuantityUom;
    }

    public Long getUnitSellingPrice() {
        return unitSellingPrice;
    }

    public void setUnitSellingPrice(Long unitSellingPrice) {
        this.unitSellingPrice = unitSellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HapCompany getHapCompany() {
        return hapCompany;
    }

    public void setHapCompany(HapCompany hapCompany) {
        this.hapCompany = hapCompany;
    }
}
