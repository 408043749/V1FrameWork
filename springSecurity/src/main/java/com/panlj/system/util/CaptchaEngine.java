package com.panlj.system.util;
import java.awt.Color;
import java.awt.Font;
import java.awt.image.ImageFilter;

import com.octo.captcha.component.image.backgroundgenerator.BackgroundGenerator;
import com.octo.captcha.component.image.backgroundgenerator.FileReaderRandomBackgroundGenerator;
import com.octo.captcha.component.image.color.RandomListColorGenerator;
import com.octo.captcha.component.image.deformation.ImageDeformation;
import com.octo.captcha.component.image.deformation.ImageDeformationByFilters;
import com.octo.captcha.component.image.fontgenerator.FontGenerator;
import com.octo.captcha.component.image.fontgenerator.RandomFontGenerator;
import com.octo.captcha.component.image.textpaster.DecoratedRandomTextPaster;
import com.octo.captcha.component.image.textpaster.TextPaster;
import com.octo.captcha.component.image.textpaster.textdecorator.TextDecorator;
import com.octo.captcha.component.image.wordtoimage.DeformedComposedWordToImage;
import com.octo.captcha.component.image.wordtoimage.WordToImage;
import com.octo.captcha.component.word.FileDictionary;
import com.octo.captcha.component.word.wordgenerator.ComposeDictionaryWordGenerator;
import com.octo.captcha.component.word.wordgenerator.WordGenerator;
import com.octo.captcha.engine.image.ListImageCaptchaEngine;
import com.octo.captcha.image.gimpy.GimpyFactory;


/**
 * 【作者】 		panlj
 * 【创建日期 】 2013-6-16 下午4:08:39
 * 【更新时间 】 
 * 【更新者 】 
 * 【标签】   	
 * 【说明】	验证码引擎
 */
public class CaptchaEngine extends ListImageCaptchaEngine {

	@Override
	protected void buildInitialFactories() {
        int minWordLength = 4;  
        int maxWordLength = 5;  
        int fontSize = 75;  
        int imageWidth = 250;  
        int imageHeight = 100;  
        String imagePath = "./com/panlj/system/image/";
  
        //word generator  
        WordGenerator dictionnaryWords = new ComposeDictionaryWordGenerator(new FileDictionary("toddlist"));  
  
        //word2image components  
        TextPaster randomPaster = new DecoratedRandomTextPaster(minWordLength, maxWordLength,  
                new RandomListColorGenerator(new Color[] {
                		new Color(23, 170, 27), 
                		new Color(220, 34, 11),  
                        new Color(23, 67, 172), 
                        new Color(243, 226, 226),
                        new Color(8, 223, 223),
                        new Color(99, 248, 28),
                        new Color(10, 146, 253),
                        new Color(3, 16, 26),
                        
                		}), new TextDecorator[] {});  
        BackgroundGenerator background = new FileReaderRandomBackgroundGenerator(imageWidth, imageHeight, imagePath);  
        FontGenerator font = new RandomFontGenerator(fontSize, fontSize, new Font[] {  
                new Font("nyala", Font.BOLD, fontSize), new Font("Bell MT", Font.PLAIN, fontSize),  
                new Font("Credit valley", Font.BOLD, fontSize) });  
  
        ImageDeformation postDef = new ImageDeformationByFilters(new ImageFilter[] {});  
        ImageDeformation backDef = new ImageDeformationByFilters(new ImageFilter[] {});  
        ImageDeformation textDef = new ImageDeformationByFilters(new ImageFilter[] {});  
  
        WordToImage word2image = new DeformedComposedWordToImage(font, background, randomPaster, backDef, textDef,  
                postDef);  
        addFactory(new GimpyFactory(dictionnaryWords, word2image));  
	}
	
	public static void main(String[] args) {
		new CaptchaEngine();
	}

}
