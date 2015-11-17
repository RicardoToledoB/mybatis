package com.mitsu.mybatis.config;
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class MyBatisUtil {
    String resource = "com/mitsu/mybatis/config/mybatis-config.xml";
    private SqlSession session = null;
    public SqlSession getSession() {
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
            session = sqlMapper.openSession();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return session;
    }
}
