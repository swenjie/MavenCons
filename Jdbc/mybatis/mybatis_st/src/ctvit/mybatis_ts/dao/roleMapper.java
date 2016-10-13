package ctvit.mybatis_ts.dao;

import ctvit.mybatis_ts.model.role;
import ctvit.mybatis_ts.model.roleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface roleMapper {
    int countByExample(roleExample example);

    int deleteByExample(roleExample example);

    int deleteByPrimaryKey(String roleid);

    int insert(role record);

    int insertSelective(role record);

    List<role> selectByExampleWithBLOBs(roleExample example);

    List<role> selectByExample(roleExample example);

    role selectByPrimaryKey(String roleid);

    int updateByExampleSelective(@Param("record") role record, @Param("example") roleExample example);

    int updateByExampleWithBLOBs(@Param("record") role record, @Param("example") roleExample example);

    int updateByExample(@Param("record") role record, @Param("example") roleExample example);

    int updateByPrimaryKeySelective(role record);

    int updateByPrimaryKeyWithBLOBs(role record);

    int updateByPrimaryKey(role record);
}