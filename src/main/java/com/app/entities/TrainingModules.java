package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="training_modules")
public class TrainingModules {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int moduleId;

	@Column(length = 20)
	private String moduleName;
	
	@Column(length = 100)
	private String description;
	
	@Column(length = 20)
	private int duration;

	public TrainingModules() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TrainingModules(int moduleId, String moduleName, String description, int duration) {
		super();
		this.moduleId = moduleId;
		this.moduleName = moduleName;
		this.description = description;
		this.duration = duration;
	}

	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "TrainingModules [moduleId=" + moduleId + ", moduleName=" + moduleName + ", description=" + description
				+ ", duration=" + duration + "]";
	}
	
	
	
	
	
}
