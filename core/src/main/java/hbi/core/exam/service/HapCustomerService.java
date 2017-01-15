package hbi.core.exam.service;

import com.hand.hap.system.service.IBaseService;
import hbi.core.exam.dto.HapCustomers;

import java.util.List;

/**
 * Created by 袁媛 on 2017/1/11.
 */
public interface HapCustomerService extends IBaseService<HapCustomers>{

    public List<HapCustomers> findCustomerByCompanyId(Long companyId);
}
