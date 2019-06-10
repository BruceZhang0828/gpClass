package com.zhy.pattern.templatePattern.jdbc.dao;

import com.zhy.pattern.templatePattern.jdbc.JdbcTemplate;
import com.zhy.pattern.templatePattern.jdbc.RowMapper;
import com.zhy.pattern.templatePattern.jdbc.entity.Member;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @ClassName: MemberDao
 * @Description: TODO
 * @auther: zhy
 * @Date: 2019/6/10 13:39
 * @Version: 1.0
 **/
public class MemberDao extends JdbcTemplate {

    public MemberDao(DataSource source) {
        super(source);
    }


    public List<?> selectAll(){
        String sql = "select * from t_member";

        List<?> objects = super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("userName"));
                member.setPassword(rs.getString("password"));
                member.setNickName(rs.getString("nickName"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        }, null);
        return objects;
    }

}
