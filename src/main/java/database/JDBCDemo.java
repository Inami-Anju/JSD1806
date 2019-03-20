package database;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 测试git
 * @author Administrator
 *
 */
public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        DruidDataSource druidDataSource=new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql");
        druidDataSource.setDriverClassName("");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        DruidPooledConnection connection = druidDataSource.getConnection();
        Statement statement = connection.createStatement();
        statement.executeQuery("");
        druidDataSource.close();
    }
}
