package hbi.core.exam.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.exam.dto.HapCompany;
import hbi.core.exam.mapper.HapCompanyMapper;
import hbi.core.exam.service.HapCompanyService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by 袁媛 on 2017/1/10.
 */
public class HapCompanyServiceImpl extends BaseServiceImpl<HapCompany> implements HapCompanyService {

    @Autowired
    private HapCompanyMapper companyMapper;
    @Override
    public Integer findIdByName(String companyName) {
        return companyMapper.findIdByName(companyName);
    }
}
