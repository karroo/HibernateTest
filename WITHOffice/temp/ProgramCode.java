// default package
// Generated 2012. 3. 5 오후 1:52:33 by Hibernate Tools 3.2.0.beta8


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ProgramCode generated by hbm2java
 */
@Entity
@Table(name="K_PROGRAM_CODE"
    ,schema="KBSTRI"
)
public class ProgramCode  implements java.io.Serializable {

    // Fields    

     private String programCode;
     private Object object;
     private Set<Program> programs = new HashSet<Program>(0);
     private Set<SegmentCode> segmentCode = new HashSet<SegmentCode>(0);

     // Constructors

    /** default constructor */
    public ProgramCode() {
    }

	/** minimal constructor */
    public ProgramCode(String programCode) {
        this.programCode = programCode;
    }
    /** full constructor */
    public ProgramCode(String programCode, Object object, Set<Program> programs, Set<SegmentCode> segmentCode) {
       this.programCode = programCode;
       this.object = object;
       this.programs = programs;
       this.segmentCode = segmentCode;
    }
   
    // Property accessors
     @Id
    
    @Column(name="PROGRAM_CODE", unique=false, nullable=false, insertable=true, updatable=true, length=10)
    public String getProgramCode() {
        return this.programCode;
    }
    
    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
    @JoinColumn(name="OBJID", unique=false, nullable=true, insertable=true, updatable=true)
    public Object getObject() {
        return this.object;
    }
    
    public void setObject(Object object) {
        this.object = object;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="programCode")
    public Set<Program> getPrograms() {
        return this.programs;
    }
    
    public void setPrograms(Set<Program> programs) {
        this.programs = programs;
    }
    @OneToMany(cascade={}, fetch=FetchType.LAZY, mappedBy="programCode")
    public Set<SegmentCode> getSegmentCode() {
        return this.segmentCode;
    }
    
    public void setSegmentCode(Set<SegmentCode> segmentCode) {
        this.segmentCode = segmentCode;
    }




}


