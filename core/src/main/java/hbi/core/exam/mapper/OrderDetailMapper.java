package hbi.core.exam.mapper;

import hbi.core.exam.dto.OrderDetail;
import hbi.core.exam.dto.Page;

import java.util.List;

/**
 * Created by 袁媛 on 2017/1/13.
 */
public interface OrderDetailMapper {

    public List<OrderDetail> findAll(Page<OrderDetail> page);

    public Long findDetailCount(Page<OrderDetail> page);
}
