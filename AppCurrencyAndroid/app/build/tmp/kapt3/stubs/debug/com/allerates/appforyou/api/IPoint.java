package com.allerates.appforyou.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\'\u00a8\u0006\n"}, d2 = {"Lcom/allerates/appforyou/api/IPoint;", "", "sendComment", "Lretrofit2/Call;", "Lcom/google/gson/JsonElement;", "comment", "", "rating", "", "id", "app_debug"})
public abstract interface IPoint {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "point_comment/v2/")
    public abstract retrofit2.Call<com.google.gson.JsonElement> sendComment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "user_comment")
    java.lang.String comment, @retrofit2.http.Query(value = "point_rating")
    int rating, @retrofit2.http.Query(value = "place_id")
    int id);
}