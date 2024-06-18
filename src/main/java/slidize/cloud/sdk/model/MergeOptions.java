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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import slidize.cloud.sdk.JSON;

/**
 * MergeOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-11T23:12:27.361+05:00[Asia/Yekaterinburg]")
public class MergeOptions {
  public static final String SERIALIZED_NAME_MASTER_FILE_NAME = "masterFileName";
  @SerializedName(SERIALIZED_NAME_MASTER_FILE_NAME)
  private String masterFileName;

  public static final String SERIALIZED_NAME_EXCLUDE_MASTER_FILE = "excludeMasterFile";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_MASTER_FILE)
  private Boolean excludeMasterFile;

  public MergeOptions() {
  }

  public MergeOptions masterFileName(String masterFileName) {
    
    this.masterFileName = masterFileName;
    return this;
  }

   /**
   * Get masterFileName
   * @return masterFileName
  **/
  @javax.annotation.Nullable
  public String getMasterFileName() {
    return masterFileName;
  }


  public void setMasterFileName(String masterFileName) {
    this.masterFileName = masterFileName;
  }


  public MergeOptions excludeMasterFile(Boolean excludeMasterFile) {
    
    this.excludeMasterFile = excludeMasterFile;
    return this;
  }

   /**
   * Get excludeMasterFile
   * @return excludeMasterFile
  **/
  @javax.annotation.Nullable
  public Boolean getExcludeMasterFile() {
    return excludeMasterFile;
  }


  public void setExcludeMasterFile(Boolean excludeMasterFile) {
    this.excludeMasterFile = excludeMasterFile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeOptions mergeOptions = (MergeOptions) o;
    return Objects.equals(this.masterFileName, mergeOptions.masterFileName) &&
        Objects.equals(this.excludeMasterFile, mergeOptions.excludeMasterFile);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(masterFileName, excludeMasterFile);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeOptions {\n");
    sb.append("    masterFileName: ").append(toIndentedString(masterFileName)).append("\n");
    sb.append("    excludeMasterFile: ").append(toIndentedString(excludeMasterFile)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("masterFileName");
    openapiFields.add("excludeMasterFile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MergeOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MergeOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MergeOptions is not found in the empty JSON string", MergeOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MergeOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MergeOptions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("masterFileName") != null && !jsonObj.get("masterFileName").isJsonNull()) && !jsonObj.get("masterFileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `masterFileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("masterFileName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MergeOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MergeOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MergeOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MergeOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<MergeOptions>() {
           @Override
           public void write(JsonWriter out, MergeOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MergeOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MergeOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MergeOptions
  * @throws IOException if the JSON string is invalid with respect to MergeOptions
  */
  public static MergeOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MergeOptions.class);
  }

 /**
  * Convert an instance of MergeOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

