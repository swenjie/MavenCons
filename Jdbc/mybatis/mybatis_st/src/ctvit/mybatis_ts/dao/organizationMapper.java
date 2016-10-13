package ctvit.mybatis_ts.dao;

import ctvit.mybatis_ts.model.organization;
import ctvit.mybatis_ts.model.organizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface organizationMapper {
    int countByExample(organizationExample example);

    int deleteByExample(organizationExample example);

    int deleteByPrimaryKey(String organizationid);

    int insert(organization record);

    int insertSelective(organization record);

    List<organization> selectByExample(organizationExample example);

    organization selectByPrimaryKey(String organizationid);

    int updateByExampleSelective(@Param("record") organization record, @Param("example") organizationExample example);

    int updateByExample(@Param("record") organization record, @Param("example") organizationExample example);

    int updateByPrimaryKeySelective(organization record);

    int updateByPrimaryKey(organization record);
}