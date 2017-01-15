package hbi.core.exam.controllers;

import com.hand.hap.system.dto.ResponseData;
import hbi.core.exam.dto.HapOrder;
import hbi.core.exam.dto.Page;
import hbi.core.exam.service.HapOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 袁媛 on 2017/1/11.
 */
@Controller
@RequestMapping("/select")
public class HapOrderController {
    @Autowired
    private HapOrderService orderService;
    @RequestMapping("")
    @ResponseBody
    public ResponseData selectAll( @RequestParam(name="companyId",required = false) Long companyId,
                                   @RequestParam(name="customerName",required = false, defaultValue = "") String customerName,
                                   @RequestParam(name="orderNumber",required = false, defaultValue = "") String orderNumber,
                                   @RequestParam(name="itemDescription",required = false, defaultValue = "") String itemDescription,
                                   @RequestParam(name = "orderStatus", required = false, defaultValue = "") String orderStatus,
                                   @RequestParam(name ="page", required = false, defaultValue = "1") int page,
                                   @RequestParam(name ="pageSize", required = false, defaultValue = "10") int pageSize){
        HapOrder hapOrder=new HapOrder();
        hapOrder.setCompanyId(companyId).setOrderStatus(orderStatus).setItemDescription(itemDescription).setOrderNumber(orderNumber).setCustomerName(customerName);
        Page<HapOrder> pageOrder=new Page<HapOrder>();
        pageOrder.setEntity(hapOrder).setCurrentPage(page).setPageSize(pageSize);
        List<HapOrder> list=orderService.findAll(new Page<HapOrder>().setEntity(hapOrder).setCurrentPage(page).setPageSize(pageSize));
        ResponseData responseData=new ResponseData();
        responseData.setRows(list);
        responseData.setTotal(orderService.findCount(pageOrder));
        return responseData;
    }
}
