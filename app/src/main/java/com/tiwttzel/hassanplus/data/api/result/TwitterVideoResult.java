package com.tiwttzel.hassanplus.data.api.result;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class TwitterVideoResult implements Parcelable {


    private String id;

    private int statusCode;

    private List<Datum> data = new ArrayList<>();
    public final static Creator<TwitterVideoResult> CREATOR = new Creator<TwitterVideoResult>() {


        @SuppressWarnings({
                "unchecked"
        })
        public TwitterVideoResult createFromParcel(Parcel in) {
            return new TwitterVideoResult(in);
        }

        public TwitterVideoResult[] newArray(int size) {
            return (new TwitterVideoResult[size]);
        }

    };

    protected TwitterVideoResult(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.statusCode = ((int) in.readValue((int.class.getClassLoader())));
        in.readList(this.data, (Datum.class.getClassLoader()));
    }

    public TwitterVideoResult() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(statusCode);
        dest.writeList(data);
    }

    public int describeContents() {
        return 0;
    }

}