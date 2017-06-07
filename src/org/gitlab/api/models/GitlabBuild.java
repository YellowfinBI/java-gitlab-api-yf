package org.gitlab.api.models;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabBuild extends GitlabObject{

    public final static String URL = "/builds";

    private GitlabCommit commit;
    private Float coverage;

    @JsonProperty("download_url")
    private String downloadUrl;
    @JsonProperty("finished_at")
    private Date finishedAt;
    private Integer id;
    private String name;
    private String ref;
    private GitlabRunner runner;
    private String stage;
    @JsonProperty("started_at")
    private Date startedAt;
    private String status;
    private Boolean tag;
    private GitlabUser user;
    
    @JsonProperty("created_at")
    private Date createdAt;
    
    @JsonProperty("pipeline")
    private GitlabPipeline pipeline;

    public GitlabPipeline getPipeline(){
    	return this.pipeline;
    }

    public GitlabUser getUser() {
        return user;
    }

    public void setUser(GitlabUser user) {
        this.user = user;
    }

    public Boolean getTag() {
        return tag;
    }

    public void setTag(Boolean tag) {
        this.tag = tag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public GitlabRunner getRunner() {
        return runner;
    }

    public void setRunner(GitlabRunner runner) {
        this.runner = runner;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Float getCoverage() {
        return coverage;
    }

    public void setCoverage(Float coverage) {
        this.coverage = coverage;
    }

    public GitlabCommit getCommit() {
        return commit;
    }

    public void setCommit(GitlabCommit commit) {
        this.commit = commit;
    }
}
