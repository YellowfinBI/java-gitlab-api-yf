package org.gitlab.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitlabBranch {
    public final static String URL = "/repository/branches";

    @JsonProperty("name")
    private String name;

    @JsonProperty("commit")
    private GitlabBranchCommit commit;

    @JsonProperty("protected")
    private boolean branchProtected;
    
    
    @JsonProperty("merged")
    private boolean branchMerged;

    @JsonProperty("developers_can_push")
    private boolean developersCanPush;
    
    @JsonProperty("developers_can_merge")
    private boolean developersCanMerge;
    
    public String getName() {
        return name;
    }
    
    public boolean isMerged(){
    	return this.branchMerged;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GitlabBranchCommit getCommit() {
        return commit;
    }

    public void setCommit(GitlabBranchCommit commit) {
        this.commit = commit;
    }

    public boolean isProtected() {
        return branchProtected;
    }
    
    public boolean getDevelopersCanPush(){
    	return this.developersCanPush;
    }
    
    public boolean getDevelopersCanMerge(){
    	return this.developersCanMerge;
    }

    public void setProtected(boolean isProtected) {
        this.branchProtected = isProtected;
    }

    private String projectName;
	public void setProjectName(String name) {
		this.projectName = name;
	}
	
	public String getProjectName(){
		return this.projectName;
	}
}
