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
 * Gets or Sets ExportFormat
 */
@JsonAdapter(ExportFormat.Adapter.class)
public enum ExportFormat {
  
  ODP("Odp"),
  
  OTP("Otp"),
  
  PPTX("Pptx"),
  
  PPTM("Pptm"),
  
  POTX("Potx"),
  
  PPT("Ppt"),
  
  PPS("Pps"),
  
  PPSM("Ppsm"),
  
  POT("Pot"),
  
  POTM("Potm"),
  
  PDF("Pdf"),
  
  XPS("Xps"),
  
  PPSX("Ppsx"),
  
  TIFF("Tiff"),
  
  HTML("Html"),
  
  SWF("Swf"),
  
  TXT("Txt"),
  
  DOC("Doc"),
  
  DOCX("Docx"),
  
  BMP("Bmp"),
  
  JPEG("Jpeg"),
  
  PNG("Png"),
  
  EMF("Emf"),
  
  WMF("Wmf"),
  
  GIF("Gif"),
  
  EXIF("Exif"),
  
  ICO("Ico"),
  
  SVG("Svg");

  private String value;

  ExportFormat(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExportFormat fromValue(String value) {
    for (ExportFormat b : ExportFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ExportFormat> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExportFormat enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExportFormat read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExportFormat.fromValue(value);
    }
  }
}

