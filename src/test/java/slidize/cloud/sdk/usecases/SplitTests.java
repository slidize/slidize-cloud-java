package slidize.cloud.sdk.usecases;

import org.junit.jupiter.api.Test;
import slidize.cloud.sdk.ApiException;
import slidize.cloud.sdk.ApiResponse;
import slidize.cloud.sdk.api.SlidizeApi;
import slidize.cloud.sdk.model.ExportFormat;
import slidize.cloud.sdk.model.SplitOptions;

import java.io.File;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SplitTests {
    private final SlidizeApi api = new SlidizeApi();
    private final String testFile = "../../TestData/test.pptx";

    @Test
    public void split() throws ApiException {
        ExportFormat format = ExportFormat.PDF;
        File file = new File(testFile);

        SplitOptions splitOptions = new SplitOptions();
        splitOptions.setSlidesRange("1,2-4,5");

        File response = api.split(format, file, splitOptions);
        assertNotNull(response);
        assertTrue(response.length()>0);
    }

    @Test
    public void splitWithHttpInfo() throws ApiException {
        ExportFormat format = ExportFormat.PDF;
        File file = new File(testFile);

        SplitOptions options = new SplitOptions();
        options.setSlidesRange("1,2-4,5");

        ApiResponse response = api.splitWithHttpInfo(format, file, options);
        assertTrue(response.getStatusCode() == 200);
        File f = new File(response.getData().toString());
        assertTrue(f.exists());
    }
}
