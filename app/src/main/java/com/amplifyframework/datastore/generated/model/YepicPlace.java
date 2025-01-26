package com.amplifyframework.datastore.generated.model;

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

/** This is an auto generated class representing the YepicPlace type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "YepicPlaces", authRules = {
  @AuthRule(allow = AuthStrategy.OWNER, ownerField = "user_id", identityClaim = "cognito:username", provider = "userPools", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ }),
  @AuthRule(allow = AuthStrategy.PRIVATE, provider = "iam", operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
@Index(name = "placeByUser", fields = {"user_id"})
public final class YepicPlace implements Model {
  public static final QueryField ID = field("YepicPlace", "id");
  public static final QueryField USER_ID = field("YepicPlace", "user_id");
  public static final QueryField CREATED_AT = field("YepicPlace", "createdAt");
  public static final QueryField UPDATED_AT = field("YepicPlace", "updatedAt");
  public static final QueryField PLACE_NAME = field("YepicPlace", "placeName");
  public static final QueryField FORMATTED_ADDRESS = field("YepicPlace", "formattedAddress");
  public static final QueryField LATITUDE = field("YepicPlace", "latitude");
  public static final QueryField LONGITUDE = field("YepicPlace", "longitude");
  public static final QueryField UPRN = field("YepicPlace", "uprn");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String") String user_id;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime createdAt;
  private final @ModelField(targetType="AWSDateTime", isRequired = true) Temporal.DateTime updatedAt;
  private final @ModelField(targetType="String") String placeName;
  private final @ModelField(targetType="String", isRequired = true) String formattedAddress;
  private final @ModelField(targetType="Float", isRequired = true) Double latitude;
  private final @ModelField(targetType="Float", isRequired = true) Double longitude;
  private final @ModelField(targetType="String") String uprn;
  public String getId() {
      return id;
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
  
  public String getPlaceName() {
      return placeName;
  }
  
  public String getFormattedAddress() {
      return formattedAddress;
  }
  
  public Double getLatitude() {
      return latitude;
  }
  
  public Double getLongitude() {
      return longitude;
  }
  
  public String getUprn() {
      return uprn;
  }
  
  private YepicPlace(String id, String user_id, Temporal.DateTime createdAt, Temporal.DateTime updatedAt, String placeName, String formattedAddress, Double latitude, Double longitude, String uprn) {
    this.id = id;
    this.user_id = user_id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.placeName = placeName;
    this.formattedAddress = formattedAddress;
    this.latitude = latitude;
    this.longitude = longitude;
    this.uprn = uprn;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      YepicPlace yepicPlace = (YepicPlace) obj;
      return ObjectsCompat.equals(getId(), yepicPlace.getId()) &&
              ObjectsCompat.equals(getUserId(), yepicPlace.getUserId()) &&
              ObjectsCompat.equals(getCreatedAt(), yepicPlace.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), yepicPlace.getUpdatedAt()) &&
              ObjectsCompat.equals(getPlaceName(), yepicPlace.getPlaceName()) &&
              ObjectsCompat.equals(getFormattedAddress(), yepicPlace.getFormattedAddress()) &&
              ObjectsCompat.equals(getLatitude(), yepicPlace.getLatitude()) &&
              ObjectsCompat.equals(getLongitude(), yepicPlace.getLongitude()) &&
              ObjectsCompat.equals(getUprn(), yepicPlace.getUprn());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getUserId())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .append(getPlaceName())
      .append(getFormattedAddress())
      .append(getLatitude())
      .append(getLongitude())
      .append(getUprn())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("YepicPlace {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("user_id=" + String.valueOf(getUserId()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()) + ", ")
      .append("placeName=" + String.valueOf(getPlaceName()) + ", ")
      .append("formattedAddress=" + String.valueOf(getFormattedAddress()) + ", ")
      .append("latitude=" + String.valueOf(getLatitude()) + ", ")
      .append("longitude=" + String.valueOf(getLongitude()) + ", ")
      .append("uprn=" + String.valueOf(getUprn()))
      .append("}")
      .toString();
  }
  
  public static CreatedAtStep builder() {
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
  public static YepicPlace justId(String id) {
    return new YepicPlace(
      id,
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
      createdAt,
      updatedAt,
      placeName,
      formattedAddress,
      latitude,
      longitude,
      uprn);
  }
  public interface CreatedAtStep {
    UpdatedAtStep createdAt(Temporal.DateTime createdAt);
  }
  

  public interface UpdatedAtStep {
    FormattedAddressStep updatedAt(Temporal.DateTime updatedAt);
  }
  

  public interface FormattedAddressStep {
    LatitudeStep formattedAddress(String formattedAddress);
  }
  

  public interface LatitudeStep {
    LongitudeStep latitude(Double latitude);
  }
  

  public interface LongitudeStep {
    BuildStep longitude(Double longitude);
  }
  

  public interface BuildStep {
    YepicPlace build();
    BuildStep id(String id);
    BuildStep userId(String userId);
    BuildStep placeName(String placeName);
    BuildStep uprn(String uprn);
  }
  

  public static class Builder implements CreatedAtStep, UpdatedAtStep, FormattedAddressStep, LatitudeStep, LongitudeStep, BuildStep {
    private String id;
    private Temporal.DateTime createdAt;
    private Temporal.DateTime updatedAt;
    private String formattedAddress;
    private Double latitude;
    private Double longitude;
    private String user_id;
    private String placeName;
    private String uprn;
    @Override
     public YepicPlace build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new YepicPlace(
          id,
          user_id,
          createdAt,
          updatedAt,
          placeName,
          formattedAddress,
          latitude,
          longitude,
          uprn);
    }
    
    @Override
     public UpdatedAtStep createdAt(Temporal.DateTime createdAt) {
        Objects.requireNonNull(createdAt);
        this.createdAt = createdAt;
        return this;
    }
    
    @Override
     public FormattedAddressStep updatedAt(Temporal.DateTime updatedAt) {
        Objects.requireNonNull(updatedAt);
        this.updatedAt = updatedAt;
        return this;
    }
    
    @Override
     public LatitudeStep formattedAddress(String formattedAddress) {
        Objects.requireNonNull(formattedAddress);
        this.formattedAddress = formattedAddress;
        return this;
    }
    
    @Override
     public LongitudeStep latitude(Double latitude) {
        Objects.requireNonNull(latitude);
        this.latitude = latitude;
        return this;
    }
    
    @Override
     public BuildStep longitude(Double longitude) {
        Objects.requireNonNull(longitude);
        this.longitude = longitude;
        return this;
    }
    
    @Override
     public BuildStep userId(String userId) {
        this.user_id = userId;
        return this;
    }
    
    @Override
     public BuildStep placeName(String placeName) {
        this.placeName = placeName;
        return this;
    }
    
    @Override
     public BuildStep uprn(String uprn) {
        this.uprn = uprn;
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
    private CopyOfBuilder(String id, String userId, Temporal.DateTime createdAt, Temporal.DateTime updatedAt, String placeName, String formattedAddress, Double latitude, Double longitude, String uprn) {
      super.id(id);
      super.createdAt(createdAt)
        .updatedAt(updatedAt)
        .formattedAddress(formattedAddress)
        .latitude(latitude)
        .longitude(longitude)
        .userId(userId)
        .placeName(placeName)
        .uprn(uprn);
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
     public CopyOfBuilder formattedAddress(String formattedAddress) {
      return (CopyOfBuilder) super.formattedAddress(formattedAddress);
    }
    
    @Override
     public CopyOfBuilder latitude(Double latitude) {
      return (CopyOfBuilder) super.latitude(latitude);
    }
    
    @Override
     public CopyOfBuilder longitude(Double longitude) {
      return (CopyOfBuilder) super.longitude(longitude);
    }
    
    @Override
     public CopyOfBuilder userId(String userId) {
      return (CopyOfBuilder) super.userId(userId);
    }
    
    @Override
     public CopyOfBuilder placeName(String placeName) {
      return (CopyOfBuilder) super.placeName(placeName);
    }
    
    @Override
     public CopyOfBuilder uprn(String uprn) {
      return (CopyOfBuilder) super.uprn(uprn);
    }
  }
  
}
