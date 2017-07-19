package spring.mvc.serviceImpl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import spring.mvc.service.VideoService;

@Service("videoService")
public class VideoServiceImpl implements VideoService {

	public ArrayList<String> getAllVideosAsString() {
		String[] videoPaths = {"/jenapp/resources/videos/jennay87video1.mp4","/jenapp/resources/videos/jennay87video2.mp4",
				"/jenapp/resources/videos/jennay87video3.mp4","/jenapp/resources/videos/jennay87video4.mp4",
				"/jenapp/resources/videos/jennay87video5.mp4"};
		ArrayList<String> videoPathsList = new ArrayList<String>();
		for (int i = 0; i < videoPaths.length; i++) {
			videoPathsList.add(videoPaths[i]);
		}
		System.out.println(videoPathsList);
		return videoPathsList;
	}

}
