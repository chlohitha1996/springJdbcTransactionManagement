JDBC TRANSACTION MANAGEMENT
-------------------------------------------------------------------------------
Inserting the values in to the database
using xml configuration file
Interfaces are also implemented



In JDBC, Connection interface provides methods to manage transaction.

Method	Description
void setAutoCommit(boolean status)	It is true bydefault means each transaction is committed bydefault.
void commit()	commits the transaction.
void rollback()	cancels the transaction.
