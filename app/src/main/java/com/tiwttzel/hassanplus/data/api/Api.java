package com.tiwttzel.hassanplus.data.api;

import com.tiwttzel.hassanplus.data.api.result.TwitterVideoResult;
import com.tiwttzel.hassanplus.data.api.result.YoutubeVideoResult;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {
    private static final String BASE_TWITTER_URL = "http://api.nahn.tech";
    private static final String BASE_YOUTUBE_URL = "https://getvideo.p.rapidapi.com/";

    private ApiInterface retrofitBuild(String baseUrl) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiInterface.class);
    }

    public Call<TwitterVideoResult> getTwitterVideoResult(String url) {
        return retrofitBuild(BASE_TWITTER_URL).getTwitterVideoResult(url);
    }
    public Call<YoutubeVideoResult> getYoutubeVideoResult(String url) {
        return retrofitBuild(BASE_YOUTUBE_URL).getYoutubeVideoResultCall(url);
    }
}
