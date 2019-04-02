package com.weitongming.weixin.controller;

import com.weitongming.weixin.dto.CheckSignatureDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tim.wei
 * @description
 * @date Created on 2019/4/2.
 */
public interface TokenController {

     String checkSignature(    String signature ,     String timestamp ,   String nonce ,      String echostr );

}
