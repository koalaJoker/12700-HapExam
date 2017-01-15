package hbi.core.exam.service;

import com.hand.hap.system.service.IBaseService;
import hbi.core.exam.dto.HapCompany;

/**
 * Created by 袁媛 on 2017/1/10.
 */
public interface HapCompanyService extends IBaseService<HapCompany>{

    public Integer findIdByName(String companyName);
}
