package com.yukisoft.hlcmt.JavaRepositories.Models;

import java.util.Date;

public class AudioModel {
    private String id;
    private String path;
    private String title;
    private String details;
    private Date datePreached;
    private Date dateUploaded;
    private String speaker;

    public Date getDatePreached() {
        return datePreached;
    }
    public Date getDateUploaded() {
        return dateUploaded;
    }
    public String getSpeaker() { return speaker; }
    public String getPath() { return path; }
    public String getTitle() { return title; }
    public String getDetails() { return details; }
    public String getId() { return id; }

    public void setDatePreached(Date datePreached) {
        this.datePreached = datePreached;
    }
    public void setDateUploaded (Date dateUploaded ) {
        this.dateUploaded = dateUploaded;
    }
    public void setId(String id) { this.id = id; }
    public void setPath(String path) { this.path = path; }
    public void setTitle(String title) { this.title = title; }
    public void setDetails(String details) { this.details = details; }
    public void setSpeaker(String speaker) { this.speaker = speaker; }

    public AudioModel() {}

    public AudioModel(String path, String title, String details, Date datePreached, Date dateUploaded, String speaker) {
        this.id = id;
        this.path = path;
        this.title = title;
        this.details = details;
        this.datePreached = datePreached;
        this.dateUploaded = dateUploaded;
        this.speaker = speaker;
    }
}