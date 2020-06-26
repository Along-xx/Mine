package com.stacksg.plog.mapper.custom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author : admin
 *   下午4:16:50
 */
public interface TagMapperCustom {

	List<Integer> selectByarticleId(Integer id);

	void delete(@Param(value = "list") List<Integer> tagList, @Param(value = "articleId") Integer articleId);

}
