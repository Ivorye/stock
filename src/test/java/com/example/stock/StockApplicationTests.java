package com.example.stock;

import com.example.stock.common.entity.Stock;
import com.example.stock.common.mapper.StockMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.example.stock.common.mapper")
class StockApplicationTests {

	@Autowired
	StockMapper stockMapper;
	@Test
	void getStockBySymbol(){
		List<Stock> stocks = stockMapper.getAll();
		for (Stock stock:stocks) {
			System.out.println("printing:"+stock.getSymbol());
		}
	}
//	void contextLoads() throws SQLException {
//		System.out.println(dataSource.getConnection());
//		Connection connection = dataSource.getConnection();
//		System.out.println(connection);
//		connection.close();
//	}

}
