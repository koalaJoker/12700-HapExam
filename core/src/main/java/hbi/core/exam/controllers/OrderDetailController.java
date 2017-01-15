package hbi.core.exam.controllers;

import com.hand.hap.system.dto.ResponseData;
import hbi.core.exam.dto.OrderDetail;
import hbi.core.exam.dto.Page;
import hbi.core.exam.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 袁媛 on 2017/1/13.
 */
@Controller
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

    @ResponseBody
    @RequestMapping("/selectOrderDetail")
    public ResponseData selectOrderDetail(OrderDetail orderDetail,
                                          @RequestParam(name ="page", required = false, defaultValue = "1") int page,
                                          @RequestParam(name ="pageSize", required = false, defaultValue = "10") int pageSize){
        System.out.println("查询 查询 查询 查询");
        OrderDetail detail=new OrderDetail();
      return  orderDetailService.setPage( new Page<OrderDetail>().setCurrentPage(page).setPageSize(pageSize).setEntity(detail));

    }
    @ResponseBody
    @RequestMapping("/insert")
    public void insert(@RequestBody OrderDetail orderDetail){
        System.out.println("附加信息"+orderDetail.getAddition1());
         System.out.print("添加添加添加添加添加添加");

    }
}
