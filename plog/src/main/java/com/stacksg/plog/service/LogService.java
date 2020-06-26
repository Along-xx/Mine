package com.stacksg.plog.service;

import com.stacksg.plog.model.domain.Log;
import com.github.pagehelper.PageInfo;

/**
 * @author : admin
 *
 */
public interface LogService {
	/**
	 * 保存日志
	 * 
	 * @param log
	 */
	void save(Log log);

	/**
	 * 分页查询日志
	 * 
	 * @param page
	 * @param limit
	 * @return
	 */
	PageInfo<Log> findLogs(int page, int limit);

	/**
	 * 删除所有日志
	 */
	void clear();
}
