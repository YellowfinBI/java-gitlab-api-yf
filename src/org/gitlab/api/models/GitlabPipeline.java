package org.gitlab.api.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabPipeline extends GitlabObject{
	
    public static final String URL = "/pipelines";

	
	
	@JsonProperty("id")
	Integer id;
	
	public Integer getId(){
		return this.id;
	}
	@JsonProperty("sha")
	String sha;
	
	public String getSha(){
		return this.sha;
	}

	@JsonProperty("ref")
	String ref;
	
	public String getRef(){
		return this.ref;
	}
	
	@JsonProperty("status")
	String status;
	
	public String getStatus(){
		return this.status;
	}
	
	@JsonProperty("tag")
	Boolean tag;
	
	public Boolean getTag(){
		return this.tag;
	}
	
    @JsonProperty("created_at")
    private Date createdAt;
    
    public Date getCreatedAt(){
    	return this.createdAt;
    }

    @JsonProperty("started_at")
    private Date startedAt;
    
    public Date getStartedAt(){
    	return this.startedAt;
    }
    @JsonProperty("updated_at")
    private Date updatedAt;
    
    public Date getUpdatedAt(){
    	return this.updatedAt;
    }
    
    
    @JsonProperty("finished_at")
    private Date finishedAt;
    
    public Date getFinishedAt(){
    	return this.finishedAt;
    }
    
    @JsonProperty("commited_at")
    private Date commitedAt;
    
    public Date getCommitedAt(){
    	return this.commitedAt;
    }

    @JsonProperty("duration")
    private Integer duration;
    
    public Integer getDuration(){
    	return this.duration;
    }
    
    @JsonProperty("user")
    private GitlabUser user;
    
    public GitlabUser getUser(){
    	return this.user;
    }



}
