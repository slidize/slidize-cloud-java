package slidize.cloud.sdk.usecases;

import org.junit.jupiter.api.Test;
import slidize.cloud.sdk.ApiException;
import slidize.cloud.sdk.ApiResponse;
import slidize.cloud.sdk.api.SlidizeApi;

import java.io.File;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RemoveAnnotationsTests {
    private final SlidizeApi api = new SlidizeApi();
    private final String testFile = "../../TestData/test.pptx";

    @Test
    public void removeAnnotations() throws ApiException {
        File file = new File(testFile);

        File response = api.removeAnnotations(file);

        assertNotNull(response);
        assertTrue(response.length()>0);
    }

    @Test
    public void removeAnnotationsWithHttpInfo() throws ApiException {
        File file = new File(testFile);

        ApiResponse response = api.removeAnnotationsWithHttpInfo(file);

        assertTrue(response.getStatusCode() == 200);
        File f = new File(response.getData().toString());
        assertTrue(f.exists());
    }
}
