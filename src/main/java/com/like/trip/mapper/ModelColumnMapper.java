package com.like.trip.mapper;

import com.like.trip.model.ModelColumn;
import com.like.trip.model.ModelColumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelColumnMapper {
    int countByExample(ModelColumnExample example);

    int deleteByExample(ModelColumnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ModelColumn record);

    int insertSelective(ModelColumn record);

    List<ModelColumn> selectByExample(ModelColumnExample example);

    ModelColumn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ModelColumn record, @Param("example") ModelColumnExample example);

    int updateByExample(@Param("record") ModelColumn record, @Param("example") ModelColumnExample example);

    int updateByPrimaryKeySelective(ModelColumn record);

    int updateByPrimaryKey(ModelColumn record);
}