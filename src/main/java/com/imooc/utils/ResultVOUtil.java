package com.imooc.utils;

import java.io.Serializable;

/**
 * Boot返回值工具类
 */
public class ResultVOUtil<T> implements Serializable {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMessage("success");
        resultVO.setData(object);

        return resultVO;
    }
    public static ResultVO success() {
        ResultVO resultVO = new ResultVO();
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMessage(msg);
        return resultVO;
    }
}
