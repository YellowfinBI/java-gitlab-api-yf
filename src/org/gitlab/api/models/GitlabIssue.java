package org.gitlab.api.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabIssue extends GitlabObject{

    public enum Action {
        LEAVE, CLOSE, REOPEN
    }

    public static final String STATE_CLOSED = "closed";
    public static final String STATE_OPENED = "opened";

    public static final String URL = "/issues";

    private int id;
    private int iid;

    @JsonProperty("project_id")
    private int projectId;

    private String title;
    private String description;
    private String[] labels;
    private GitlabMilestone milestone;

    private GitlabUser assignee;
    private GitlabUser author;

    private String state;

    @JsonProperty("updated_at")
    private Date updatedAt;

    @JsonProperty("created_at")
    private Date createdAt;
    
    @JsonProperty("weight")
    private Integer weight;
    
    public Integer getWeight(){
    	return this.weight;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getLabels() {
        return labels;
    }

    public void setLabels(String[] labels) {
        this.labels = labels;
    }

    public GitlabMilestone getMilestone() {
        return milestone;
    }

    public void setMilestone(GitlabMilestone milestone) {
        this.milestone = milestone;
    }

    public GitlabUser getAssignee() {
        return assignee;
    }

    public void setAssignee(GitlabUser assignee) {
        this.assignee = assignee;
    }

    public GitlabUser getAuthor() {
        return author;
    }

    public void setAuthor(GitlabUser author) {
        this.author = author;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("upvotes")
    private Integer upvotes;

	public int getUpvotes() {
		return this.upvotes;
	}
	
    @JsonProperty("downvotes")
    private Integer downvotes;

	public int getDownvotes() {
		return this.downvotes;
	}
	
    @JsonProperty("confidential")
    private Boolean confidential;

	public Boolean isConfidential() {
		return this.confidential;
	}

    @JsonProperty("subscribed")
    private Boolean subscribed;

	public Boolean isSubscribed() {
		return this.subscribed;
	}

    @JsonProperty("web_url")
    private String webUrl;

	public String getWebUrl() {
		return this.webUrl;
	}

    @JsonProperty("user_notes_count")
	private Integer userNotesCount;
	public Integer getUserNotesCount() {
		return this.userNotesCount;
	}
}
