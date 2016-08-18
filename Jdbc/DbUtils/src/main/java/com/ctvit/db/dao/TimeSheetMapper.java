package com.ctvit.db.dao;

import com.ctvit.db.beans.TimeSheet;
import com.ctvit.db.beans.TimeSheetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeSheetMapper {
    int countByExample(TimeSheetExample example);

    int deleteByExample(TimeSheetExample example);

    int deleteByPrimaryKey(String timesheetid);

    int insert(TimeSheet record);

    int insertSelective(TimeSheet record);

    List<TimeSheet> selectByExample(TimeSheetExample example);

    TimeSheet selectByPrimaryKey(String timesheetid);

    int updateByExampleSelective(@Param("record") TimeSheet record, @Param("example") TimeSheetExample example);

    int updateByExample(@Param("record") TimeSheet record, @Param("example") TimeSheetExample example);

    int updateByPrimaryKeySelective(TimeSheet record);

    int updateByPrimaryKey(TimeSheet record);
}