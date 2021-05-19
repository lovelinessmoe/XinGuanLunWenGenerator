package com.loveliness.xin_guan_lun_wen_generator.controller;

import com.loveliness.xin_guan_lun_wen_generator.entity.Argument;
import com.loveliness.xin_guan_lun_wen_generator.entity.Form;
import com.loveliness.xin_guan_lun_wen_generator.entity.Project;
import com.loveliness.xin_guan_lun_wen_generator.entity.VO.LayVO;
import com.loveliness.xin_guan_lun_wen_generator.service.MainService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author loveliness
 * @create 2021-05-16 10:26
 */
@RestController
@RequestMapping("api/")
public class MainControllter {

    @Resource
    private MainService mainService;

    public static String sumLunWen;

    @RequestMapping("submit")
    public LayVO submit(Form form) {


        String type = form.getType();
        String xiangMu = form.getXiangmuType();

        String submin = mainService.submin(type, xiangMu);

        return new LayVO(0, 0, "成功", submin);
    }

    @RequestMapping("getXiangMu")
    public LayVO getXiangMu() {
        List<Project> xiangMu = mainService.getXiangMu();
        return new LayVO(0, 0, "", xiangMu);
    }

    @RequestMapping("getType")
    public LayVO getType() {
        List<Argument> type = mainService.getType();
        return new LayVO(0, 0, "", type);
    }


}
