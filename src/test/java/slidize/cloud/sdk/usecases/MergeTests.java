package slidize.cloud.sdk.usecases;

import org.junit.jupiter.api.Test;
import slidize.cloud.sdk.ApiException;
import slidize.cloud.sdk.ApiResponse;
import slidize.cloud.sdk.api.SlidizeApi;
import slidize.cloud.sdk.model.ExportFormat;
import slidize.cloud.sdk.model.MergeOptions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class MergeTests {

    private final SlidizeApi api = new SlidizeApi();
    private final String testFile = "../../TestData/test.pptx";
    private final String masterFile = "../../TestData/master.pptx";

    @Test
    public void merge() throws ApiException {
        ExportFormat format = ExportFormat.PDF;
        List<File> documents = new ArrayList<>();
        documents.add(new File(testFile));
        documents.add(new File(masterFile));

        MergeOptions options = new MergeOptions();
        options.setMasterFileName("master.pptx");
        options.setExcludeMasterFile(false);

        File response = api.merge(format, documents, options);
        assertNotNull(response);
        assertTrue(response.length()>0);
    }

    @Test
    public void mergeWithHttpInfo() throws ApiException {
        ExportFormat format = ExportFormat.PDF;
        List<File> documents = new ArrayList<>();
        documents.add(new File(testFile));
        documents.add(new File(masterFile));

        MergeOptions options = new MergeOptions();
        options.setMasterFileName("master.pptx");
        options.setExcludeMasterFile(false);

        ApiResponse response = api.mergeWithHttpInfo(format, documents, options);
        assertTrue(response.getStatusCode() == 200);
        File f = new File(response.getData().toString());
        assertTrue(f.exists());
    }
}
