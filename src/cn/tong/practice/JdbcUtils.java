package cn.tong.practice;

import com.mysql.jdbc.Driver;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {
    private static   String  url=null;
    private static   String userName=null;
    private static   String password=null;

    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            InputStream resourceAsStream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
            Properties properties=new Properties();
            properties.load(resourceAsStream);
            url=properties.getProperty("url");
            userName=properties.getProperty("userName");
            password=properties.getProperty("password");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection() throws Exception{
        Connection connection = DriverManager.getConnection(url, userName, password);
        return  connection;
    }

    public Integer updateOrInsert(String sql)throws Exception{
        Connection con=   getConnection();
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        return preparedStatement.executeUpdate();

    }
    public void query(String sql,Class clazz)throws Exception{
        Connection con=   getConnection();
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

            Field[] fields = clazz.getFields();
            for (Field field : fields) {
                while (resultSet.next()) {

                }
            }



    }

    public void shutConnection(Connection con,PreparedStatement pre){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
       if(con!=null){
           try {
               pre.close();
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }

    }

}
