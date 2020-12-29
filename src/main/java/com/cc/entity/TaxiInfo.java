package com.cc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: CCC
 * @date: 2020/12/29 11:29
 * @Description: 出租车信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaxiInfo {
    /**
     * 车票号
     */
    private String plateNumber;
    /**
     * 购买日期
     */
    private Date buyDate;
    /**
     * 品牌名称
     */
    private String brandName;
    /**
     * 公里数
     */
    private int kilometreNumber;
    /**
     * 修理状态（T:大修 F:未大修）
     */
    private String fix;
}
