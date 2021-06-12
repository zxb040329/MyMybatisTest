package com.lg;

import com.lg.dao.IUserDao;
import com.lg.entity.User;
import com.lg.io.Resource;
import com.lg.sqlSession.SqlSession;
import com.lg.sqlSession.SqlSessionFactory;
import com.lg.sqlSession.SqlSessionFactoryBuilder;
import org.dom4j.DocumentException;

import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

public class MyMybatisTest {
    public static void main(String[] args) throws PropertyVetoException, DocumentException, SQLException, ClassNotFoundException {
        InputStream inputStream = Resource.resourceAsStream("sqlMapConfig.xml");
        final SqlSessionFactory sqlSessionFactory = SqlSessionFactoryBuilder.build(inputStream);
        final SqlSession sqlSession = sqlSessionFactory.openSession();

        //1.查询一个
        final User user = new User();
        user.setId(1);
        user.setUsername("admin1");
//        User selectOneUser = sqlSession.selectOne("com.lg.dao.IUserDao.getUserById", user);
        User selectOneUser = sqlSession.selectOne("com.lg.dao.IUserDao.getUserById", user);
        System.out.println(selectOneUser);

        //2.查询所有
        List<User> selectList = sqlSession.selectList("com.lg.dao.IUserDao.getUserList");
        for (User user1 : selectList) {
            System.out.println(user1);
        }


        System.out.println("------------------------------");
        //3.getMapper的方式
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        System.out.println(userDao.getUserById(user));
        System.out.println("---");
        final List<User> userList = userDao.getUserList();
        for (User user1 : userList) {
            System.out.println(user1);
        }



    }
}
