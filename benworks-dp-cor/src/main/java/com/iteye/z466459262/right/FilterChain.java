package com.iteye.z466459262.right;

import java.util.ArrayList;
import java.util.List;

/**
 * 再改进，插座升级，原来简单的数组插座，被封装成一个类，并让他更加智能化
 * @author Ben
 */
public class FilterChain implements Filter {
	
	List<Filter> filters = new ArrayList<Filter>();// 数组形式的责任链，他通过一个index来驱动请求向下执行

	public FilterChain add(Filter f) {
		filters.add(f);
		return this;  // 返回this的好处是：可以链式编程
	}

	public String doFilter(String msg) {
		for (Filter f : filters) {
			f.doFilter(msg);
		}
		return msg;
	}
}
