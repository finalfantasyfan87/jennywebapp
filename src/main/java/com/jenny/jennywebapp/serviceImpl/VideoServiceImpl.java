package com.jenny.jennywebapp.serviceImpl;

import org.springframework.stereotype.Service;
import com.jenny.jennywebapp.service.VideoService;

import java.util.ArrayList;

@Service("videoService")
public class VideoServiceImpl implements VideoService {

	public ArrayList<String> getAllVideosAsString() {
		String[] videoPaths = {"videos/ffxv1.mp4","videos/jennay87video2.mp4",
				"videos/jennay87video3.mp4","videos/jennay87video4.mp4"};
		ArrayList<String> videoPathsList = new ArrayList<String>();
		for (int i = 0; i < videoPaths.length; i++) {
			videoPathsList.add(videoPaths[i]);
		}
		System.out.println(videoPathsList);
		return videoPathsList;
	}

}
