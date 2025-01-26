package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasMany;
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

/** This is an auto generated class representing the Image type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Images", authRules = {
  @AuthRule(allow = AuthStrategy.OWNER, ownerField = "user_id", identityClaim = "cognito:username", provider = "userPools", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ }),
  @AuthRule(allow = AuthStrategy.PRIVATE, provider = "iam", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
@Index(name = "byImages", fields = {"yepicID"})
@Index(name = "imagesByUser", fields = {"user_id"})
public final class Image implements Model {
  public static final QueryField ID = field("Image", "id");
  public static final QueryField TITLE = field("Image", "title");
  public static final QueryField PATH = field("Image", "path");
  public static final QueryField IMAGE_HASH_ID = field("Image", "imageHashID");
  public static final QueryField YEPIC = field("Image", "yepicID");
  public static final QueryField USER_ID = field("Image", "user_id");
  public static final QueryField EXIF = field("Image", "exif");
  public static final QueryField IMAGE_CREATED_AT = field("Image", "imageCreatedAt");
  public static final QueryField LOCATION = field("Image", "location");
  public static final QueryField CREATED_AT = field("Image", "createdAt");
  public static final QueryField UPDATED_AT = field("Image", "updatedAt");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String") String title;
  private final @ModelField(targetType="String", isRequired = true) String path;
  private final @ModelField(targetType="String") String imageHashID;
  private final @ModelField(targetType="Yepic", isRequired = true) @BelongsTo(targetName = "yepicID", type = Yepic.class) Yepic yepic;
  private final @ModelField(targetType="String") String user_id;
  private final @ModelField(targetType="ImageNote") @HasMany(associatedWith = "image", type = ImageNote.class) List<ImageNote> notes = null;
  private final @ModelField(targetType="AWSJSON") String exif;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime imageCreatedAt;
  private final @ModelField(targetType="ImageLocation", isRequired = true) ImageLocation location;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime createdAt;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public String getTitle() {
      return title;
  }
  
  public String getPath() {
      return path;
  }
  
  public String getImageHashId() {
      return imageHashID;
  }
  
  public Yepic getYepic() {
      return yepic;
  }
  
  public String getUserId() {
      return user_id;
  }
  
  public List<ImageNote> getNotes() {
      return notes;
  }
  
  public String getExif() {
      return exif;
  }
  
  public Temporal.DateTime getImageCreatedAt() {
      return imageCreatedAt;
  }
  
  public ImageLocation getLocation() {
      return location;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private Image(String id, String title, String path, String imageHashID, Yepic yepic, String user_id, String exif, Temporal.DateTime imageCreatedAt, ImageLocation location, Temporal.DateTime createdAt, Temporal.DateTime updatedAt) {
    this.id = id;
    this.title = title;
    this.path = path;
    this.imageHashID = imageHashID;
    this.yepic = yepic;
    this.user_id = user_id;
    this.exif = exif;
    this.imageCreatedAt = imageCreatedAt;
    this.location = location;
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
      Image image = (Image) obj;
      return ObjectsCompat.equals(getId(), image.getId()) &&
              ObjectsCompat.equals(getTitle(), image.getTitle()) &&
              ObjectsCompat.equals(getPath(), image.getPath()) &&
              ObjectsCompat.equals(getImageHashId(), image.getImageHashId()) &&
              ObjectsCompat.equals(getYepic(), image.getYepic()) &&
              ObjectsCompat.equals(getUserId(), image.getUserId()) &&
              ObjectsCompat.equals(getExif(), image.getExif()) &&
              ObjectsCompat.equals(getImageCreatedAt(), image.getImageCreatedAt()) &&
              ObjectsCompat.equals(getLocation(), image.getLocation()) &&
              ObjectsCompat.equals(getCreatedAt(), image.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), image.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getTitle())
      .append(getPath())
      .append(getImageHashId())
      .append(getYepic())
      .append(getUserId())
      .append(getExif())
      .append(getImageCreatedAt())
      .append(getLocation())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Image {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("title=" + String.valueOf(getTitle()) + ", ")
      .append("path=" + String.valueOf(getPath()) + ", ")
      .append("imageHashID=" + String.valueOf(getImageHashId()) + ", ")
      .append("yepic=" + String.valueOf(getYepic()) + ", ")
      .append("user_id=" + String.valueOf(getUserId()) + ", ")
      .append("exif=" + String.valueOf(getExif()) + ", ")
      .append("imageCreatedAt=" + String.valueOf(getImageCreatedAt()) + ", ")
      .append("location=" + String.valueOf(getLocation()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static PathStep builder() {
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
  public static Image justId(String id) {
    return new Image(
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
      title,
      path,
      imageHashID,
      yepic,
      user_id,
      exif,
      imageCreatedAt,
      location,
      createdAt,
      updatedAt);
  }
  public interface PathStep {
    YepicStep path(String path);
  }
  

  public interface YepicStep {
    ImageCreatedAtStep yepic(Yepic yepic);
  }
  

  public interface ImageCreatedAtStep {
    LocationStep imageCreatedAt(Temporal.DateTime imageCreatedAt);
  }
  

  public interface LocationStep {
    CreatedAtStep location(ImageLocation location);
  }
  

  public interface CreatedAtStep {
    UpdatedAtStep createdAt(Temporal.DateTime createdAt);
  }
  

  public interface UpdatedAtStep {
    BuildStep updatedAt(Temporal.DateTime updatedAt);
  }
  

  public interface BuildStep {
    Image build();
    BuildStep id(String id);
    BuildStep title(String title);
    BuildStep imageHashId(String imageHashId);
    BuildStep userId(String userId);
    BuildStep exif(String exif);
  }
  

  public static class Builder implements PathStep, YepicStep, ImageCreatedAtStep, LocationStep, CreatedAtStep, UpdatedAtStep, BuildStep {
    private String id;
    private String path;
    private Yepic yepic;
    private Temporal.DateTime imageCreatedAt;
    private ImageLocation location;
    private Temporal.DateTime createdAt;
    private Temporal.DateTime updatedAt;
    private String title;
    private String imageHashID;
    private String user_id;
    private String exif;
    @Override
     public Image build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Image(
          id,
          title,
          path,
          imageHashID,
          yepic,
          user_id,
          exif,
          imageCreatedAt,
          location,
          createdAt,
          updatedAt);
    }
    
    @Override
     public YepicStep path(String path) {
        Objects.requireNonNull(path);
        this.path = path;
        return this;
    }
    
    @Override
     public ImageCreatedAtStep yepic(Yepic yepic) {
        Objects.requireNonNull(yepic);
        this.yepic = yepic;
        return this;
    }
    
    @Override
     public LocationStep imageCreatedAt(Temporal.DateTime imageCreatedAt) {
        Objects.requireNonNull(imageCreatedAt);
        this.imageCreatedAt = imageCreatedAt;
        return this;
    }
    
    @Override
     public CreatedAtStep location(ImageLocation location) {
        Objects.requireNonNull(location);
        this.location = location;
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
     public BuildStep title(String title) {
        this.title = title;
        return this;
    }
    
    @Override
     public BuildStep imageHashId(String imageHashId) {
        this.imageHashID = imageHashId;
        return this;
    }
    
    @Override
     public BuildStep userId(String userId) {
        this.user_id = userId;
        return this;
    }
    
    @Override
     public BuildStep exif(String exif) {
        this.exif = exif;
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
    private CopyOfBuilder(String id, String title, String path, String imageHashId, Yepic yepic, String userId, String exif, Temporal.DateTime imageCreatedAt, ImageLocation location, Temporal.DateTime createdAt, Temporal.DateTime updatedAt) {
      super.id(id);
      super.path(path)
        .yepic(yepic)
        .imageCreatedAt(imageCreatedAt)
        .location(location)
        .createdAt(createdAt)
        .updatedAt(updatedAt)
        .title(title)
        .imageHashId(imageHashId)
        .userId(userId)
        .exif(exif);
    }
    
    @Override
     public CopyOfBuilder path(String path) {
      return (CopyOfBuilder) super.path(path);
    }
    
    @Override
     public CopyOfBuilder yepic(Yepic yepic) {
      return (CopyOfBuilder) super.yepic(yepic);
    }
    
    @Override
     public CopyOfBuilder imageCreatedAt(Temporal.DateTime imageCreatedAt) {
      return (CopyOfBuilder) super.imageCreatedAt(imageCreatedAt);
    }
    
    @Override
     public CopyOfBuilder location(ImageLocation location) {
      return (CopyOfBuilder) super.location(location);
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
     public CopyOfBuilder title(String title) {
      return (CopyOfBuilder) super.title(title);
    }
    
    @Override
     public CopyOfBuilder imageHashId(String imageHashId) {
      return (CopyOfBuilder) super.imageHashId(imageHashId);
    }
    
    @Override
     public CopyOfBuilder userId(String userId) {
      return (CopyOfBuilder) super.userId(userId);
    }
    
    @Override
     public CopyOfBuilder exif(String exif) {
      return (CopyOfBuilder) super.exif(exif);
    }
  }
  
}
