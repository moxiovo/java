package com.fengtaisec.d3_exception;

// 必须继承RuntimeException 才能成为一个运行时异常类
public class AgeillegalRuntimeException extends RuntimeException{
    public AgeillegalRuntimeException() {
    }

    // 封装问题的原因
    public AgeillegalRuntimeException(String message) {
        super(message);
    }
}
