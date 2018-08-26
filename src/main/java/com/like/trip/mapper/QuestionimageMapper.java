package com.like.trip.mapper;

import com.like.trip.model.Questionimage;
import com.like.trip.model.QuestionimageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionimageMapper {
    int countByExample(QuestionimageExample example);

    int deleteByExample(QuestionimageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Questionimage record);

    int insertSelective(Questionimage record);

    List<Questionimage> selectByExample(QuestionimageExample example);

    Questionimage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Questionimage record, @Param("example") QuestionimageExample example);

    int updateByExample(@Param("record") Questionimage record, @Param("example") QuestionimageExample example);

    int updateByPrimaryKeySelective(Questionimage record);

    int updateByPrimaryKey(Questionimage record);
}