package com.stacksg.plog.mapper.generator;

import com.stacksg.plog.model.domain.ArticleTag;
import com.stacksg.plog.model.domain.ArticleTagExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ArticleTagMapper {
	long countByExample(ArticleTagExample example);

	int deleteByExample(ArticleTagExample example);

	int insert(ArticleTag record);

	int insertSelective(ArticleTag record);

	List<ArticleTag> selectByExample(ArticleTagExample example);

	int updateByExampleSelective(@Param("record") ArticleTag record, @Param("example") ArticleTagExample example);

	int updateByExample(@Param("record") ArticleTag record, @Param("example") ArticleTagExample example);
}