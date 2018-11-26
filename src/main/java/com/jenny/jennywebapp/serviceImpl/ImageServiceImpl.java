package com.jenny.jennywebapp.serviceImpl;

import org.springframework.stereotype.Service;
import com.jenny.jennywebapp.service.ImageService;

import java.util.ArrayList;
import java.util.Arrays;

@Service("imageService")
public class ImageServiceImpl implements ImageService {

    public ArrayList<String> getAllImagesAsString() {
        String[] imagePaths = {"images/ignis.png",
                "images/noct.png", "images/gladio.png",
                "images/prompto.png", "images/Ardyn.jpg",
                "images/gladio.png", "images/Ignis.jpg",
                "images/ignis2.jpg", "images/lunie.jpg",
                "images/noctbattle.jpg", "images/noctgladio.jpg",
                "images/lunanoct.jpg", "images/noctprompto.png",
                "images/regis.jpg", "images/guysBattlePrep.jpg",
                "images/guysSelfie.jpg", "images/Ignis.jpg",
                "images/ignis.png", "images/ignis2.jpg",
                "images/iris.png", "images/iris2.jpg",
                "images/blueMagicNoct.jpg", "images/chocoboandguys.jpg",
                "images/lunie.jpg", "images/noct2.png",
                "images/noctandregis.jpg", "images/noctandregis2.jpg",
                "images/noctbattle.jpg", "images/noctgladio.jpg",
                "images/noctprompto.png", "images/noctsummon.png",
                "images/oldNoct.jpg"};

        System.out.println(Arrays.asList(imagePaths).toString());

        ArrayList<String> imagePathsList = new ArrayList<String>();

        for (int i = 0; i < imagePaths.length; i++) {
            imagePathsList.add(imagePaths[i]);

        }
        System.out.println(imagePathsList);
        return imagePathsList;

    }
}
