package com.hc.scm.common.exception;
import org.springframework.dao.DataAccessException;

/**
 * 
 * Description: 自定义验证层异常信息
 * All rights Reserved, Designed Byhc* Copyright:   Copyright(C) 2014-2015
 * Company:     Wonhigh.
 * author:      wugy
 * Createdate:  2015-3-3下午2:23:15
 */
public class ValidException extends DataAccessException{

	    private static final long serialVersionUID = 1L;

	    public ValidException(String msg) {
	        super(msg);
	    }

	    public ValidException(String msg, Throwable cause) {
	        super(msg, cause);
	    }
	}