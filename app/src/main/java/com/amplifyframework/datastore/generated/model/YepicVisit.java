package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.core.model.annotations.HasMany;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the YepicVisit type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "YepicVisits", authRules = {
  @AuthRule(allow = AuthStrategy.OWNER, ownerField = "user_id", identityClaim = "cognito:username", provider = "userPools", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ }),
  @AuthRule(allow = AuthStrategy.PRIVATE, provider = "iam", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
@Index(name = "byYepicVisit", fields = {"yepicID"})
@Index(name = "yepicVisitByUser", fields = {"user_id"})
public final class YepicVisit implements Model {
  public static final QueryField ID = field("YepicVisit", "id");
  public static final QueryField YEPIC = field("YepicVisit", "yepicID");
  public static final QueryField ARRIVE = field("YepicVisit", "arrive");
  public static final QueryField LEAVE = field("YepicVisit", "leave");
  public static final QueryField START = field("YepicVisit", "start");
  public static final QueryField END = field("YepicVisit", "end");
  public static final QueryField DURATION = field("YepicVisit", "duration");
  public static final QueryField USER_ID = field("YepicVisit", "user_id");
  public static final QueryField CREATED_AT = field("YepicVisit", "createdAt");
  public static final QueryField UPDATED_AT = field("YepicVisit", "updatedAt");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="Yepic", isRequired = true) @BelongsTo(targetName = "yepicID", type = Yepic.class) Yepic yepic;
  private final @ModelField(targetType="AWSDateTime") Temporal.DateTime arrive;
  private final @ModelField(targetType="AWSDateTime") Temporal.DateTime leave;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime start;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime end;
  private final @ModelField(targetType="VisitNote") @HasMany(associatedWith = "visit", type = VisitNote.class) List<VisitNote> notes = null;
  private final @ModelField(targetType="Int") Integer duration;
  private final @ModelField(targetType="String") String user_id;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime createdAt;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public Yepic getYepic() {
      return yepic;
  }
  
  public Temporal.DateTime getArrive() {
      return arrive;
  }
  
  public Temporal.DateTime getLeave() {
      return leave;
  }
  
  public Temporal.DateTime getStart() {
      return start;
  }
  
  public Temporal.DateTime getEnd() {
      return end;
  }
  
  public List<VisitNote> getNotes() {
      return notes;
  }
  
  public Integer getDuration() {
      return duration;
  }
  
  public String getUserId() {
      return user_id;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private YepicVisit(String id, Yepic yepic, Temporal.DateTime arrive, Temporal.DateTime leave, Temporal.DateTime start, Temporal.DateTime end, Integer duration, String user_id, Temporal.DateTime createdAt, Temporal.DateTime updatedAt) {
    this.id = id;
    this.yepic = yepic;
    this.arrive = arrive;
    this.leave = leave;
    this.start = start;
    this.end = end;
    this.duration = duration;
    this.user_id = user_id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      YepicVisit yepicVisit = (YepicVisit) obj;
      return ObjectsCompat.equals(getId(), yepicVisit.getId()) &&
              ObjectsCompat.equals(getYepic(), yepicVisit.getYepic()) &&
              ObjectsCompat.equals(getArrive(), yepicVisit.getArrive()) &&
              ObjectsCompat.equals(getLeave(), yepicVisit.getLeave()) &&
              ObjectsCompat.equals(getStart(), yepicVisit.getStart()) &&
              ObjectsCompat.equals(getEnd(), yepicVisit.getEnd()) &&
              ObjectsCompat.equals(getDuration(), yepicVisit.getDuration()) &&
              ObjectsCompat.equals(getUserId(), yepicVisit.getUserId()) &&
              ObjectsCompat.equals(getCreatedAt(), yepicVisit.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), yepicVisit.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getYepic())
      .append(getArrive())
      .append(getLeave())
      .append(getStart())
      .append(getEnd())
      .append(getDuration())
      .append(getUserId())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("YepicVisit {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("yepic=" + String.valueOf(getYepic()) + ", ")
      .append("arrive=" + String.valueOf(getArrive()) + ", ")
      .append("leave=" + String.valueOf(getLeave()) + ", ")
      .append("start=" + String.valueOf(getStart()) + ", ")
      .append("end=" + String.valueOf(getEnd()) + ", ")
      .append("duration=" + String.valueOf(getDuration()) + ", ")
      .append("user_id=" + String.valueOf(getUserId()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static YepicStep builder() {
      return new Builder();
  }
  
  /**
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   */
  public static YepicVisit justId(String id) {
    return new YepicVisit(
      id,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      yepic,
      arrive,
      leave,
      start,
      end,
      duration,
      user_id,
      createdAt,
      updatedAt);
  }
  public interface YepicStep {
    StartStep yepic(Yepic yepic);
  }
  

  public interface StartStep {
    EndStep start(Temporal.DateTime start);
  }
  

  public interface EndStep {
    CreatedAtStep end(Temporal.DateTime end);
  }
  

  public interface CreatedAtStep {
    UpdatedAtStep createdAt(Temporal.DateTime createdAt);
  }
  

  public interface UpdatedAtStep {
    BuildStep updatedAt(Temporal.DateTime updatedAt);
  }
  

  public interface BuildStep {
    YepicVisit build();
    BuildStep id(String id);
    BuildStep arrive(Temporal.DateTime arrive);
    BuildStep leave(Temporal.DateTime leave);
    BuildStep duration(Integer duration);
    BuildStep userId(String userId);
  }
  

  public static class Builder implements YepicStep, StartStep, EndStep, CreatedAtStep, UpdatedAtStep, BuildStep {
    private String id;
    private Yepic yepic;
    private Temporal.DateTime start;
    private Temporal.DateTime end;
    private Temporal.DateTime createdAt;
    private Temporal.DateTime updatedAt;
    private Temporal.DateTime arrive;
    private Temporal.DateTime leave;
    private Integer duration;
    private String user_id;
    @Override
     public YepicVisit build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new YepicVisit(
          id,
          yepic,
          arrive,
          leave,
          start,
          end,
          duration,
          user_id,
          createdAt,
          updatedAt);
    }
    
    @Override
     public StartStep yepic(Yepic yepic) {
        Objects.requireNonNull(yepic);
        this.yepic = yepic;
        return this;
    }
    
    @Override
     public EndStep start(Temporal.DateTime start) {
        Objects.requireNonNull(start);
        this.start = start;
        return this;
    }
    
    @Override
     public CreatedAtStep end(Temporal.DateTime end) {
        Objects.requireNonNull(end);
        this.end = end;
        return this;
    }
    
    @Override
     public UpdatedAtStep createdAt(Temporal.DateTime createdAt) {
        Objects.requireNonNull(createdAt);
        this.createdAt = createdAt;
        return this;
    }
    
    @Override
     public BuildStep updatedAt(Temporal.DateTime updatedAt) {
        Objects.requireNonNull(updatedAt);
        this.updatedAt = updatedAt;
        return this;
    }
    
    @Override
     public BuildStep arrive(Temporal.DateTime arrive) {
        this.arrive = arrive;
        return this;
    }
    
    @Override
     public BuildStep leave(Temporal.DateTime leave) {
        this.leave = leave;
        return this;
    }
    
    @Override
     public BuildStep duration(Integer duration) {
        this.duration = duration;
        return this;
    }
    
    @Override
     public BuildStep userId(String userId) {
        this.user_id = userId;
        return this;
    }
    
    /**
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     */
    public BuildStep id(String id) {
        this.id = id;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, Yepic yepic, Temporal.DateTime arrive, Temporal.DateTime leave, Temporal.DateTime start, Temporal.DateTime end, Integer duration, String userId, Temporal.DateTime createdAt, Temporal.DateTime updatedAt) {
      super.id(id);
      super.yepic(yepic)
        .start(start)
        .end(end)
        .createdAt(createdAt)
        .updatedAt(updatedAt)
        .arrive(arrive)
        .leave(leave)
        .duration(duration)
        .userId(userId);
    }
    
    @Override
     public CopyOfBuilder yepic(Yepic yepic) {
      return (CopyOfBuilder) super.yepic(yepic);
    }
    
    @Override
     public CopyOfBuilder start(Temporal.DateTime start) {
      return (CopyOfBuilder) super.start(start);
    }
    
    @Override
     public CopyOfBuilder end(Temporal.DateTime end) {
      return (CopyOfBuilder) super.end(end);
    }
    
    @Override
     public CopyOfBuilder createdAt(Temporal.DateTime createdAt) {
      return (CopyOfBuilder) super.createdAt(createdAt);
    }
    
    @Override
     public CopyOfBuilder updatedAt(Temporal.DateTime updatedAt) {
      return (CopyOfBuilder) super.updatedAt(updatedAt);
    }
    
    @Override
     public CopyOfBuilder arrive(Temporal.DateTime arrive) {
      return (CopyOfBuilder) super.arrive(arrive);
    }
    
    @Override
     public CopyOfBuilder leave(Temporal.DateTime leave) {
      return (CopyOfBuilder) super.leave(leave);
    }
    
    @Override
     public CopyOfBuilder duration(Integer duration) {
      return (CopyOfBuilder) super.duration(duration);
    }
    
    @Override
     public CopyOfBuilder userId(String userId) {
      return (CopyOfBuilder) super.userId(userId);
    }
  }
  
}
