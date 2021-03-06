// default package
// Generated 2012. 3. 5 오후 1:52:33 by Hibernate Tools 3.2.0.beta8


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ChannelItem generated by hbm2java
 */
@Entity
@Table(name="K_CHANNEL_ITEM"
    ,schema="KBSTRI"
)
public class ChannelItem  implements java.io.Serializable {

    // Fields    

     private ChannelItemId id;
     private Content content;
     private CustomChannel customChannel;
     private String alarmYn;
     private String programPlannedDate;
     private String startTime;
     private String endTime;
     private Integer priority;
     private String liveYn;
     private Integer durationMinute;

     // Constructors

    /** default constructor */
    public ChannelItem() {
    }

	/** minimal constructor */
    public ChannelItem(ChannelItemId id, Content content, CustomChannel customChannel) {
        this.id = id;
        this.content = content;
        this.customChannel = customChannel;
    }
    /** full constructor */
    public ChannelItem(ChannelItemId id, Content content, CustomChannel customChannel, String alarmYn, String programPlannedDate, String startTime, String endTime, Integer priority, String liveYn, Integer durationMinute) {
       this.id = id;
       this.content = content;
       this.customChannel = customChannel;
       this.alarmYn = alarmYn;
       this.programPlannedDate = programPlannedDate;
       this.startTime = startTime;
       this.endTime = endTime;
       this.priority = priority;
       this.liveYn = liveYn;
       this.durationMinute = durationMinute;
    }
   
    // Property accessors
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="channelId", column=@Column(name="CHANNEL_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0) ), 
        @AttributeOverride(name="contentId", column=@Column(name="CONTENT_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0) ) } )
    public ChannelItemId getId() {
        return this.id;
    }
    
    public void setId(ChannelItemId id) {
        this.id = id;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumn(name="CONTENT_ID", unique=false, nullable=false, insertable=false, updatable=false)
    public Content getContent() {
        return this.content;
    }
    
    public void setContent(Content content) {
        this.content = content;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumn(name="CHANNEL_ID", unique=false, nullable=false, insertable=false, updatable=false)
    public CustomChannel getCustomChannel() {
        return this.customChannel;
    }
    
    public void setCustomChannel(CustomChannel customChannel) {
        this.customChannel = customChannel;
    }
    
    @Column(name="ALARM_YN", unique=false, nullable=true, insertable=true, updatable=true, length=1)
    public String getAlarmYn() {
        return this.alarmYn;
    }
    
    public void setAlarmYn(String alarmYn) {
        this.alarmYn = alarmYn;
    }
    
    @Column(name="PROGRAM_PLANNED_DATE", unique=false, nullable=true, insertable=true, updatable=true, length=8)
    public String getProgramPlannedDate() {
        return this.programPlannedDate;
    }
    
    public void setProgramPlannedDate(String programPlannedDate) {
        this.programPlannedDate = programPlannedDate;
    }
    
    @Column(name="START_TIME", unique=false, nullable=true, insertable=true, updatable=true, length=6)
    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    
    @Column(name="END_TIME", unique=false, nullable=true, insertable=true, updatable=true, length=6)
    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    
    @Column(name="PRIORITY", unique=false, nullable=true, insertable=true, updatable=true, precision=0)
    public Integer getPriority() {
        return this.priority;
    }
    
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    
    @Column(name="LIVE_YN", unique=false, nullable=true, insertable=true, updatable=true, length=1)
    public String getLiveYn() {
        return this.liveYn;
    }
    
    public void setLiveYn(String liveYn) {
        this.liveYn = liveYn;
    }
    
    @Column(name="DURATION_MINUTE", unique=false, nullable=true, insertable=true, updatable=true, precision=0)
    public Integer getDurationMinute() {
        return this.durationMinute;
    }
    
    public void setDurationMinute(Integer durationMinute) {
        this.durationMinute = durationMinute;
    }




}


