package com.weitongming.weixin.dto;

import lombok.Data;

/**
 * @author tim.wei
 * @description
 * @date Created on 2019/4/2.
 */
@Data
public class CheckSignatureDTO {
    String signature ;

    String timestamp ;

    String nonce ;

    String echostr ;
}
