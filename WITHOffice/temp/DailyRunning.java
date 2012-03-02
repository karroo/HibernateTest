// default package
// Generated 2012. 3. 2 오후 8:12:59 by Hibernate Tools 3.2.0.beta8


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DailyRunning generated by hbm2java
 */
@Entity
@Table(name="K_DAILY_RUNNING"
    ,schema="KBSTRI"
)
public class DailyRunning  implements java.io.Serializable {

    // Fields    

     private Integer scheduleUniqueId;
     private Program program;
     private Channel channel;
     private String runningDate;
     private String startTime;
     private String endTime;
     private String programTitle;
     private Integer runningDurationMin;

     // Constructors

    /** default constructor */
    public DailyRunning() {
    }

	/** minimal constructor */
    public DailyRunning(Integer scheduleUniqueId) {
        this.scheduleUniqueId = scheduleUniqueId;
    }
    /** full constructor */
    public DailyRunning(Integer scheduleUniqueId, Program program, Channel channel, String runningDate, String startTime, String endTime, String programTitle, Integer runningDurationMin) {
       this.scheduleUniqueId = scheduleUniqueId;
       this.program = program;
       this.channel = channel;
       this.runningDate = runningDate;
       this.startTime = startTime;
       this.endTime = endTime;
       this.programTitle = programTitle;
       this.runningDurationMin = runningDurationMin;
    }
   
    // Property accessors
     @Id
    
    @Column(name="SCHEDULE_UNIQUE_ID", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getScheduleUniqueId() {
        return this.scheduleUniqueId;
    }
    
    public void setScheduleUniqueId(Integer scheduleUniqueId) {
        this.scheduleUniqueId = scheduleUniqueId;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumn(name="CONTENT_ID", unique=false, nullable=true, insertable=true, updatable=true)
    public Program getProgram() {
        return this.program;
    }
    
    public void setProgram(Program program) {
        this.program = program;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumn(name="CHANNEL_CODE", unique=false, nullable=true, insertable=true, updatable=true)
    public Channel getChannel() {
        return this.channel;
    }
    
    public void setChannel(Channel channel) {
        this.channel = channel;
    }
    
    @Column(name="RUNNING_DATE", unique=false, nullable=true, insertable=true, updatable=true, length=8)
    public String getRunningDate() {
        return this.runningDate;
    }
    
    public void setRunningDate(String runningDate) {
        this.runningDate = runningDate;
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
    
    @Column(name="PROGRAM_TITLE", unique=false, nullable=true, insertable=true, updatable=true, length=100)
    public String getProgramTitle() {
        return this.programTitle;
    }
    
    public void setProgramTitle(String programTitle) {
        this.programTitle = programTitle;
    }
    
    @Column(name="RUNNING_DURATION_MIN", unique=false, nullable=true, insertable=true, updatable=true, precision=0)
    public Integer getRunningDurationMin() {
        return this.runningDurationMin;
    }
    
    public void setRunningDurationMin(Integer runningDurationMin) {
        this.runningDurationMin = runningDurationMin;
    }




}

