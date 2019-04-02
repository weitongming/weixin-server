package com.weitongming.weixin.controller;

import com.weitongming.weixin.dto.CheckSignatureDTO;
import com.weitongming.weixin.util.CheckUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tim.wei
 * @description
 * @date Created on 2019/4/2.
 */
@RestController("/token/")
public class TokenControllerImpl implements TokenController{

    @GetMapping("checkSignature/")
    public String checkSignature(@RequestParam CheckSignatureDTO checkSignatureDTO){
        if (CheckUtil.checkSignature(checkSignatureDTO.getSignature() ,checkSignatureDTO.getTimestamp() ,checkSignatureDTO.getNonce())){
            return checkSignatureDTO.getEchostr();
        }
        return "FALSE";
    };

}
