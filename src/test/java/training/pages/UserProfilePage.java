package training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import training.base.BasePage;

public class UserProfilePage extends BasePage {

	public UserProfilePage(WebDriver driver) {
		super(driver);
		
		addElement("userprofile", By.xpath("//span[@id='interiorBreadcrumbNode0']/a"));
		addElement("editProfileicon", By.xpath("//a[@class='contactInfoLaunch editLink']"));
		addElement("aboutcontactframe", By.id("contactInfoContentId"));
		addElement("abouttab", By.xpath("//li[@id='aboutTab']/a"));
		addElement("lastname", By.id("lastName"));
		addElement("saveall", By.xpath("//input[@value='Save All']"));
		addElement("post", By.id("publisherAttachTextPost"));
		addElement("postframe", By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		addElement("postcontent", By.xpath("//body[contains(text(),'Share an update')]"));
		addElement("share", By.id("publishersharebutton"));
		addElement("postedfeed", By.xpath("//span[@class='feeditemtext cxfeeditemtext']/p"));
		addElement("file", By.id("publisherAttachContentPost"));
		addElement("uploadfile", By.id("hiddenFileBtn"));
		addElement("choosefilepath", By.id("chatterFile"));
		addElement("uploadedfile", By.xpath("//div[@class='contentFileTitle']/a/span"));
		addElement("profilephoto", By.className("chatter-photo"));
		addElement("addphoto", By.id("uploadLink"));
		addElement("photocontentframe", By.id("uploadPhotoContentId"));
		addElement("profilephotopath", By.className("fileInput"));
		addElement("save", By.id("j_id0:uploadFileForm:uploadBtn"));
		addElement("photocroparea", By.className("imgCrop_selArea"));
		addElement("saveimage", By.id("j_id0:j_id7:save"));
		addElement("profilename", By.id("tailBreadcrumbNode"));
		
	}
	
}

