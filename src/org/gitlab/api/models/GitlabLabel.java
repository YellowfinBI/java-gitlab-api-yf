package org.gitlab.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Models a Gitlab label.
 */
public class GitlabLabel {

    public static final String URL = "/labels";

    @JsonProperty("id")
    private Integer id;
    
    private String name;
    private String color;

    /**
     * Gets the name (text) of a label.
     * @return
     */
    public String getName() {
        return name;
    }
    
    public Integer getId(){
    	return this.id;
    }

    /**
     * Sets the name (text) of a label.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the color of a label as six digit HTML hex value.
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of a label.
     * @param color A six digit HTML hex value including number sign (eg #ff0000)
     */
    public void setColor(String color) {
        this.color = color;
    }

    private String projectName;
	public void setProjectName(String proname) {
		this.projectName = proname;
	}

	public String getProjectName() {
		// TODO Auto-generated method stub
		return this.projectName;
	}

	@JsonProperty("description")
	String description;
	
	public String getDescritption() {
		return this.description;
	}
	
	
	@JsonProperty("open_issues_count")
	private Integer openIssuesCount;
	
	public Integer getOpenIssuesCount(){
		return this.openIssuesCount;
	}
	
	@JsonProperty("closed_issues_count")
	private Integer closedIssuesCount;
	
	public Integer getClosedIssuesCount(){
		return this.closedIssuesCount;
	}
	
	@JsonProperty("open_merge_requests_count")
	private Integer openMergeRequestsCount;
	
	public Integer getOpenMergeRequestsCount(){
		return this.openMergeRequestsCount;
	}
	
	@JsonProperty("priority")
	private Integer priority;
	
	public Integer getPriority(){
		return this.priority;
	}
	
	
	@JsonProperty("subscribed")
	private Boolean subscribed;
	
	public Boolean isSubscribed(){
		return this.subscribed;
	}
	
	
	

}
