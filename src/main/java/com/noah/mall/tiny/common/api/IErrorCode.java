package com.noah.mall.tiny.common.api;

/**
 * 封装API的错误码
 * Created by Noah on 2022/3/9.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
