/*
 <copyright company="Smallize Pty Ltd">
   Copyright (c) 2024 Slidize for Cloud
 </copyright>
 <summary>
  Permission is hereby granted, free of charge, to any person obtaining a copy
  of this software and associated documentation files (the "Software"), to deal
  in the Software without restriction, including without limitation the rights
  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  copies of the Software, and to permit persons to whom the Software is
  furnished to do so, subject to the following conditions:
 
  The above copyright notice and this permission notice shall be included in all
  copies or substantial portions of the Software.
 
  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
  SOFTWARE.
 */


package slidize.cloud.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets VideoTransitionType
 */
@JsonAdapter(VideoTransitionType.Adapter.class)
public enum VideoTransitionType {
  
  NONE("None"),
  
  RANDOM("Random"),
  
  FROMPRESENTATION("FromPresentation"),
  
  FADE("Fade"),
  
  DISTANCE("Distance"),
  
  SLIDELEFT("SlideLeft"),
  
  CIRCLECROP("CircleCrop"),
  
  DISSOLVE("Dissolve");

  private String value;

  VideoTransitionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VideoTransitionType fromValue(String value) {
    for (VideoTransitionType b : VideoTransitionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<VideoTransitionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final VideoTransitionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VideoTransitionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VideoTransitionType.fromValue(value);
    }
  }
}

