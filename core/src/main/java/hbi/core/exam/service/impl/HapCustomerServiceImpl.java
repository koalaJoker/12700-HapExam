package hbi.core.exam.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.exam.dto.HapCustomers;
import hbi.core.exam.mapper.HapCustomerMapper;
import hbi.core.exam.service.HapCustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by 袁媛 on 2017/1/11.
 */
public class HapCustomerServiceImpl extends BaseServiceImpl<HapCustomers> implements HapCustomerService{

    @Autowired
    private HapCustomerMapper customerMapper;
    @Override
    public List<HapCustomers> findCustomerByCompanyId(Long companyId) {
        return customerMapper.findCustomerByCompanyId(companyId);
    }
}
