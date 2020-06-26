package com.stacksg.plog.mapper.custom;

import java.util.List;
import java.util.Map;

import com.stacksg.plog.model.domain.Options;
import org.apache.ibatis.annotations.Param;

/**
 * @author : admin
 *
 * 
 */
public interface OptionsMapperCustom {
	/**
	 * 保存
	 * 
	 * @param map
	 */
	void saveMap(@Param("map") Map<String, Object> map);

	/**
	 * 所有设置选项
	 * 
	 * @return map
	 */
	List<Options> selectMap();

}
