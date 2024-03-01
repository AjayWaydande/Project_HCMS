package com.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="training_feedbacks")
public class TrainingFeedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedbackId;

	@ManyToOne
	@JoinColumn(name = "schedule_id")
	private TrainingSchedules trainingSchedule;

	@ManyToOne
	@JoinColumn(name = "participant_id")
	private Employee participant;

	@Column(length = 30)
	private String feedbackComments;

	@Column(length = 20)
	private int satisfactionRating;
	
	public TrainingFeedback() {
		// TODO Auto-generated constructor stub
	}

	public TrainingFeedback(int feedbackId, TrainingSchedules trainingSchedule, Employee participant,
			String feedbackComments, int satisfactionRating) {
		super();
		this.feedbackId = feedbackId;
		this.trainingSchedule = trainingSchedule;
		this.participant = participant;
		this.feedbackComments = feedbackComments;
		this.satisfactionRating = satisfactionRating;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public TrainingSchedules getTrainingSchedule() {
		return trainingSchedule;
	}

	public void setTrainingSchedule(TrainingSchedules trainingSchedule) {
		this.trainingSchedule = trainingSchedule;
	}

	public Employee getParticipant() {
		return participant;
	}

	public void setParticipant(Employee participant) {
		this.participant = participant;
	}

	public String getFeedbackComments() {
		return feedbackComments;
	}

	public void setFeedbackComments(String feedbackComments) {
		this.feedbackComments = feedbackComments;
	}

	public int getSatisfactionRating() {
		return satisfactionRating;
	}

	public void setSatisfactionRating(int satisfactionRating) {
		this.satisfactionRating = satisfactionRating;
	}

	@Override
	public String toString() {
		return "TrainingFeedback [feedbackId=" + feedbackId + ", trainingSchedule=" + trainingSchedule
				+ ", participant=" + participant + ", feedbackComments=" + feedbackComments + ", satisfactionRating="
				+ satisfactionRating + "]";
	}
	
	
	
}
