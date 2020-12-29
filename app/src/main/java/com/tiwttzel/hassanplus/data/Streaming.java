package com.tiwttzel.hassanplus.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.tiwttzel.hassanplus.data.api.result.Stream;

import java.util.List;

public class Streaming implements Parcelable {
    private List<Stream> streams;
    private String thumbnail;
    public Streaming() {
    }

    public Streaming(List<Stream> streams ,String thumbnail) {
        this.streams = streams;
        this.thumbnail = thumbnail;
    }

    protected Streaming(Parcel in) {
        streams = in.createTypedArrayList(Stream.CREATOR);
        thumbnail = in.readString();
    }

    public static final Creator<Streaming> CREATOR = new Creator<Streaming>() {
        @Override
        public Streaming createFromParcel(Parcel in) {
            return new Streaming(in);
        }

        @Override
        public Streaming[] newArray(int size) {
            return new Streaming[size];
        }
    };

    public String getThumbnail() {
        return thumbnail;
    }

    public List<Stream> getStreams() {
        return streams;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(streams);
        dest.writeString(thumbnail);
    }
}
