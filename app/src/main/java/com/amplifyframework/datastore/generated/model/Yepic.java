package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.core.model.annotations.HasOne;

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

/** This is an auto generated class representing the Yepic type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Yepics", authRules = {
  @AuthRule(allow = AuthStrategy.OWNER, ownerField = "user_id", identityClaim = "cognito:username", provider = "userPools", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ }),
  @AuthRule(allow = AuthStrategy.PRIVATE, provider = "iam", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
@Index(name = "yepicByUser", fields = {"user_id"})
public final class Yepic implements Model {
  public static final QueryField ID = field("Yepic", "id");
  public static final QueryField USER_ID = field("Yepic", "user_id");
  public static final QueryField TITLE = field("Yepic", "title");
  public static final QueryField START = field("Yepic", "start");
  public static final QueryField END = field("Yepic", "end");
  public static final QueryField AUTO_UPDATE = field("Yepic", "autoUpdate");
  public static final QueryField IMAGE_IDS = field("Yepic", "imageIds");
  public static final QueryField PLACE_ID = field("Yepic", "placeID");
  public static final QueryField CREATED_AT = field("Yepic", "createdAt");
  public static final QueryField UPDATED_AT = field("Yepic", "updatedAt");
  public static final QueryField ALBUM_COVER = field("Yepic", "albumCover");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String") String user_id;
  private final @ModelField(targetType="String") String title;
  private final @ModelField(targetType="Note") @HasMany(associatedWith = "yepic", type = Note.class) List<Note> notes = null;
  private final @ModelField(targetType="Task") @HasMany(associatedWith = "yepic", type = Task.class) List<Task> task = null;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime start;
  private final @ModelField(targetType="AWSDateTime") Temporal.DateTime end;
  private final @ModelField(targetType="Boolean") Boolean autoUpdate;
  private final @ModelField(targetType="String") List<String> imageIds;
  private final @ModelField(targetType="Image") @HasMany(associatedWith = "yepic", type = Image.class) List<Image> images = null;
  private final @ModelField(targetType="ID") String placeID;
  private final @ModelField(targetType="YepicPlace") @HasOne(associatedWith = "id", type = YepicPlace.class) YepicPlace place = null;
  private final @ModelField(targetType="YepicVisit") @HasMany(associatedWith = "yepic", type = YepicVisit.class) List<YepicVisit> visit = null;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime createdAt;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime updatedAt;
  private final @ModelField(targetType="String") String albumCover;
  public String getId() {
      return id;
  }
  
  public String getUserId() {
      return user_id;
  }
  
  public String getTitle() {
      return title;
  }
  
  public List<Note> getNotes() {
      return notes;
  }
  
  public List<Task> getTask() {
      return task;
  }
  
  public Temporal.DateTime getStart() {
      return start;
  }
  
  public Temporal.DateTime getEnd() {
      return end;
  }
  
  public Boolean getAutoUpdate() {
      return autoUpdate;
  }
  
  public List<String> getImageIds() {
      return imageIds;
  }
  
  public List<Image> getImages() {
      return images;
  }
  
  public String getPlaceId() {
      return placeID;
  }
  
  public YepicPlace getPlace() {
      return place;
  }
  
  public List<YepicVisit> getVisit() {
      return visit;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  public String getAlbumCover() {
      return albumCover;
  }
  
  private Yepic(String id, String user_id, String title, Temporal.DateTime start, Temporal.DateTime end, Boolean autoUpdate, List<String> imageIds, String placeID, Temporal.DateTime createdAt, Temporal.DateTime updatedAt, String albumCover) {
    this.id = id;
    this.user_id = user_id;
    this.title = title;
    this.start = start;
    this.end = end;
    this.autoUpdate = autoUpdate;
    this.imageIds = imageIds;
    this.placeID = placeID;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.albumCover = albumCover;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Yepic yepic = (Yepic) obj;
      return ObjectsCompat.equals(getId(), yepic.getId()) &&
              ObjectsCompat.equals(getUserId(), yepic.getUserId()) &&
              ObjectsCompat.equals(getTitle(), yepic.getTitle()) &&
              ObjectsCompat.equals(getStart(), yepic.getStart()) &&
              ObjectsCompat.equals(getEnd(), yepic.getEnd()) &&
              ObjectsCompat.equals(getAutoUpdate(), yepic.getAutoUpdate()) &&
              ObjectsCompat.equals(getImageIds(), yepic.getImageIds()) &&
              ObjectsCompat.equals(getPlaceId(), yepic.getPlaceId()) &&
              ObjectsCompat.equals(getCreatedAt(), yepic.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), yepic.getUpdatedAt()) &&
              ObjectsCompat.equals(getAlbumCover(), yepic.getAlbumCover());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getUserId())
      .append(getTitle())
      .append(getStart())
      .append(getEnd())
      .append(getAutoUpdate())
      .append(getImageIds())
      .append(getPlaceId())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .append(getAlbumCover())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Yepic {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("user_id=" + String.valueOf(getUserId()) + ", ")
      .append("title=" + String.valueOf(getTitle()) + ", ")
      .append("start=" + String.valueOf(getStart()) + ", ")
      .append("end=" + String.valueOf(getEnd()) + ", ")
      .append("autoUpdate=" + String.valueOf(getAutoUpdate()) + ", ")
      .append("imageIds=" + String.valueOf(getImageIds()) + ", ")
      .append("placeID=" + String.valueOf(getPlaceId()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ")
      .append("albumCover=" + String.valueOf(getAlbumCover()))
      .append("}")
      .toString();
  }
  
  public static StartStep builder() {
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
  public static Yepic justId(String id) {
    return new Yepic(
      id,
      null,
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
      user_id,
      title,
      start,
      end,
      autoUpdate,
      imageIds,
      placeID,
      createdAt,
      updatedAt,
      albumCover);
  }
  public interface StartStep {
    CreatedAtStep start(Temporal.DateTime start);
  }
  

  public interface CreatedAtStep {
    UpdatedAtStep createdAt(Temporal.DateTime createdAt);
  }
  

  public interface UpdatedAtStep {
    BuildStep updatedAt(Temporal.DateTime updatedAt);
  }
  

  public interface BuildStep {
    Yepic build();
    BuildStep id(String id);
    BuildStep userId(String userId);
    BuildStep title(String title);
    BuildStep end(Temporal.DateTime end);
    BuildStep autoUpdate(Boolean autoUpdate);
    BuildStep imageIds(List<String> imageIds);
    BuildStep placeId(String placeId);
    BuildStep albumCover(String albumCover);
  }
  

  public static class Builder implements StartStep, CreatedAtStep, UpdatedAtStep, BuildStep {
    private String id;
    private Temporal.DateTime start;
    private Temporal.DateTime createdAt;
    private Temporal.DateTime updatedAt;
    private String user_id;
    private String title;
    private Temporal.DateTime end;
    private Boolean autoUpdate;
    private List<String> imageIds;
    private String placeID;
    private String albumCover;
    @Override
     public Yepic build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Yepic(
          id,
          user_id,
          title,
          start,
          end,
          autoUpdate,
          imageIds,
          placeID,
          createdAt,
          updatedAt,
          albumCover);
    }
    
    @Override
     public CreatedAtStep start(Temporal.DateTime start) {
        Objects.requireNonNull(start);
        this.start = start;
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
    
    @Override
     public BuildStep title(String title) {
        this.title = title;
        return this;
    }
    
    @Override
     public BuildStep end(Temporal.DateTime end) {
        this.end = end;
        return this;
    }
    
    @Override
     public BuildStep autoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
        return this;
    }
    
    @Override
     public BuildStep imageIds(List<String> imageIds) {
        this.imageIds = imageIds;
        return this;
    }
    
    @Override
     public BuildStep placeId(String placeId) {
        this.placeID = placeId;
        return this;
    }
    
    @Override
     public BuildStep albumCover(String albumCover) {
        this.albumCover = albumCover;
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
    private CopyOfBuilder(String id, String userId, String title, Temporal.DateTime start, Temporal.DateTime end, Boolean autoUpdate, List<String> imageIds, String placeId, Temporal.DateTime createdAt, Temporal.DateTime updatedAt, String albumCover) {
      super.id(id);
      super.start(start)
        .createdAt(createdAt)
        .updatedAt(updatedAt)
        .userId(userId)
        .title(title)
        .end(end)
        .autoUpdate(autoUpdate)
        .imageIds(imageIds)
        .placeId(placeId)
        .albumCover(albumCover);
    }
    
    @Override
     public CopyOfBuilder start(Temporal.DateTime start) {
      return (CopyOfBuilder) super.start(start);
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
    
    @Override
     public CopyOfBuilder title(String title) {
      return (CopyOfBuilder) super.title(title);
    }
    
    @Override
     public CopyOfBuilder end(Temporal.DateTime end) {
      return (CopyOfBuilder) super.end(end);
    }
    
    @Override
     public CopyOfBuilder autoUpdate(Boolean autoUpdate) {
      return (CopyOfBuilder) super.autoUpdate(autoUpdate);
    }
    
    @Override
     public CopyOfBuilder imageIds(List<String> imageIds) {
      return (CopyOfBuilder) super.imageIds(imageIds);
    }
    
    @Override
     public CopyOfBuilder placeId(String placeId) {
      return (CopyOfBuilder) super.placeId(placeId);
    }
    
    @Override
     public CopyOfBuilder albumCover(String albumCover) {
      return (CopyOfBuilder) super.albumCover(albumCover);
    }
  }
  
}
