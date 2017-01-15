package hbi.core.exam.service.impl;

import com.hand.hap.system.dto.ResponseData;
import hbi.core.exam.dto.OrderDetail;
import hbi.core.exam.dto.Page;
import hbi.core.exam.mapper.OrderDetailMapper;
import hbi.core.exam.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by 袁媛 on 2017/1/13.
 */
public class OrderDetailServiceImpl implements OrderDetailService{
     @Autowired
     private OrderDetailMapper orderDetailMapper;

    @Override
    public ResponseData setPage( Page<OrderDetail> page){
        List<OrderDetail> list=orderDetailMapper.findAll(page);
        ResponseData responseData=new ResponseData();
        responseData.setRows(list);
        responseData.setTotal(orderDetailMapper.findDetailCount(page));
        return responseData;
    }
}
