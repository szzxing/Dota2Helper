package com.fangxu.dota2helper.network;

import com.fangxu.dota2helper.bean.NewsList;

import java.util.List;


import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Xuf on 2016/4/6.
 */
public interface NewsApi {
    @GET("/api/v1.0/news/refresh")
    Observable<NewsList> refreshNews();
    @GET("/api/v1.0/news/loadmore/{list_id}")
    Observable<NewsList> loadMoreNews(@Path(("list_id")) int list_id);
}