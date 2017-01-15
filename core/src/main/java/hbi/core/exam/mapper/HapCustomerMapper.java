package hbi.core.exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.exam.dto.HapCustomers;

import java.util.List;

/**
 * Created by 袁媛 on 2017/1/11.
 */
public interface HapCustomerMapper extends Mapper<HapCustomers>{

   public List<HapCustomers>  findCustomerByCompanyId(Long companyId);

}
