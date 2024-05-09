package com.fengtaisec.d3_exception;

// 必须继承RuntimeException 才能成为一个编译时异常类
public class AgeillegalException extends Exception{
    public AgeillegalException() {
    }

    // 封装问题的原因
    public AgeillegalException(String message) {
        super(message);
    }
}
