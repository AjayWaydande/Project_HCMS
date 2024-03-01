package com.app.entities;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="training_schedules")
public class TrainingSchedules {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  scheduleID ;
	
	@ManyToOne
	@JoinColumn(name="module_id")
    private TrainingModules trainingModules ;
    
	@ManyToOne
    @JoinColumn(name="trainer_id")
    private Trainer trainer;
    
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate  endDate;
  
	@Column(length = 20)
	private String  location;
	
	@Column(length = 20)
    private int  maxParticipants ;

	public TrainingSchedules() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TrainingSchedules(int scheduleID, TrainingModules trainingModules, Trainer trainer, LocalDate startDate,
			LocalDate endDate, String location, int maxParticipants) {
		super();
		this.scheduleID = scheduleID;
		this.trainingModules = trainingModules;
		this.trainer = trainer;
		this.startDate = startDate;
		this.endDate = endDate;
		this.location = location;
		this.maxParticipants = maxParticipants;
	}

	public int getScheduleID() {
		return scheduleID;
	}

	public void setScheduleID(int scheduleID) {
		this.scheduleID = scheduleID;
	}

	public TrainingModules getTrainingModules() {
		return trainingModules;
	}

	public void setTrainingModules(TrainingModules trainingModules) {
		this.trainingModules = trainingModules;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMaxParticipants() {
		return maxParticipants;
	}

	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants = maxParticipants;
	}

	@Override
	public String toString() {
		return "TrainingSchedules [scheduleID=" + scheduleID + ", trainingModules=" + trainingModules + ", trainer="
				+ trainer + ", startDate=" + startDate + ", endDate=" + endDate + ", location=" + location
				+ ", maxParticipants=" + maxParticipants + "]";
	}
	
	
	
}
