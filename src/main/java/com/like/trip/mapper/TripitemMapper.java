package com.like.trip.mapper;

import com.like.trip.model.Tripitem;
import com.like.trip.model.TripitemExample;
import com.like.trip.model.Author;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TripitemMapper {
    int countByExample(TripitemExample example);

    int deleteByExample(TripitemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tripitem record);

    int insertSelective(Tripitem record);

    List<Tripitem> selectByExample(TripitemExample example);

    Tripitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tripitem record, @Param("example") TripitemExample example);

    int updateByExample(@Param("record") Tripitem record, @Param("example") TripitemExample example);

    int updateByPrimaryKeySelective(Tripitem record);

    int updateByPrimaryKey(Tripitem record);
    
}