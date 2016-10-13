package ctvit.mybatis_ts.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import ctvit.mybatis_ts.commons.MyBatisUtil;
import ctvit.mybatis_ts.dao.userMapper;
import ctvit.mybatis_ts.model.user;
import ctvit.mybatis_ts.model.userExample;

public class userMapperImpl implements userMapper {

	@Override
	public int countByExample(userExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(userExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String userid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(user record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(user record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<user> selectByExample(userExample example) {
		SqlSession session=MyBatisUtil.getSession();
		List<user> list=null;
		String statement="ctvit.mybatis_ts.dao.userMapper.selectByExample";
		try {
			list=session.selectList(statement, example);	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public user selectByPrimaryKey(String userid) {
		SqlSession session=MyBatisUtil.getSession();
		user user=null;
		String statement="ctvit.mybatis_ts.dao.userMapper.selectByPrimaryKey";
		try {
			user=session.selectOne(statement,userid);	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return user;
	}

	@Override
	public int updateByExampleSelective(user record, userExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(user record, userExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(user record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(user record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<user> findUserByPropertyType(user user) {
		SqlSession session=MyBatisUtil.getSession();
		List<user> list=null;
		String statement="ctvit.mybatis_ts.dao.userMapper.findUserByPropertyType";
		try {
			list=session.selectList(statement,user);	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}

	@Override
	public user selectByPrimaryKeyS_RRes(String userid) {
		SqlSession session=MyBatisUtil.getSession();
		user user=null;
		String statement="ctvit.mybatis_ts.dao.userMapper.selectByPrimaryKeyS_RRes";
		try {
			user=session.selectOne(statement, userid);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return user;
	}

	@Override
	public user selectByPrimaryKeyS_RQue(String userid) {
		SqlSession session=MyBatisUtil.getSession();
		user user=null;
		String statement="ctvit.mybatis_ts.dao.userMapper.selectByPrimaryKeyS_RQue";
		try {
			user=session.selectOne(statement, userid);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return user;
	}

	@Override
	public int getRoleCountByPrimaryKey(Map<String, Object> param) {
		SqlSession session=MyBatisUtil.getSession();
		Integer result=0;
		String statement="ctvit.mybatis_ts.dao.userMapper.getRoleCountByPrimaryKey";
		try {
			session.selectOne(statement, param);
			result=(Integer) param.get("acount");
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return result;
	}

}
