package slidize.cloud.sdk.usecases;

import org.junit.jupiter.api.Test;
import slidize.cloud.sdk.ApiException;
import slidize.cloud.sdk.ApiResponse;
import slidize.cloud.sdk.api.SlidizeApi;

import java.io.File;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class UnprotectTests {
    private final SlidizeApi api = new SlidizeApi();
    private final String testFile = "../../TestData/protected.pptx";
    private final String password = "password";

    @Test
    public void Unprotect() throws ApiException {
        File file = new File(testFile);

        File response = api.unprotect(password, file);

        assertNotNull(response);
        assertTrue(response.length()>0);
    }

    @Test
    public void UnprotectWithHttpInfo() throws ApiException {
        File file = new File(testFile);

        ApiResponse response = api.unprotectWithHttpInfo(password, file);

        assertTrue(response.getStatusCode() == 200);
        File f = new File(response.getData().toString());
        assertTrue(f.exists());
    }
}
