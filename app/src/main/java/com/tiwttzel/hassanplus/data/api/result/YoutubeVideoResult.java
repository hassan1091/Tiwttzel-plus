package com.tiwttzel.hassanplus.data.api.result;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YoutubeVideoResult implements Parcelable {

    private Boolean status;
    private String message;
    private String description;
    private String uploader;
    private String url;
    private String id;
    private Boolean isPlaylist;
    private String site;
    private String title;
    private Integer likeCount;
    private Object dislikeCount;
    private Integer viewCount;
    private Integer duration;
    private String uploadDate;
    private Object tags;
    private String uploaderUrl;
    private String thumbnail;
    private List<Stream> streams = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<YoutubeVideoResult> CREATOR = new Creator<YoutubeVideoResult>() {


        @SuppressWarnings({
                "unchecked"
        })
        public YoutubeVideoResult createFromParcel(Parcel in) {
            return new YoutubeVideoResult(in);
        }

        public YoutubeVideoResult[] newArray(int size) {
            return (new YoutubeVideoResult[size]);
        }

    };

    protected YoutubeVideoResult(Parcel in) {
        this.status = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.message = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.uploader = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.isPlaylist = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.site = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.likeCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.dislikeCount = ((Object) in.readValue((Object.class.getClassLoader())));
        this.viewCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.duration = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.uploadDate = ((String) in.readValue((String.class.getClassLoader())));
        this.tags = ((Object) in.readValue((Object.class.getClassLoader())));
        this.uploaderUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.thumbnail = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.streams, (Stream.class.getClassLoader()));
        this.additionalProperties = ((Map<String, Object>) in.readValue((Map.class.getClassLoader())));
    }

    public YoutubeVideoResult() {
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsPlaylist() {
        return isPlaylist;
    }

    public void setIsPlaylist(Boolean isPlaylist) {
        this.isPlaylist = isPlaylist;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Object getDislikeCount() {
        return dislikeCount;
    }

    public void setDislikeCount(Object dislikeCount) {
        this.dislikeCount = dislikeCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public String getUploaderUrl() {
        return uploaderUrl;
    }

    public void setUploaderUrl(String uploaderUrl) {
        this.uploaderUrl = uploaderUrl;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<Stream> getStreams() {
        return streams;
    }

    public void setStreams(List<Stream> streams) {
        this.streams = streams;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(message);
        dest.writeValue(description);
        dest.writeValue(uploader);
        dest.writeValue(url);
        dest.writeValue(id);
        dest.writeValue(isPlaylist);
        dest.writeValue(site);
        dest.writeValue(title);
        dest.writeValue(likeCount);
        dest.writeValue(dislikeCount);
        dest.writeValue(viewCount);
        dest.writeValue(duration);
        dest.writeValue(uploadDate);
        dest.writeValue(tags);
        dest.writeValue(uploaderUrl);
        dest.writeValue(thumbnail);
        dest.writeList(streams);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return 0;
    }

}
