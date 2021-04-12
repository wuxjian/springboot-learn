package the.wuxjian.springbootlearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import the.wuxjian.springbootlearn.service.DemoService;

import javax.annotation.Resource;

/**
 * Created by wuxjian on 2021/4/12
 */
@RestController
public class TestController {
    @Resource
    private DemoService demoService;

    @RequestMapping("/getValue")
    public String getKeyValue() {
        return demoService.test();
    }
}
