package com.weitongming.weixin.controller;

import com.weitongming.weixin.dto.CheckSignatureDTO;
import com.weitongming.weixin.util.CheckUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tim.wei
 * @description
 * @date Created on 2019/4/2.
 */
@RestController
public class TokenControllerImpl implements TokenController{

    @RequestMapping(value = "insert", method = RequestMethod.GET)
    public String checkSignature(    String signature ,     String timestamp ,   String nonce ,      String echostr ){
        if (CheckUtil.checkSignature(signature ,timestamp ,nonce)){
            return echostr;
        }
        return "FALSE";
    }

}
