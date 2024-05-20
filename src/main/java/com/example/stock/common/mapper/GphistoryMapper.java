package com.example.stock.common.mapper;

import com.example.stock.common.entity.TransactionDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface GphistoryMapper {


    @Select("select * from ${table}")// 用#号指定变量会加上双引号，导致表名不被识别。美元符号才能识别为表名
    public List<TransactionDetail> getTransactionHist(@Param("table") String table);
}
