package me.aurous.vkapi.audio;

import java.io.IOException;

import me.aurous.vkapi.VkApi;

/**
 *
 * @author Dmitry Ginzburg <dmitry.a.ginzburg@gmail.com>
 */
public class AudioApi extends VkApi {

	public AudioApi(final int applicationId, final String formData) {
		super(applicationId, formData);
	}

	public AudioApi(final VkApi api) {
		super(api);
	}

	public String getAllMyAudioJson() throws IOException {
		return submitQuery("audio.get", "");
	}

	public String searchAudioJson(final String paramaters) throws IOException {
		return submitQuery("audio.search", paramaters);
	}

}