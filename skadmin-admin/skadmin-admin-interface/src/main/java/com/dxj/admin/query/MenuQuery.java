package com.dxj.admin.query;

import com.dxj.common.annotation.Query;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Author: dxj
 * @Date: 2019-12-25 16:43
 */
@Data
public class MenuQuery {

    @Query(blurry = "name,path,component")
    private String blurry;

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;
}
