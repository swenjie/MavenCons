package com.ctvit.excel.jxl;

import java.util.List;

/**
 * @author 
 * @Email 
 * 
 */
public class TestExcelToDb {
    public static void main(String[] args) {
        //得到表格中所有的数据
        List<StuEntity> listExcel=StuService.getAllByExcel("d://book.xls");
        /*//得到数据库表中所有的数据
        List<StuEntity> listDb=StuService.getAllByDb();*/
        
        DBhepler db=new DBhepler();
        
        for (StuEntity stuEntity : listExcel) {
            int id=stuEntity.getId();
            if (!StuService.isExist(id)) {
                //不存在就添加
                String sql="insert into stu (name,sex,num) values(?,?,?)";
                String[] str=new String[]{stuEntity.getName(),stuEntity.getSex(),stuEntity.getNum()+""};
                db.AddU(sql, str);
            }else {
                //存在就更新
                String sql="update stu set name=?,sex=?,num=? where id=?";
                String[] str=new String[]{stuEntity.getName(),stuEntity.getSex(),stuEntity.getNum()+"",id+""};
                db.AddU(sql, str);
            }
        }
    }
}
