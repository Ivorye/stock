package com.example.stock;

import com.example.stock.common.entity.Stocks;
import com.example.stock.common.service.StocksRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
class StockApplicationTests {

	@Autowired
	StocksRepository stocksRepository;
	@Test
	void getStockBySymbol(){
		Stocks stocks = stocksRepository.findBySymbol("000001");

		System.out.println("printing:"+stocks.getSymbol()+stocks.getFullname()+ stocks.getListDate());
	}
//	void contextLoads() throws SQLException {
//		System.out.println(dataSource.getConnection());
//		Connection connection = dataSource.getConnection();
//		System.out.println(connection);
//		connection.close();
//	}

}
