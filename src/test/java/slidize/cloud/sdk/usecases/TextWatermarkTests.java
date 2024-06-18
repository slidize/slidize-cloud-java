package slidize.cloud.sdk.usecases;

import org.junit.jupiter.api.Test;
import slidize.cloud.sdk.ApiException;
import slidize.cloud.sdk.ApiResponse;
import slidize.cloud.sdk.api.SlidizeApi;
import slidize.cloud.sdk.model.TextWatermarkOptions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TextWatermarkTests {
    private final SlidizeApi api = new SlidizeApi();
    private final String testFile = "../../TestData/test.pptx";
    private final String watermarkText = "Watermark text";
    private final String fontName = "Arial";
    private final String fontColor = "#FF0000";
    private final Integer fontSize = 32;
    private final Integer textAngle = -45;

    @Test
    public void textWatermark() throws ApiException {
        List<File> documents = new ArrayList<>();
        documents.add(new File(testFile));

        TextWatermarkOptions options = new TextWatermarkOptions();
        options.setText(watermarkText);
        options.setFontName(fontName);
        options.setColor(fontColor);
        options.setFontSize(fontSize);
        options.setAngle(textAngle);

        File response = api.textWatermark(documents, options);
        assertNotNull(response);
        assertTrue(response.length()>0);
    }

    @Test
    public void textWatermarkWithHttpInfo() throws ApiException {
        List<File> documents = new ArrayList<>();
        documents.add(new File(testFile));

        TextWatermarkOptions watermarkOptions = new TextWatermarkOptions();
        watermarkOptions.setText(watermarkText);
        watermarkOptions.setFontName(fontName);
        watermarkOptions.setColor(fontColor);
        watermarkOptions.setFontSize(fontSize);
        watermarkOptions.setAngle(textAngle);

        ApiResponse response = api.textWatermarkWithHttpInfo(documents, watermarkOptions);

        assertTrue(response.getStatusCode() == 200);
        File f = new File(response.getData().toString());
        assertTrue(f.exists());
    }
}
