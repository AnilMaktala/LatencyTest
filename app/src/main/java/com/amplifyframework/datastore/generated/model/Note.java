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

/** This is an auto generated class representing the Note type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Notes", authRules = {
  @AuthRule(allow = AuthStrategy.OWNER, ownerField = "user_id", identityClaim = "cognito:username", provider = "userPools", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ }),
  @AuthRule(allow = AuthStrategy.PRIVATE, provider = "iam", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
@Index(name = "byNotes", fields = {"yepicID"})
@Index(name = "notesByUser", fields = {"user_id"})
public final class Note implements Model {
  public static final QueryField ID = field("Note", "id");
  public static final QueryField NOTES = field("Note", "notes");
  public static final QueryField YEPIC = field("Note", "yepicID");
  public static final QueryField USER_ID = field("Note", "user_id");
  public static final QueryField CREATED_AT = field("Note", "createdAt");
  public static final QueryField UPDATED_AT = field("Note", "updatedAt");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String notes;
  private final @ModelField(targetType="Yepic", isRequired = true) @BelongsTo(targetName = "yepicID", type = Yepic.class) Yepic yepic;
  private final @ModelField(targetType="String") String user_id;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime createdAt;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public String getNotes() {
      return notes;
  }
  
  public Yepic getYepic() {
      return yepic;
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
  
  private Note(String id, String notes, Yepic yepic, String user_id, Temporal.DateTime createdAt, Temporal.DateTime updatedAt) {
    this.id = id;
    this.notes = notes;
    this.yepic = yepic;
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
      Note note = (Note) obj;
      return ObjectsCompat.equals(getId(), note.getId()) &&
              ObjectsCompat.equals(getNotes(), note.getNotes()) &&
              ObjectsCompat.equals(getYepic(), note.getYepic()) &&
              ObjectsCompat.equals(getUserId(), note.getUserId()) &&
              ObjectsCompat.equals(getCreatedAt(), note.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), note.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getNotes())
      .append(getYepic())
      .append(getUserId())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Note {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("notes=" + String.valueOf(getNotes()) + ", ")
      .append("yepic=" + String.valueOf(getYepic()) + ", ")
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
  public static Note justId(String id) {
    return new Note(
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
      yepic,
      user_id,
      createdAt,
      updatedAt);
  }
  public interface NotesStep {
    YepicStep notes(String notes);
  }
  

  public interface YepicStep {
    CreatedAtStep yepic(Yepic yepic);
  }
  

  public interface CreatedAtStep {
    UpdatedAtStep createdAt(Temporal.DateTime createdAt);
  }
  

  public interface UpdatedAtStep {
    BuildStep updatedAt(Temporal.DateTime updatedAt);
  }
  

  public interface BuildStep {
    Note build();
    BuildStep id(String id);
    BuildStep userId(String userId);
  }
  

  public static class Builder implements NotesStep, YepicStep, CreatedAtStep, UpdatedAtStep, BuildStep {
    private String id;
    private String notes;
    private Yepic yepic;
    private Temporal.DateTime createdAt;
    private Temporal.DateTime updatedAt;
    private String user_id;
    @Override
     public Note build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Note(
          id,
          notes,
          yepic,
          user_id,
          createdAt,
          updatedAt);
    }
    
    @Override
     public YepicStep notes(String notes) {
        Objects.requireNonNull(notes);
        this.notes = notes;
        return this;
    }
    
    @Override
     public CreatedAtStep yepic(Yepic yepic) {
        Objects.requireNonNull(yepic);
        this.yepic = yepic;
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
    private CopyOfBuilder(String id, String notes, Yepic yepic, String userId, Temporal.DateTime createdAt, Temporal.DateTime updatedAt) {
      super.id(id);
      super.notes(notes)
        .yepic(yepic)
        .createdAt(createdAt)
        .updatedAt(updatedAt)
        .userId(userId);
    }
    
    @Override
     public CopyOfBuilder notes(String notes) {
      return (CopyOfBuilder) super.notes(notes);
    }
    
    @Override
     public CopyOfBuilder yepic(Yepic yepic) {
      return (CopyOfBuilder) super.yepic(yepic);
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
