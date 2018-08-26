package com.like.trip.mapper;

import com.like.trip.model.Selectionanswer;
import com.like.trip.model.SelectionanswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelectionanswerMapper {
    int countByExample(SelectionanswerExample example);

    int deleteByExample(SelectionanswerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Selectionanswer record);

    int insertSelective(Selectionanswer record);

    List<Selectionanswer> selectByExample(SelectionanswerExample example);

    Selectionanswer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Selectionanswer record, @Param("example") SelectionanswerExample example);

    int updateByExample(@Param("record") Selectionanswer record, @Param("example") SelectionanswerExample example);

    int updateByPrimaryKeySelective(Selectionanswer record);

    int updateByPrimaryKey(Selectionanswer record);
}