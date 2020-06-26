package com.stacksg.plog.model.enums;

/**
 * @author admin
 *  创建时间：2019年1月2日 下午8:55:08
 * 
 */
public enum PageNumber {
	POST_INDEX_lIMIT(6);

	// 分页条数
	int limit;

	private PageNumber(int limit) {
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

}
