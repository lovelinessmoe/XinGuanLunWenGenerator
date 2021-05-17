package com.loveliness.xin_guan_lun_wen_generator.controller;

import com.loveliness.xin_guan_lun_wen_generator.entity.Form;
import com.loveliness.xin_guan_lun_wen_generator.service.MainService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
    public String submit(Form form) {


        String type= form.getType();
        String xiangMu=form.getXiangmuType();

        String submin = mainService.submin(type, xiangMu);

        System.out.println(submin);

        return submin;
    }
}
