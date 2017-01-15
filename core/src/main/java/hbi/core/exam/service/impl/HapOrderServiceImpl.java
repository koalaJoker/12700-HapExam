package hbi.core.exam.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.exam.dto.HapOrder;
import hbi.core.exam.dto.Page;
import hbi.core.exam.mapper.HapOrderMapper;
import hbi.core.exam.service.HapOrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by 袁媛 on 2017/1/11.
 */
public class HapOrderServiceImpl  implements HapOrderService{
    @Autowired
    private HapOrderMapper hapOrderMapper;
    @Override
    public List<HapOrder> findAll(Page<HapOrder> page) {
        return hapOrderMapper.findAll(page);
    }

    @Override
    public Long findCount(Page<HapOrder> page) {
        return hapOrderMapper.findCount(page);
    }
}
