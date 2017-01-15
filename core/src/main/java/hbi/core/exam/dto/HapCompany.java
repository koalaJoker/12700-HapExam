package hbi.core.exam.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 袁媛 on 2017/1/10.
 */
@Table(
        name = "hap_org_companys"
)
//@ExtensionAttribute(
//        disable = true
//)
public class HapCompany {
    @Id
    @Column
     private Long companyId;
    @Column
    private  String companyNumber;

    @Column
     private String companyName
            ;
    @Column
    private String enabledFlag;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEnabledFlag() {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag) {
        this.enabledFlag = enabledFlag;
    }
}
