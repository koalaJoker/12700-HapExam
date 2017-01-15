package hbi.core.exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.exam.dto.HapCompany;

/**
 * Created by 袁媛 on 2017/1/10.
 */
public interface HapCompanyMapper extends Mapper<HapCompany>{


    public Integer findIdByName(String companyName);
}
