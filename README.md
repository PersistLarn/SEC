# SEC
First Java desktop application for review and comments from anyone around the world!
SEC stands for 'Stock', 'Expenses', 'Coupons'. The application is a simple GUI developed using Swing for 
maintaining a kitchen stock, expenses and coupons. So far, tha application has only the 'Stock' part of it
and allows extensibility to the others by providing separate tabs when they are developed and integrated in
future. 

jdatepicker used in the 'Stock' panel is downloaded from the web and the code for implementation copied from <br>
http://stackoverflow.com/questions/26794698/how-do-i-implement-jdatepicker. <br>

The source code is available on: <br>
https://github.com/PersistLarn/SEC/tree/master/SEC/src/sec <br>
The unit tests for the database are on: <br>
https://github.com/PersistLarn/SEC/tree/master/SEC/src/sectests <br>

CouponsUI.java and ExpensesUI.java simply have a left tree implemented and the right panel left empty for
future support. StockUI.java is the file that shows the 'Stock' panel. The application backend is MySQL.
Hence the following tables need to be created in database Stock: <br>
1. StockMaster <br>
2. ItemStock <br>
3. ItemAddTransaction. <br>

In order to create the tables, do the following: <br>
1. Use the dump file dump.sql in https://github.com/PersistLarn/SEC/tree/master/Database <br>
to create the database and tables. <br>
Use 'Data Import' from the file, if using an GUI or  if using the command-line: <br>
a. Create a database stock. <br>
b. mysql -u username -p stock < dump.sql <br>

In order to run the application, follow the following steps: <br>
1. Download SEC.jar <br>
2. Run as jar -jar SEC.jar <dbusername> <dbpassword>, where <br>
dbusername => username for MySQL access
dbpassword => password for MySQL access.

The application will still launch without providing the command-line arguments, but
will not be able to store or retreive data.

