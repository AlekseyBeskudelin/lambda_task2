package com.worker;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener erorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.erorCallback = errorCallback;
    }
    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {erorCallback.onError("Task " + i + " on error");
            }else {callback.onDone("Task " + i + " is done");
            }
        }

    }

}
