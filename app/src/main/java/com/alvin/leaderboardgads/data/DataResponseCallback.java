package com.alvin.leaderboardgads.data;

public interface DataResponseCallback<T> {
    void onResponse(T response);
    void onError(Throwable error);
}