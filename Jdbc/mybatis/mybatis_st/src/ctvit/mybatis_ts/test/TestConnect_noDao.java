package ctvit.mybatis_ts.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import ctvit.mybatis_ts.model.user;


public class TestConnect_noDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mybatis 的配置文件
		String resource="SqlMapClient.xml";
		//使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
		InputStream is=TestConnect_noDao.class.getClassLoader().getResourceAsStream(resource);
		//构建sqlsession的工厂
		
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		//使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
        //Reader reader = Resources.getResourceAsReader(resource); 
        //构建sqlSession的工厂
        //SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能执行映射文件中sql的sqlSession
		SqlSession session=sessionFactory.openSession();
		  /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
		String statement="ctvit.mybatis_ts.dao.userMapper.selectByPrimaryKey";
		//映射sql的标示字符串
		//执行查询返回一个唯一user对象的sql
		user user=session.selectOne(statement,"user001");
		System.out.println(user);
		
	}

}
