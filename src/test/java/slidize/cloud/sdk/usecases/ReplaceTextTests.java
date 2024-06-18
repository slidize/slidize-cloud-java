package slidize.cloud.sdk.usecases;

import org.junit.jupiter.api.Test;
import slidize.cloud.sdk.ApiException;
import slidize.cloud.sdk.ApiResponse;
import slidize.cloud.sdk.api.SlidizeApi;
import slidize.cloud.sdk.model.ReplaceTextOptions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ReplaceTextTests {
    private final SlidizeApi api = new SlidizeApi();
    private final String testFile = "../../TestData/test.pptx";
    private final String oldValue = "Text to replace";
    private final String newValue = "New value";
    @Test
    public void replaceText() throws ApiException {
        List<File> documents = new ArrayList<>();
        documents.add(new File(testFile));

        ReplaceTextOptions options = new ReplaceTextOptions();
        options.setOldValue(oldValue);
        options.setNewValue(newValue);
        options.setIgnoreCase(true);

        File response = api.replaceText(documents, options);
        assertNotNull(response);
        assertTrue(response.length()>0);
    }

    @Test
    public void replaceTextWithHttpInfo() throws ApiException {
        List<File> documents = new ArrayList<>();
        documents.add(new File(testFile));

        ReplaceTextOptions options = new ReplaceTextOptions();
        options.setOldValue(oldValue);
        options.setNewValue(newValue);
        options.setIgnoreCase(true);

        ApiResponse response = api.replaceTextWithHttpInfo(documents, options);
        assertTrue(response.getStatusCode() == 200);
        File f = new File(response.getData().toString());
        assertTrue(f.exists());
    }
}
