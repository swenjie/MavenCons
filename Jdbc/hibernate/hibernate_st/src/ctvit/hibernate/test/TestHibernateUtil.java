package ctvit.hibernate.test;

import java.util.Iterator;
import java.util.List;
import ctvit.hibernate.model.*;
import ctvit.hibernate.commons.*;
public class TestHibernateUtil {
    public static void main(String[] args) {
        
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
        //del by id
		/*  User user4 = new User();
		     user4.setId(5);
		     userDao.delete(user4);
		     System.out.println("删除了ID为5的用户！");
		*/  
    	}
}