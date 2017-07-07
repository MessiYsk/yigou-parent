package com.yigou.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface SequenceMapper {

	Integer getSequence(String seqName);

	void updateSequence(Map<String, Object> paramMap);

	void addSequence(Map<String, Object> paramMap);
}
