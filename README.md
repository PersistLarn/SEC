# SEC
First Java desktop application for review and comments from anyone around the world!
SEC stands for 'Stock', 'Expenses', 'Coupons'. The application is a simple GUI developed using Swing for 
maintaining a kitchen stock, expenses and coupons. So far, tha application has only the 'Stock' part of it
and allows extensibility to the others by providing separate tabs when they are developed and integrated in
future. 

jdatepicker used in the 'Stock' panel is downloaded from the web and the code for implementation copied from 
http://stackoverflow.com/questions/26794698/how-do-i-implement-jdatepicker.

The source code is available on:
https://github.com/PersistLarn/SEC/tree/master/SEC/src/sec
The unit tests for the database are on:
https://github.com/PersistLarn/SEC/tree/master/SEC/src/sectests

CouponsUI.java and ExpensesUI.java simply have a left tree implemented and the right panel left empty for
future support. StockUI.java is the file that shows the 'Stock' panel. The application backend is MySQL.
Hence the following tables need to be created in database Stock:
1. StockMaster
2. ItemStock
3. ItemAddTransaction.

In order to run the application, follow the following steps:
1. Download SEC.jar
2. Run as jar -jar SEC.jar or double-click to launch.

