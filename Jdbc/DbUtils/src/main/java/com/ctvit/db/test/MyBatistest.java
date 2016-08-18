package com.ctvit.db.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ctvit.db.beans.TimeSheetExample;
import com.ctvit.db.beans.UserInfo;
import com.ctvit.db.beans.UserInfoExample;
import com.ctvit.db.utils.MyBatisUtil;
public class MyBatistest {

	public static void main(String[] args) {
		UserInfo user=new UserInfo();
		user.setId(106);
		user.setUsername("admin105");
		user.setPassword("admin105");
		
		UserInfoExample userexample=new UserInfoExample();
		userexample.createCriteria().andIdBetween(99, 130);
		
		TimeSheetExample timeSheetExample=new TimeSheetExample();
		timeSheetExample.createCriteria();
		
		SqlSession session=MyBatisUtil.getSession();
		session.commit(false);
		session.insert("com.ctvit.db.dao.UserInfoMapper.insert",user);
		//session.delete("com.ctvit.db.dao.UserInfoMapper.deleteByPrimaryKey",101);
		List<UserInfo> list=
				session.selectList("com.ctvit.db.dao.UserInfoMapper.selectByExample", userexample);
		for(UserInfo ui:list){
			System.out.println(ui.toString());
		}
		//session.commit();
	}

}
