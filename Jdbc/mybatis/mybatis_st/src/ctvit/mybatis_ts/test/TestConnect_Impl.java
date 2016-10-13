package ctvit.mybatis_ts.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ctvit.mybatis_ts.dao.userMapper;
import ctvit.mybatis_ts.dao.impl.userMapperImpl;
import ctvit.mybatis_ts.model.role;
import ctvit.mybatis_ts.model.user;
import ctvit.mybatis_ts.model.userExample;

public class TestConnect_Impl {

	public static void main(String[] args) {
		userMapper um=new userMapperImpl();
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("userid", "user001");
		param.put("@acount", new Integer(0));
		int count=um.getRoleCountByPrimaryKey(param);
		System.out.println(count);
		/*
		user user=um.selectByPrimaryKeyS_RQue("user002");
		System.out.println("Que:"+user.getRolelist().get(0).getRolename());
		
		user user2=um.selectByPrimaryKeyS_RRes("user001");
		System.out.println("Res:"+user2.getRolelist().size());
		
		List<role> roles=user2.getRolelist();
		for(role r:roles){
			System.out.println(r.getCreatetime());
		}
		*/
		/*
		user user=um.selectByPrimaryKey("user001");
		System.out.println("输出用户: "+user);
		
		userExample ue=new userExample();
		ue.or().andUseridEqualTo
			("user001").andUsernameEqualTo("admin");
		
		userExample uee=new userExample();
		userExample.Criteria criterial=uee.createCriteria();
		criterial.andUseridIsNotNull();
		criterial.andUseridEqualTo("user001");
		
		uee.or(criterial);
		
		List<user> list=um.selectByExample(ue);
		
		for(user u:list){
			System.out.println("example:"+u);
		}
		
		user fu=new user();
		fu.setUserid("user001");
		fu.setUsername("admin");
		List<user> list2=um.findUserByPropertyType(fu);
		for(user u:list2){
			System.out.println("new "+u);
		}
		*/
	}
	
}
