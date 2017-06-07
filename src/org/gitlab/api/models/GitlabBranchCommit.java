package org.gitlab.api.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabBranchCommit {
    public static String URL = "/users";

    private String id;
    private String tree;
    private String message;

//    private GitlabUser author;
 //   private GitlabUser committer;

    @JsonProperty("author_email")
    private String authorEmail;
    
    @JsonProperty("author_name")
    private String authorName;

    
    @JsonProperty("committer_email")
    private String committerEmail;
    
    @JsonProperty("committer_name")
    private String committerName;
    
    @JsonProperty("authored_date")
    private Date authoredDate;

    @JsonProperty("committed_date")
    private Date committedDate;

    @JsonProperty("short_id")
    private String shortId;
    
    public String getShortId(){
    	return this.shortId;
    }

    
    public String getAuthorName(){
    	return this.authorName;
    }
    
    public String getAuthorEmail(){
    	return this.authorEmail;
    }
    
    public String getCommitterName(){
    	return this.committerName;
    }
    
    public String getCommitterEmail(){
    	return this.committerEmail;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
/*
    public GitlabUser getAuthor() {
        return author;
    }

    public void setAuthor(GitlabUser author) {
        this.author = author;
    }

    public GitlabUser getCommitter() {
        return committer;
    }

    public void setCommitter(GitlabUser committer) {
        this.committer = committer;
    }
    */

    public Date getAuthoredDate() {
        return this.authoredDate;
    }

    public void setAuthoredDate(Date authoredDate) {
        this.authoredDate = authoredDate;
    }

    public Date getCommittedDate() {
        return committedDate;
    }

    public void setCommittedDate(Date committedDate) {
        this.committedDate = committedDate;
    }
}
