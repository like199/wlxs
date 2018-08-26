package com.like.trip.mapper;

import com.like.trip.model.Knowledgepoint;
import com.like.trip.model.KnowledgepointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KnowledgepointMapper {
    int countByExample(KnowledgepointExample example);

    int deleteByExample(KnowledgepointExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Knowledgepoint record);

    int insertSelective(Knowledgepoint record);

    List<Knowledgepoint> selectByExample(KnowledgepointExample example);

    Knowledgepoint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Knowledgepoint record, @Param("example") KnowledgepointExample example);

    int updateByExample(@Param("record") Knowledgepoint record, @Param("example") KnowledgepointExample example);

    int updateByPrimaryKeySelective(Knowledgepoint record);

    int updateByPrimaryKey(Knowledgepoint record);
}