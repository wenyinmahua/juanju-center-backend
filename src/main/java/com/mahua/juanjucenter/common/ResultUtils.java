package com.mahua.juanjucenter.common;

/**
 * 返回工具类
 *
 * @author mahua
 */
public class ResultUtils {


	public static <T> BaseResponse<T> success(T data) {
		return new BaseResponse<>( 0, data, "操作成功");
	}

	/**
	 * 成功
	 * @param msg
	 * @return
	 */
	public static  BaseResponse success(String msg) {
		return new BaseResponse( 0, null, msg);
	}


	public static <T> BaseResponse<T> error(ErrorCode errorCode) {
		return new BaseResponse<>(errorCode);
	}
	public static BaseResponse error(ErrorCode errorCode, String description) {
		return new BaseResponse(errorCode.getCode(),null, errorCode.getMsg(), description);
	}

	public static BaseResponse error(int code, String message,String description) {
		return new BaseResponse(code, null, message, description);
	}
	public static BaseResponse error(ErrorCode errorCode, String message, String description) {
		return new BaseResponse(errorCode.getCode(), null, message, description);
	}

}
