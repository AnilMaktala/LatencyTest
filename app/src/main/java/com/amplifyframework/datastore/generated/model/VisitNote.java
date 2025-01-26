package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.temporal.Temporal;

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

/** This is an auto generated class representing the VisitNote type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "VisitNotes", authRules = {
  @AuthRule(allow = AuthStrategy.OWNER, ownerField = "user_id", identityClaim = "cognito:username", provider = "userPools", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ }),
  @AuthRule(allow = AuthStrategy.PRIVATE, provider = "iam", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
@Index(name = "byVisitNotes", fields = {"visitID"})
@Index(name = "visitNotesByUser", fields = {"user_id"})
public final class VisitNote implements Model {
  public static final QueryField ID = field("VisitNote", "id");
  public static final QueryField NOTES = field("VisitNote", "notes");
  public static final QueryField VISIT = field("VisitNote", "visitID");
  public static final QueryField USER_ID = field("VisitNote", "user_id");
  public static final QueryField CREATED_AT = field("VisitNote", "createdAt");
  public static final QueryField UPDATED_AT = field("VisitNote", "updatedAt");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String notes;
  private final @ModelField(targetType="YepicVisit", isRequired = true) @BelongsTo(targetName = "visitID", type = YepicVisit.class) YepicVisit visit;
  private final @ModelField(targetType="String") String user_id;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime createdAt;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public String getNotes() {
      return notes;
  }
  
  public YepicVisit getVisit() {
      return visit;
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
  
  private VisitNote(String id, String notes, YepicVisit visit, String user_id, Temporal.DateTime createdAt, Temporal.DateTime updatedAt) {
    this.id = id;
    this.notes = notes;
    this.visit = visit;
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
      VisitNote visitNote = (VisitNote) obj;
      return ObjectsCompat.equals(getId(), visitNote.getId()) &&
              ObjectsCompat.equals(getNotes(), visitNote.getNotes()) &&
              ObjectsCompat.equals(getVisit(), visitNote.getVisit()) &&
              ObjectsCompat.equals(getUserId(), visitNote.getUserId()) &&
              ObjectsCompat.equals(getCreatedAt(), visitNote.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), visitNote.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getNotes())
      .append(getVisit())
      .append(getUserId())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("VisitNote {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("notes=" + String.valueOf(getNotes()) + ", ")
      .append("visit=" + String.valueOf(getVisit()) + ", ")
      .append("user_id=" + String.valueOf(getUserId()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static NotesStep builder() {
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
  public static VisitNote justId(String id) {
    return new VisitNote(
      id,
      null,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      notes,
      visit,
      user_id,
      createdAt,
      updatedAt);
  }
  public interface NotesStep {
    VisitStep notes(String notes);
  }
  

  public interface VisitStep {
    CreatedAtStep visit(YepicVisit visit);
  }
  

  public interface CreatedAtStep {
    UpdatedAtStep createdAt(Temporal.DateTime createdAt);
  }
  

  public interface UpdatedAtStep {
    BuildStep updatedAt(Temporal.DateTime updatedAt);
  }
  

  public interface BuildStep {
    VisitNote build();
    BuildStep id(String id);
    BuildStep userId(String userId);
  }
  

  public static class Builder implements NotesStep, VisitStep, CreatedAtStep, UpdatedAtStep, BuildStep {
    private String id;
    private String notes;
    private YepicVisit visit;
    private Temporal.DateTime createdAt;
    private Temporal.DateTime updatedAt;
    private String user_id;
    @Override
     public VisitNote build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new VisitNote(
          id,
          notes,
          visit,
          user_id,
          createdAt,
          updatedAt);
    }
    
    @Override
     public VisitStep notes(String notes) {
        Objects.requireNonNull(notes);
        this.notes = notes;
        return this;
    }
    
    @Override
     public CreatedAtStep visit(YepicVisit visit) {
        Objects.requireNonNull(visit);
        this.visit = visit;
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
    private CopyOfBuilder(String id, String notes, YepicVisit visit, String userId, Temporal.DateTime createdAt, Temporal.DateTime updatedAt) {
      super.id(id);
      super.notes(notes)
        .visit(visit)
        .createdAt(createdAt)
        .updatedAt(updatedAt)
        .userId(userId);
    }
    
    @Override
     public CopyOfBuilder notes(String notes) {
      return (CopyOfBuilder) super.notes(notes);
    }
    
    @Override
     public CopyOfBuilder visit(YepicVisit visit) {
      return (CopyOfBuilder) super.visit(visit);
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
     public CopyOfBuilder userId(String userId) {
      return (CopyOfBuilder) super.userId(userId);
    }
  }
  
}
