package com.worker;
@FunctionalInterface
public interface OnTaskDoneListener<T> {
    void onDone(T t);
}
