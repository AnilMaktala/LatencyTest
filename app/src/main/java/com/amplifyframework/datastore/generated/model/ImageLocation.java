package com.amplifyframework.datastore.generated.model;


import androidx.core.util.ObjectsCompat;

import java.util.Objects;
import java.util.List;

/** This is an auto generated class representing the ImageLocation type in your schema. */
public final class ImageLocation {
  private final String id;
  private final Double latitude;
  private final Double longitude;
  public String getId() {
      return id;
  }
  
  public Double getLatitude() {
      return latitude;
  }
  
  public Double getLongitude() {
      return longitude;
  }
  
  private ImageLocation(String id, Double latitude, Double longitude) {
    this.id = id;
    this.latitude = latitude;
    this.longitude = longitude;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      ImageLocation imageLocation = (ImageLocation) obj;
      return ObjectsCompat.equals(getId(), imageLocation.getId()) &&
              ObjectsCompat.equals(getLatitude(), imageLocation.getLatitude()) &&
              ObjectsCompat.equals(getLongitude(), imageLocation.getLongitude());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getLatitude())
      .append(getLongitude())
      .toString()
      .hashCode();
  }
  
  public static IdStep builder() {
      return new Builder();
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      latitude,
      longitude);
  }
  public interface IdStep {
    BuildStep id(String id);
  }
  

  public interface BuildStep {
    ImageLocation build();
    BuildStep latitude(Double latitude);
    BuildStep longitude(Double longitude);
  }
  

  public static class Builder implements IdStep, BuildStep {
    private String id;
    private Double latitude;
    private Double longitude;
    @Override
     public ImageLocation build() {
        
        return new ImageLocation(
          id,
          latitude,
          longitude);
    }
    
    @Override
     public BuildStep id(String id) {
        Objects.requireNonNull(id);
        this.id = id;
        return this;
    }
    
    @Override
     public BuildStep latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }
    
    @Override
     public BuildStep longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, Double latitude, Double longitude) {
      super.id(id)
        .latitude(latitude)
        .longitude(longitude);
    }
    
    @Override
     public CopyOfBuilder id(String id) {
      return (CopyOfBuilder) super.id(id);
    }
    
    @Override
     public CopyOfBuilder latitude(Double latitude) {
      return (CopyOfBuilder) super.latitude(latitude);
    }
    
    @Override
     public CopyOfBuilder longitude(Double longitude) {
      return (CopyOfBuilder) super.longitude(longitude);
    }
  }
  
}
