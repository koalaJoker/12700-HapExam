package hbi.core.exam.controllers;

import com.hand.hap.system.controllers.BaseController;
import hbi.core.exam.service.HapCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by 袁媛 on 2017/1/10.
 */
@Controller
public class HapCompanyController extends BaseController {

    @Autowired
    private HapCompanyService companyService;
    public void selest(){

    }
}
