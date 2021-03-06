package org.gitlab.api.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabCommit {

    public final static String URL = "/commits";

    private String id;
    private String title;
    private String message;

    @JsonProperty("short_id")
    private String shortId;

    @JsonProperty("author_name")
    private String authorName;

    @JsonProperty("author_email")
    private String authorEmail;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("committed_date")
    private Date committedDate;

    @JsonProperty("authored_date")
    private Date authoredDate;

    @JsonProperty("parent_ids")
    private List<String> parentIds;
    
    
    @JsonProperty("committer_name")
    private String commiterName;
    
    @JsonProperty("committer_email")
    private String commiterEmail;
    
    @JsonProperty("stats")
    private GitlabCommitStatistics stats; 
    
    @JsonProperty("status")
    private String status;
    
    public String getStatus(){
    	return this.status;
    } 
    
    public GitlabCommitStatistics getCommitStat(){
    	return this.stats;
    }
    
    public String getCommiterEmail(){
    	return this.commiterEmail;
    }
    
    public String getCommiterName(){
    	return this.commiterName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortId() {
        return shortId;
    }

    public void setShortId(String shortId) {
        this.shortId = shortId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<String> getParentIds() {
        return parentIds;
    }

    public void setParentIds(List<String> parentIds) {
        this.parentIds = parentIds;
    }

    public Date getCommittedDate() {
        return committedDate;
    }

    public void setCommittedDate(Date committedDate) {
        this.committedDate = committedDate;
    }

    public Date getAuthoredDate() {
        return authoredDate;
    }

    public void setAuthoredDate(Date authoredDate) {
        this.authoredDate = authoredDate;
    }

    @Override
    public boolean equals(Object obj) {
        // we say that two commit objects are equal iff they have the same ID
        // this prevents us from having to do clever workarounds for
        // https://gitlab.com/gitlab-org/gitlab-ce/issues/759
        try {
            GitlabCommit commitObj = (GitlabCommit) obj;
            return (this.getId().compareTo(commitObj.getId()) == 0);
        } catch (ClassCastException e) {
            return false;
        }
    }

    /* modified by yellowfin for the sake of stistics report*/
    private List<String> branchName  = new ArrayList<String>();
    private String projectName ;

	public void addBranch(String branName) {
		this.branchName.add(branName);
	}
	

	
	public List<String> getBranchName(){
		return this.branchName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		
	}
	
	public String getProjectName(){
		return this.projectName;
	}

}
