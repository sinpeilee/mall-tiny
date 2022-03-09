package com.noah.mall.tiny.service;

import com.noah.mall.tiny.common.api.CommonResult;

/**
 * 会员管理Service
 * Created by noah on 2022/3/9.
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}

