package com.cc.utils;

import cn.hutool.core.bean.BeanUtil;
import com.cc.entity.TaxiInfo;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author: CC
 * @date: 2020/12/29 16:33
 * @Description: 数据输入处理封装
 */

public class LoadData {

    public static List<TaxiInfo> getTaxiInfos(String path) {
        File file = new File(path);
        List<TaxiInfo> list = new ArrayList<>();
        try {
            List<String> lines = FileUtils.readLines(file);
            Stream<String> stream = lines.stream();
            stream.filter(e -> !e.startsWith("SubmitDate")).forEach(e -> {
                String[] split = e.split("\\|");
                try {
                    list.add(TaxiInfo.builder().plateNumber(split[0]).buyDate(new SimpleDateFormat("yyyy/MM/dd").parse(split[1]))
                            .brandName(split[2]).kilometreNumber(Integer.valueOf(split[3])).fix(split[4]).build());
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
            });
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
