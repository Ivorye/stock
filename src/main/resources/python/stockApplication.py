import pymysql, pandas as pd, tushare as ts, loadStocks as ld

db=ld.connectDB()
print("connectDB() executed!!")
df=ld.getStockBasic()
print("getStockBasic() executed!!")
ld.createStockTable(df,db)
print("createStockTable(df,db) executed!!")
ld.loadAllBasic(df,db)
print("loadAllBasic(df,db) executed!!")
#将DF数据帧中从开始日期到结束日期之间的交易记录导入每支股票的数据库
ld.insertNewTransactonRecordForAllStocks(df,db,start_date='20240521',end_date='20250618')
