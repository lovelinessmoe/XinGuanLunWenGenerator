package com.loveliness.xin_guan_lun_wen_generator.service;

import cn.hutool.core.convert.Convert;
import com.loveliness.xin_guan_lun_wen_generator.entity.Error;
import com.loveliness.xin_guan_lun_wen_generator.entity.*;
import com.loveliness.xin_guan_lun_wen_generator.mapper.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.loveliness.xin_guan_lun_wen_generator.controller.MainControllter.sumLunWen;


/**
 * @author loveliness
 * @create 2021-05-16 11:31
 */
@Service
public class MainService {
    @Resource
    private ProjectMapper projectMapper;

    @Resource
    private FillingSectionMapper fillingSectionMapper;

    @Resource
    private ArgumentMapper argumentMapper;

    @Resource
    private ErrorMapper errorMapper;

    @Resource
    private FixupMapper fixupMapper;

    @Resource
    private ConclusionMapper conclusionMapper;

    @Resource
    private SubargumentMapper subargumentMapper;

    public String submin(String type, String xiangMu) {
        /*
         * 正文架构
         */
        //获取项目总架构
        Project project = projectMapper.getProject(xiangMu);
        //添加进入标题
        sumLunWen = project.getTitle() + "\n";
        //添加项目头
        sumLunWen = sumLunWen + project.getStart();
        //简述的后半部分

        FillingSection fillingSection1 = null;
        while (fillingSection1 == null) {
            fillingSection1 = fillingSectionMapper.getRandFillingSection(1);
        }
        sumLunWen = sumLunWen + fillingSection1.getContent() + "\n";
        //正文部分
        //正文项目介绍
        sumLunWen = sumLunWen + project.getMid();
        //正文承上启下
        FillingSection fillingSection2 = null;
        while (fillingSection2 == null) {
            fillingSection2 = fillingSectionMapper.getRandFillingSection(2);
        }
        sumLunWen = sumLunWen + fillingSection2.getContent() + "\n";
        //论点论述部分

        //GETArgument
        Argument argunmentByType = argumentMapper.getArgunmentByType(type);
        String[] argunmentSplit = argunmentByType.getArgument().split(",");
        for (int i = 0; i < argunmentSplit.length; i++) {
            sumLunWen = sumLunWen + Convert.numberToChinese(i + 1, false) + "," + argunmentSplit[i] + ":SUBARG" + (i + 1) + "\n";
        }

        //TODO
        //总结部分
        sumLunWen = sumLunWen + project.getEnd();
        //结尾最后

        FillingSection fillingSection3 = null;
        while (fillingSection3 == null) {
            fillingSection3 = fillingSectionMapper.getRandFillingSection(3);
        }
        sumLunWen = sumLunWen + fillingSection3.getContent() + "\n";


        /*
         * 骨架关键字替换
         */
        //将TYPE换成对应的VAL
        String typeVal = argunmentByType.getVal();
        System.out.println(typeVal);
        sumLunWen = sumLunWen.replace("TYPE", typeVal);

        //替换ARGUMENT
        String ARGUMENT = "";
        for (String s : argunmentSplit) {
            ARGUMENT = ARGUMENT + s + "、";
        }
        //去除最后一个顿号
        ARGUMENT = ARGUMENT.substring(0, ARGUMENT.length() - 1);
        sumLunWen = sumLunWen.replace("ARGUMENT", ARGUMENT);
        //SUBARG
        /*
        共多少个论点，lenth就是多少
        对不同的SUBARG i尾缀进行随机查找
         */

        for (int i = 1; i < argunmentSplit.length + 1; i++) {
            Subargument randSubArgByTypeAndSub = null;
            while (randSubArgByTypeAndSub == null) {
                randSubArgByTypeAndSub = subargumentMapper.getRandSubArgByTypeAndSub(type, i);
            }
            sumLunWen = sumLunWen.replace("SUBARG" + i, randSubArgByTypeAndSub.getContent());
        }

        //COUNT
        //数字转中文
        sumLunWen = sumLunWen.replace("COUNT", Convert.numberToChinese(argunmentSplit.length, false));
        //ERROR
        //随机获取一条常见错误
        Error randErrorByType = null;
        while (randErrorByType == null) {
            randErrorByType = errorMapper.getRandError();
        }
        sumLunWen = sumLunWen.replace("ERROR", randErrorByType.getError());
        randErrorByType = null;
        //弄两个错误，不至于有问题
        while (randErrorByType == null) {
            randErrorByType = errorMapper.getRandError();
        }
        sumLunWen = sumLunWen.replace("ERROR", randErrorByType.getError());
        //FIXUP
        Fixup randFixUpByType = null;
        while (randFixUpByType == null) {
            randFixUpByType = fixupMapper.getRandFixUp();
        }
        sumLunWen = sumLunWen.replace("FIXUP", randFixUpByType.getFixup());
        //CONCLUSION
        Conclusion conclusion = conclusionMapper.getConclusion();
        sumLunWen = sumLunWen.replace("CONCLUSION", conclusion.getConclusion());

        //TITLE
        sumLunWen = sumLunWen.replace("TITLE", project.getTitle());

        //.to。,to，
        sumLunWen = sumLunWen.replace(".", "。");
        sumLunWen = sumLunWen.replace(",", "，");

        return sumLunWen;
    }

    public List<Project> getXiangMu() {
        List<Project> allProject = projectMapper.getAllProject();
        return allProject;
    }

    public List<Argument> getType() {
        List<Argument> type = argumentMapper.getType();
        return type;
    }
}
