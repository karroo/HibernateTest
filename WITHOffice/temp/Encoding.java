// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Encoding generated by hbm2java
 */
@Entity
@Table(name="K_ENCODING"
    ,schema="KBSTRI"
)
public class Encoding  implements java.io.Serializable {

    // Fields    

     private Integer encodingId;
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
     private Set<AppEncoding> appEncodings = new HashSet<AppEncoding>(0);
     private Set<VideoFile> videoFiles = new HashSet<VideoFile>(0);

     // Constructors

    /** default constructor */
    public Encoding() {
    }

	/** minimal constructor */
    public Encoding(Integer encodingId) {
        this.encodingId = encodingId;
    }
    /** full constructor */
    public Encoding(Integer encodingId, String videoCodec, String videoBitrate, String videoHorizontalResolution, String videoVerticalResolution, String videoFrame, String videoAspectRatio, String autioCodec, String audioBitrate, String audioChannelCount, String audioSamplingRate, Set<AppEncoding> appEncodings, Set<VideoFile> videoFiles) {
       this.encodingId = encodingId;
       this.videoCodec = videoCodec;
       this.videoBitrate = videoBitrate;
       this.videoHorizontalResolution = videoHorizontalResolution;
       this.videoVerticalResolution = videoVerticalResolution;
       this.videoFrame = videoFrame;
       this.videoAspectRatio = videoAspectRatio;
       this.autioCodec = autioCodec;
       this.audioBitrate = audioBitrate;
       this.audioChannelCount = audioChannelCount;
       this.audioSamplingRate = audioSamplingRate;
       this.appEncodings = appEncodings;
       this.videoFiles = videoFiles;
    }
   
    // Property accessors
     @Id
    
    @Column(name="ENCODING_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getEncodingId() {
        return this.encodingId;
    }
    
    public void setEncodingId(Integer encodingId) {
        this.encodingId = encodingId;
    }
    
    @Column(name="VIDEO_CODEC", unique=false, nullable=true, insertable=true, updatable=true, length=32)
    public String getVideoCodec() {
        return this.videoCodec;
    }
    
    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }
    
    @Column(name="VIDEO_BITRATE", unique=false, nullable=true, insertable=true, updatable=true, length=16)
    public String getVideoBitrate() {
        return this.videoBitrate;
    }
    
    public void setVideoBitrate(String videoBitrate) {
        this.videoBitrate = videoBitrate;
    }
    
    @Column(name="VIDEO_HORIZONTAL_RESOLUTION", unique=false, nullable=true, insertable=true, updatable=true, length=16)
    public String getVideoHorizontalResolution() {
        return this.videoHorizontalResolution;
    }
    
    public void setVideoHorizontalResolution(String videoHorizontalResolution) {
        this.videoHorizontalResolution = videoHorizontalResolution;
    }
    
    @Column(name="VIDEO_VERTICAL_RESOLUTION", unique=false, nullable=true, insertable=true, updatable=true, length=16)
    public String getVideoVerticalResolution() {
        return this.videoVerticalResolution;
    }
    
    public void setVideoVerticalResolution(String videoVerticalResolution) {
        this.videoVerticalResolution = videoVerticalResolution;
    }
    
    @Column(name="VIDEO_FRAME", unique=false, nullable=true, insertable=true, updatable=true, length=16)
    public String getVideoFrame() {
        return this.videoFrame;
    }
    
    public void setVideoFrame(String videoFrame) {
        this.videoFrame = videoFrame;
    }
    
    @Column(name="VIDEO_ASPECT_RATIO", unique=false, nullable=true, insertable=true, updatable=true, length=16)
    public String getVideoAspectRatio() {
        return this.videoAspectRatio;
    }
    
    public void setVideoAspectRatio(String videoAspectRatio) {
        this.videoAspectRatio = videoAspectRatio;
    }
    
    @Column(name="AUTIO_CODEC", unique=false, nullable=true, insertable=true, updatable=true, length=32)
    public String getAutioCodec() {
        return this.autioCodec;
    }
    
    public void setAutioCodec(String autioCodec) {
        this.autioCodec = autioCodec;
    }
    
    @Column(name="AUDIO_BITRATE", unique=false, nullable=true, insertable=true, updatable=true, length=16)
    public String getAudioBitrate() {
        return this.audioBitrate;
    }
    
    public void setAudioBitrate(String audioBitrate) {
        this.audioBitrate = audioBitrate;
    }
    
    @Column(name="AUDIO_CHANNEL_COUNT", unique=false, nullable=true, insertable=true, updatable=true, length=16)
    public String getAudioChannelCount() {
        return this.audioChannelCount;
    }
    
    public void setAudioChannelCount(String audioChannelCount) {
        this.audioChannelCount = audioChannelCount;
    }
    
    @Column(name="AUDIO_SAMPLING_RATE", unique=false, nullable=true, insertable=true, updatable=true, length=16)
    public String getAudioSamplingRate() {
        return this.audioSamplingRate;
    }
    
    public void setAudioSamplingRate(String audioSamplingRate) {
        this.audioSamplingRate = audioSamplingRate;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="encoding")
    public Set<AppEncoding> getAppEncodings() {
        return this.appEncodings;
    }
    
    public void setAppEncodings(Set<AppEncoding> appEncodings) {
        this.appEncodings = appEncodings;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="encoding")
    public Set<VideoFile> getVideoFiles() {
        return this.videoFiles;
    }
    
    public void setVideoFiles(Set<VideoFile> videoFiles) {
        this.videoFiles = videoFiles;
    }




}


