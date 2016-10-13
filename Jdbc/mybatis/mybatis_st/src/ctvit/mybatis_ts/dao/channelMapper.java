package ctvit.mybatis_ts.dao;

import ctvit.mybatis_ts.model.channel;
import ctvit.mybatis_ts.model.channelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface channelMapper {
    int countByExample(channelExample example);

    int deleteByExample(channelExample example);

    int deleteByPrimaryKey(String channelid);

    int insert(channel record);

    int insertSelective(channel record);

    List<channel> selectByExample(channelExample example);

    channel selectByPrimaryKey(String channelid);

    int updateByExampleSelective(@Param("record") channel record, @Param("example") channelExample example);

    int updateByExample(@Param("record") channel record, @Param("example") channelExample example);

    int updateByPrimaryKeySelective(channel record);

    int updateByPrimaryKey(channel record);
}