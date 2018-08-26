package com.like.trip.mapper;

import com.like.trip.model.Analysisimage;
import com.like.trip.model.AnalysisimageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnalysisimageMapper {
    int countByExample(AnalysisimageExample example);

    int deleteByExample(AnalysisimageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Analysisimage record);

    int insertSelective(Analysisimage record);

    List<Analysisimage> selectByExample(AnalysisimageExample example);

    Analysisimage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Analysisimage record, @Param("example") AnalysisimageExample example);

    int updateByExample(@Param("record") Analysisimage record, @Param("example") AnalysisimageExample example);

    int updateByPrimaryKeySelective(Analysisimage record);

    int updateByPrimaryKey(Analysisimage record);
}