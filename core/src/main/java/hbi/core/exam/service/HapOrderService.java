package hbi.core.exam.service;

import hbi.core.exam.dto.HapOrder;
import hbi.core.exam.dto.Page;

import java.util.List;

/**
 * Created by 袁媛 on 2017/1/11.
 */
public interface HapOrderService {

    public List<HapOrder> findAll(Page<HapOrder> page);

    public  Long findCount(Page<HapOrder> page);
}
