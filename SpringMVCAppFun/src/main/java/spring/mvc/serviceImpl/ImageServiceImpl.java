package spring.mvc.serviceImpl;

import java.io.File;
import java.util.*;

import org.springframework.stereotype.Service;
import spring.mvc.service.ImageService;

@Service("imageService")
public class ImageServiceImpl implements ImageService {

    public ArrayList<String> getAllImagesAsString() {
        String[] imagePaths = {"/jenapp/resources/images/ignis.png",
                "/jenapp/resources/images/noct.png", "/jenapp/resources/images/gladio.png",
                "/jenapp/resources/images/prompto.png", "/jenapp/resources/images/Ardyn.jpg",
                "/jenapp/resources/images/gladio.png", "/jenapp/resources/images/Ignis.jpg",
                "/jenapp/resources/images/ignis2.jpg", "/jenapp/resources/images/lunie.jpg",
                "/jenapp/resources/images/noctbattle.jpg", "/jenapp/resources/images/noctgladio.jpg",
                "/jenapp/resources/images/lunanoct.jpg", "/jenapp/resources/images/noctprompto.png",
                "/jenapp/resources/images/regis.jpg", "/jenapp/resources/images/guysBattlePrep.jpg",
                "/jenapp/resources/images/guysSelfie.jpg", "/jenapp/resources/images/Ignis.jpg",
                "/jenapp/resources/images/ignis.png", "/jenapp/resources/images/ignis2.jpg",
                "/jenapp/resources/images/iris.png", "/jenapp/resources/images/iris2.jpg",
                "/jenapp/resources/images/blueMagicNoct.jpg", "/jenapp/resources/images/chocoboandguys.jpg",
                "/jenapp/resources/images/lunie.jpg", "/jenapp/resources/images/noct2.png",
                "/jenapp/resources/images/noctandregis.jpg", "/jenapp/resources/images/noctandregis2.jpg",
                "/jenapp/resources/images/noctbattle.jpg", "/jenapp/resources/images/noctgladio.jpg",
                "/jenapp/resources/images/noctprompto.png", "/jenapp/resources/images/noctsummon.png",
                "/jenapp/resources/images/oldNoct.jpg"};

        System.out.println(Arrays.asList(imagePaths).toString());

        ArrayList<String> imagePathsList = new ArrayList<String>();

        for (int i = 0; i < imagePaths.length; i++) {
            imagePathsList.add(imagePaths[i]);

        }
        System.out.println(imagePathsList);
        return imagePathsList;

    }
}
