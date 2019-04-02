package com.weitongming.weixin.controller;

import com.weitongming.weixin.dto.CheckSignatureDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tim.wei
 * @description
 * @date Created on 2019/4/2.
 */
@RestController("/token/")
public interface TokenController {

    @GetMapping("checkSignature/")
    String checkSignature(@RequestParam CheckSignatureDTO checkSignatureDTO);

}
