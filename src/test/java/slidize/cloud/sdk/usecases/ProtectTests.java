package slidize.cloud.sdk.usecases;

import org.junit.jupiter.api.Test;
import slidize.cloud.sdk.ApiException;
import slidize.cloud.sdk.ApiResponse;
import slidize.cloud.sdk.api.SlidizeApi;
import slidize.cloud.sdk.model.ProtectionOptions;

import java.io.File;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ProtectTests {
    private final SlidizeApi api = new SlidizeApi();
    private final String testFile = "../../TestData/test.pptx";
    private final String password = "password";

    @Test
    public void Protect() throws ApiException {
        File file = new File(testFile);

        ProtectionOptions options = new ProtectionOptions();
        options.setViewPassword(password);
        options.setEditPassword(password);
        options.setMarkAsFinal(true);

        File response = api.protect(file, options);
        assertNotNull(response);
        assertTrue(response.length()>0);
    }

    @Test
    public void ProtectWithHttpInfo() throws ApiException {
        File file = new File(testFile);

        ProtectionOptions options = new ProtectionOptions();
        options.setViewPassword(password);
        options.setEditPassword(password);
        options.setMarkAsFinal(true);

        ApiResponse response = api.protectWithHttpInfo(file, options);
        assertTrue(response.getStatusCode() == 200);
        File f = new File(response.getData().toString());
        assertTrue(f.exists());
    }
}
