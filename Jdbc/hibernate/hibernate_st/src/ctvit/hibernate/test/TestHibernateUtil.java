package ctvit.hibernate.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import ctvit.hibernate.model.*;
import ctvit.hibernate.commons.*;
public class TestHibernateUtil {
    public static void main(String[] args) {
    	/*
    	RecordUser ru1=new RecordUser();
    	ru1.setUserid("00013");
    	ru1.setUsername("新的");
    	RecordRole rr1=new RecordRole();
    	rr1.setRoleid("00013");
    	RecordUserRole rur=new RecordUserRole();
    	rur.setRelationid("898u");
    	rur.setRole(rr1);
    	rur.setUser(ru1);
    	
    	Set<RecordUserRole> sets=new HashSet<RecordUserRole>();
    	sets.add(rur);
    	
    	ru1.setRu(sets);
    	
    	BaseDAO.add(ru1);
    	//BaseDAO.update(ru1);
    	*/
    	/*ru=(RecordUser) BaseDAO.getS(RecordUser.class, "user001");
    	System.out.println(ru.getRu().size());
    	Iterator<RecordUserRole> it=ru.getRu().iterator();
    	while(it.hasNext()){
    		RecordUserRole rdu=it.next();
    		System.out.println(rdu.getRole().getRoledesc());
    	}*/
    	 /*
    	RecordChannel rc=new RecordChannel();
    	rc=(RecordChannel) BaseDAO.getS(RecordChannel.class, "001");
        System.out.println(rc.getOrganization().getBeizu());
        */
      /*
        //add
        Test test1 = new Test();
        test1.setId(8);
        BaseDAO.add(test1);
        System.out.println("添加了一条数据");
       
    	
        //get
        Test test2 = (Test)BaseDAO.get(Test.class, 1);
        System.out.println("查询id为1的用户"+test2.getId());
        
       
      
        //update
       test2.setId(21);
       System.out.println(BaseDAO.update(test2));
        System.out.println("更新数据"+test2.getId());
        */
       
        //query all
    	/*
        Integer[] para ={1};
        // from Test --Test不是表名  而是对应映射的类名
        List<Test> list = BaseDAO.query("from Test t where t.id=?", para);
        System.out.println(list.size());
        Iterator<Test> iter = list.iterator();
        Test test3 = null;
        while(iter.hasNext()){
            test3 = (Test)iter.next();
            System.out.println(test3.getId());
        }
        */
        //del by id
		/*  User user4 = new User();
		     user4.setId(5);
		     userDao.delete(user4);
		     System.out.println("删除了ID为5的用户！");
		*/  
    	}
}