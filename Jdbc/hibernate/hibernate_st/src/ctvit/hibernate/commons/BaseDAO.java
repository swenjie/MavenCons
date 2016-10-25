package ctvit.hibernate.commons;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BaseDAO {
	/**
	 * @param obj
	 *            添加数据
	 * @return
	 */
	public static boolean add(Object obj) {
		Session session = null;
		Transaction tran = null;
		boolean result = false;
		try {
			session = HibernateUtil.getSession();
			tran = session.beginTransaction();
			session.save(obj);
			System.out.println(2);
			tran.commit();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			if (tran != null) {
				// 事物回滚
				tran.rollback();
			}
		} finally {
			if (session != null) {
				// 关闭session
				session.close();
			}
		}
		return result;
	}

	/**
	 * @return 更新数据 参数为修改的主键id对象
	 */
	public static boolean update(Object object) {
		Session session = null;
		Transaction tran = null;
		boolean result = false;
		try {
			session = HibernateUtil.getSession();
			tran = session.beginTransaction();
			session.update(object);
			tran.commit();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			if (tran != null) {
				// 事物回滚
				tran.rollback();
			}
		} finally {
			if (session != null) {
				// 关闭session
				session.close();
			}
		}
		return result;
	}
	public static Object getS(Class c,String id){
		Session session=null;
		Object object=null;
		try {
			session = HibernateUtil.getSession();
			object = session.get(c, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				// 关闭session
				session.close();
			}
		}
		return object;
	}

	/**
	 * @param c
	 * @param id
	 *            查询一条数据根据主键的id号
	 * @return
	 */
	public static Object get(Class c, int id) {
		Session session = null;
		Object object = null;
		try {
			session = HibernateUtil.getSession();
			object = session.get(c, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				// 关闭session
				session.close();
			}
		}
		return object;
	}

	/**
	 * @param obj
	 * @return 删除数据
	 */
	public static boolean delete(Object obj) {
		Session session = null;
		Transaction tran = null;
		boolean result = false;
		try {
			session = HibernateUtil.getSession();
			tran = session.beginTransaction();
			session.delete(obj);
			tran.commit();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			if (tran != null) {
				// 事物回滚
				tran.rollback();
			}
		} finally {
			if (session != null) {
				// 关闭session
				session.close();
			}
		}
		return result;
	}

	/**
	 * @param <T>
	 *            查询多条记录
	 * @param sql
	 *            sql语句
	 * @param param
	 *            参数数组
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> query(String sql, Integer[] param) {

		List<T> list = new ArrayList<T>();
		Session session = null;
		try {
			session = HibernateUtil.getSession();
			Query query = session.createQuery(sql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					System.out.println(param[i]);
					query.setInteger(i, param[i]);
				}
			} else {
				System.out.println("null");
			}
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return list;
	}

	/**
	 * @param sql
	 * @param param
	 *            查询单条记录
	 * @return
	 */
	public static Object queryOne(String sql, String[] param) {
		Object object = null;
		Session session = null;
		try {
			session = HibernateUtil.getSession();
			Query query = session.createQuery(sql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					query.setString(0, param[i]);
				}
				object = query.uniqueResult();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return object;
	}

	/**
	 * @param <T>
	 * @param sql
	 * @param param
	 * @param page
	 * @param size
	 * @return 实现分页查询
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> queryByPage(String sql, String[] param, int page, int size) {
		List<T> list = new ArrayList<T>();
		Session session = null;
		try {
			session = HibernateUtil.getSession();
			Query query = session.createQuery(sql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					query.setString(i, param[i]);
				}
			}
			// 筛选条数
			query.setFirstResult((page - 1) * size);
			query.setMaxResults(size);
			list = query.list();
		} catch (Exception e) {
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return list;
	}

	/**
	 * @param hql
	 * @param pras
	 * @return返回数据个数
	 */
	public static int getCount(String hql, String[] pras) {
		int resu = 0;
		Session s = null;
		try {
			s = HibernateUtil.getSession();
			Query q = s.createQuery(hql);
			if (pras != null) {
				for (int i = 0; i < pras.length; i++) {
					q.setString(i, pras[i]);
				}
			}
			resu = Integer.valueOf(q.iterate().next().toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (s != null)
				s.close();
		}
		return resu;
	}

}