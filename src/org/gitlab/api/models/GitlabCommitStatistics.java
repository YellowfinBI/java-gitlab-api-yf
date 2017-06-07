package org.gitlab.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabCommitStatistics {
    @JsonProperty("additions")
    private int additions;

    @JsonProperty("deletions")
    private int deletions;
    
    @JsonProperty("total")
    private int total;
    
    
    public int getAdditions(){
    	return this.additions;
    }
    
    public int getDeletions(){
    	return this.deletions;
    }
    
    public int getTotalChanges(){
    	return this.total;
    }

    
}
