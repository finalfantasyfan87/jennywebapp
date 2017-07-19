package spring.mvc.functional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import spring.mvc.service.ImageService;

import java.util.Collections;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfig.class })
@WebAppConfiguration
public class JenServiceTest {

	@Autowired
	ImageService imageService;

	@Test
	public void testGetAllImagesSize() {
		Assert.assertEquals(32, imageService.getAllImagesAsString().size());
	}

//	@Test
//	public void testGetAllImageSort() {
//		Collections.sort(imageService.getAllImagesAsString());
//		assertTrue(imageService.getAllImagesAsString().get(0).contains("Ar"));
//
//	}
}
