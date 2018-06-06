package com.example.sell.VO;

import lombok.Data;

/*
http请求返回的最外层对象
 */
@Data
public class ResultVO<T> {
    //错误码
    private Integer code;
    //提示信息
    private String message;
    //返回的具体信息
    private T data;
}
