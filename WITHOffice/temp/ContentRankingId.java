// default package
// Generated 2012. 3. 5 오후 1:52:33 by Hibernate Tools 3.2.0.beta8


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ContentRankingId generated by hbm2java
 */
@Embeddable
public class ContentRankingId  implements java.io.Serializable {

    // Fields    

     private String rankingType;
     private Integer ranking;

     // Constructors

    /** default constructor */
    public ContentRankingId() {
    }

    /** full constructor */
    public ContentRankingId(String rankingType, Integer ranking) {
       this.rankingType = rankingType;
       this.ranking = ranking;
    }
   
    // Property accessors

    @Column(name="RANKING_TYPE", unique=false, nullable=false, insertable=true, updatable=true, length=1)
    public String getRankingType() {
        return this.rankingType;
    }
    
    public void setRankingType(String rankingType) {
        this.rankingType = rankingType;
    }

    @Column(name="RANKING", unique=false, nullable=false, insertable=true, updatable=true, precision=0)
    public Integer getRanking() {
        return this.ranking;
    }
    
    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }




}


