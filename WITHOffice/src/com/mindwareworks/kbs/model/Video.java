package com.mindwareworks.kbs.model;
// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * VideoFile generated by hbm2java
 */
@Entity
@Table(name="K_VIDEO"
    ,schema="KBSTRI"
)
public class Video  implements java.io.Serializable {

    // Fields    

     private Long id;
     private Encoding encoding;
     private String fileName;
     private String videoCodec;
     private String videoBitrate;
     private String videoHorizontalResolution;
     private String videoVerticalResolution;
     private String videoFrame;
     private String videoAspectRatio;
     private String autioCodec;
     private String audioBitrate;
     private String audioChannelCount;
     private String audioSamplingRate;
     private Set<RelatedVideo> relatedVideos;
     // Constructors

    /** default constructor */
    public Video() {
    }

    @Id
    @Column(name="video_id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name="encoding_id")
	public Encoding getEncoding() {
		return encoding;
	}

	
	public void setEncoding(Encoding encoding) {
		this.encoding = encoding;
	}

	@Column(name="file_name")
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name="video_codec")
	public String getVideoCodec() {
		return videoCodec;
	}

	public void setVideoCodec(String videoCodec) {
		this.videoCodec = videoCodec;
	}

	@Column(name="video_bitrate")
	public String getVideoBitrate() {
		return videoBitrate;
	}

	public void setVideoBitrate(String videoBitrate) {
		this.videoBitrate = videoBitrate;
	}

	@Column(name="video_horizontal_resolution")
	public String getVideoHorizontalResolution() {
		return videoHorizontalResolution;
	}

	public void setVideoHorizontalResolution(String videoHorizontalResolution) {
		this.videoHorizontalResolution = videoHorizontalResolution;
	}

	@Column(name="video_vertical_resolution")
	public String getVideoVerticalResolution() {
		return videoVerticalResolution;
	}

	public void setVideoVerticalResolution(String videoVerticalResolution) {
		this.videoVerticalResolution = videoVerticalResolution;
	}

	@Column(name="video_frame")
	public String getVideoFrame() {
		return videoFrame;
	}

	public void setVideoFrame(String videoFrame) {
		this.videoFrame = videoFrame;
	}

	@Column(name="video_aspect_ratio")
	public String getVideoAspectRatio() {
		return videoAspectRatio;
	}

	public void setVideoAspectRatio(String videoAspectRatio) {
		this.videoAspectRatio = videoAspectRatio;
	}

	@Column(name="autio_codec")
	public String getAutioCodec() {
		return autioCodec;
	}

	public void setAutioCodec(String autioCodec) {
		this.autioCodec = autioCodec;
	}

	@Column(name="audio_bitrate")
	public String getAudioBitrate() {
		return audioBitrate;
	}

	public void setAudioBitrate(String audioBitrate) {
		this.audioBitrate = audioBitrate;
	}

	@Column(name="audio_channel_count")
	public String getAudioChannelCount() {
		return audioChannelCount;
	}

	public void setAudioChannelCount(String audioChannelCount) {
		this.audioChannelCount = audioChannelCount;
	}

	@Column(name="audio_sampling_rate")
	public String getAudioSamplingRate() {
		return audioSamplingRate;
	}

	public void setAudioSamplingRate(String audioSamplingRate) {
		this.audioSamplingRate = audioSamplingRate;
	}

	
	@OneToMany(mappedBy="video")
    @org.hibernate.annotations.BatchSize(size=10)
	public Set<RelatedVideo> getRelatedVideos() {
		return relatedVideos;
	}

	public void setRelatedVideos(Set<RelatedVideo> relatedVideos) {
		this.relatedVideos = relatedVideos;
	}

}


