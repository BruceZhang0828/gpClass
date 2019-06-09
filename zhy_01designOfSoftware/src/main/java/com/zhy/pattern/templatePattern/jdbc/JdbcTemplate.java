package com.zhy.pattern.templatePattern.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource source){
        this.dataSource = source;
    }

    public List<?> executeQuery(String sql,RowMapper<?> rowMapper,Object[] values){
        try {
            //1.获取链接
            Connection connection = this.getConnection();
            //2.创建语句集
            PreparedStatement preparedStatement = this.createPrepareStatement(connection,sql);
            //3.执行语句集
            ResultSet resultSet = this.executeQuery(preparedStatement,values);
            //4.处理结果集
            List<?> result = this.paresResultSet(resultSet,rowMapper);
            //5.关闭结果集
            this.closeResultSet(resultSet);
            //6.关闭语句集
            this.closePreparedStatement(preparedStatement);
            //7.关闭链接
            this.closeConnection(connection);

            return result;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    protected void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }

    protected void closePreparedStatement(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }

    protected void closeResultSet(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }

    protected List<?> paresResultSet(ResultSet resultSet, RowMapper<?> rowMapper) throws Exception {
        List<Object> result = new ArrayList<Object>();
        int row = 1;
        while (resultSet.next()) {
            result.add(rowMapper.mapRow(resultSet,row++));
        }
        return result;
    }

    protected  ResultSet executeQuery(PreparedStatement preparedStatement, Object[] values) throws SQLException {

        for (int i = 0; i < values.length; i++) {
            preparedStatement.setObject(i,values[i]);
        }
        return preparedStatement.executeQuery();
    }

    protected PreparedStatement createPrepareStatement(Connection connection, String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    public  Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
