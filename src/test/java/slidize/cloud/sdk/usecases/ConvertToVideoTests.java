package slidize.cloud.sdk.usecases;

import org.junit.jupiter.api.Test;
import slidize.cloud.sdk.ApiException;
import slidize.cloud.sdk.ApiResponse;
import slidize.cloud.sdk.api.SlidizeApi;
import slidize.cloud.sdk.model.VideoOptions;
import slidize.cloud.sdk.model.VideoResolutionType;
import slidize.cloud.sdk.model.VideoTransitionType;

import java.io.File;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ConvertToVideoTests {
    private final SlidizeApi api = new SlidizeApi();
    private final String testFile = "../../TestData/test.pptx";

    @Test
    public void convertToVideo() throws ApiException {
        File file = new File(testFile);

        VideoOptions options = new VideoOptions();
        options.setDuration(3);
        options.setTransition(1);
        options.setTransitionType(VideoTransitionType.DISSOLVE);
        options.setResolutionType(VideoResolutionType.SD);

        File response = api.convertToVideo(file, options);
        assertNotNull(response);
        assertTrue(response.length()>0);
    }

    @Test
    public void convertToVideoWithHttpInfo() throws ApiException {
        File file = new File(testFile);

        VideoOptions options = new VideoOptions();
        options.setDuration(3);
        options.setTransition(1);
        options.setTransitionType(VideoTransitionType.DISSOLVE);
        options.setResolutionType(VideoResolutionType.SD);

        ApiResponse response = api.convertToVideoWithHttpInfo(file, options);
        assertTrue(response.getStatusCode() == 200);
        File f = new File(response.getData().toString());
        assertTrue(f.exists());
    }
}
