package ctvit.mybatis_ts.dao;

import ctvit.mybatis_ts.model.user;
import ctvit.mybatis_ts.model.userExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface userMapper {
	int getRoleCountByPrimaryKey(Map<String, Object> param);

	List<user> findUserByPropertyType(user user);

	int countByExample(userExample example);

	int deleteByExample(userExample example);

	int deleteByPrimaryKey(String userid);

	int insert(user record);

	int insertSelective(user record);

	List<user> selectByExample(userExample example);

	user selectByPrimaryKey(String userid);

	user selectByPrimaryKeyS_RRes(String userid);

	user selectByPrimaryKeyS_RQue(String userid);

	int updateByExampleSelective(@Param("record") user record, @Param("example") userExample example);

	int updateByExample(@Param("record") user record, @Param("example") userExample example);

	int updateByPrimaryKeySelective(user record);

	int updateByPrimaryKey(user record);
}