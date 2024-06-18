package slidize.cloud.sdk.usecases;

import org.junit.jupiter.api.Test;
import slidize.cloud.sdk.ApiException;
import slidize.cloud.sdk.ApiResponse;
import slidize.cloud.sdk.api.SlidizeApi;

import java.io.File;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RemoveMacrosTests {
    private final SlidizeApi api = new SlidizeApi();
    private final String testFile = "../../TestData/macros.pptm";

    @Test
    public void removeMacros() throws ApiException {
        File file = new File(testFile);

        File response = api.removeMacros(file);

        assertNotNull(response);
        assertTrue(response.length()>0);
    }

    @Test
    public void removeMacrosWithHttpInfo() throws ApiException {
        File file = new File(testFile);

        ApiResponse response = api.removeMacrosWithHttpInfo(file);

        assertTrue(response.getStatusCode() == 200);
        File f = new File(response.getData().toString());
        assertTrue(f.exists());
    }
}
