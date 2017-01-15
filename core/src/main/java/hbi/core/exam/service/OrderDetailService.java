package hbi.core.exam.service;

import com.hand.hap.system.dto.ResponseData;
import hbi.core.exam.dto.OrderDetail;
import hbi.core.exam.dto.Page;

/**
 * Created by 袁媛 on 2017/1/13.
 */
public interface OrderDetailService {
    public ResponseData setPage(Page<OrderDetail> page);
}
