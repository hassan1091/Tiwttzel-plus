package com.tiwttzel.hassanplus.data.api;

import com.tiwttzel.hassanplus.data.api.result.TwitterVideoResult;
import com.tiwttzel.hassanplus.data.api.result.YoutubeVideoResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiInterface {
    //  http://api.nahn.tech/video/?url=https://video.twimg.com/ext_tw_video/1185280178781642760/pu/vid/1280x720/TX5WCv-FxFRLoK4V.mp4
    @GET("/twitter/")
    Call<TwitterVideoResult> getTwitterVideoResult(@Query("url") String userUrl);

    @Headers({
            "x-rapidapi-host: getvideo.p.rapidapi.com",
            "x-rapidapi-key: 992d3a57e3msh0508e554d1b7ba8p16593djsn2271207113ac"
    })
    @GET("/")
    Call<YoutubeVideoResult>getYoutubeVideoResultCall(@Query("url") String url);
}
