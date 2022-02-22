package com.worker;
@FunctionalInterface
public interface OnTaskErrorListener <T> {
    void onError(T t);

}
