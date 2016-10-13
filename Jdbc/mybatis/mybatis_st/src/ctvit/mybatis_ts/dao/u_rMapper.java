package ctvit.mybatis_ts.dao;

import ctvit.mybatis_ts.model.u_r;
import ctvit.mybatis_ts.model.u_rExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface u_rMapper {
    int countByExample(u_rExample example);

    int deleteByExample(u_rExample example);

    int deleteByPrimaryKey(String relationid);

    int insert(u_r record);

    int insertSelective(u_r record);

    List<u_r> selectByExample(u_rExample example);

    u_r selectByPrimaryKey(String relationid);

    int updateByExampleSelective(@Param("record") u_r record, @Param("example") u_rExample example);

    int updateByExample(@Param("record") u_r record, @Param("example") u_rExample example);

    int updateByPrimaryKeySelective(u_r record);

    int updateByPrimaryKey(u_r record);
}