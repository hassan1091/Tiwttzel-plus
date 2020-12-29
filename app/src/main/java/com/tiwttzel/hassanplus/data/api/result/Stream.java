
package com.tiwttzel.hassanplus.data.api.result;

import java.util.HashMap;
import java.util.Map;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Stream implements Parcelable
{

    private String url;
    private String format;
    private String formatNote;
    private String extension;
    private String videoCodec;
    private String audioCodec;
    private int height;
    private int width;
    private int fps;
    private String fmtId;
    private int filesize;
    private String filesizePretty;
    private boolean hasAudio;
    private boolean hasVideo;
    private boolean isHd;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    public final static Creator<Stream> CREATOR = new Creator<Stream>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Stream createFromParcel(Parcel in) {
            return new Stream(in);
        }

        public Stream[] newArray(int size) {
            return (new Stream[size]);
        }

    }
    ;

    protected Stream(Parcel in) {
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.format = ((String) in.readValue((String.class.getClassLoader())));
        this.formatNote = ((String) in.readValue((String.class.getClassLoader())));
        this.extension = ((String) in.readValue((String.class.getClassLoader())));
        this.videoCodec = ((String) in.readValue((String.class.getClassLoader())));
        this.audioCodec = ((String) in.readValue((String.class.getClassLoader())));
        this.height = ((int) in.readValue((int.class.getClassLoader())));
        this.width = ((int) in.readValue((int.class.getClassLoader())));
        this.fps = ((int) in.readValue((int.class.getClassLoader())));
        this.fmtId = ((String) in.readValue((String.class.getClassLoader())));
        this.filesize = ((int) in.readValue((int.class.getClassLoader())));
        this.filesizePretty = ((String) in.readValue((String.class.getClassLoader())));
        this.hasAudio = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.hasVideo = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.isHd = ((boolean) in.readValue((boolean.class.getClassLoader())));
        this.additionalProperties = ((Map<String, Object> ) in.readValue((Map.class.getClassLoader())));
    }

    public Stream() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormatNote() {
        return formatNote;
    }

    public void setFormatNote(String formatNote) {
        this.formatNote = formatNote;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    public String getAudioCodec() {
        return audioCodec;
    }

    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getFps() {
        return fps;
    }

    public void setFps(int fps) {
        this.fps = fps;
    }

    public String getFmtId() {
        return fmtId;
    }

    public void setFmtId(String fmtId) {
        this.fmtId = fmtId;
    }

    public int getFilesize() {
        return filesize;
    }

    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }

    public String getFilesizePretty() {
        return filesizePretty;
    }

    public void setFilesizePretty(String filesizePretty) {
        this.filesizePretty = filesizePretty;
    }

    public boolean getHasAudio() {
        return hasAudio;
    }

    public void setHasAudio(boolean hasAudio) {
        this.hasAudio = hasAudio;
    }

    public boolean getHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

    public boolean getIsHd() {
        return isHd;
    }

    public void setIsHd(boolean isHd) {
        this.isHd = isHd;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(url);
        dest.writeValue(format);
        dest.writeValue(formatNote);
        dest.writeValue(extension);
        dest.writeValue(videoCodec);
        dest.writeValue(audioCodec);
        dest.writeValue(height);
        dest.writeValue(width);
        dest.writeValue(fps);
        dest.writeValue(fmtId);
        dest.writeValue(filesize);
        dest.writeValue(filesizePretty);
        dest.writeValue(hasAudio);
        dest.writeValue(hasVideo);
        dest.writeValue(isHd);
        dest.writeValue(additionalProperties);
    }

    public int describeContents() {
        return  0;
    }

}
