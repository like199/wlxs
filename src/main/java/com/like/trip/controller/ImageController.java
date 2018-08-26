package com.like.trip.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.like.trip.mapper.ImageMapper;
import com.like.trip.model.Image;
import com.like.trip.util.MyFileUtils;


@RestController
@RequestMapping(value = "/image",produces = "application/json;charset=UTF-8")
public class ImageController{
	@Autowired
	private ImageMapper imageMapper;
	
	@Value("${image.dir}")
	private String imageDir;
	
	@RequestMapping(value="/upload")
	@ResponseBody
	public Image upload(@RequestParam("file") MultipartFile file){

		String fileName=MyFileUtils.getNewFileName(file.getOriginalFilename());
		String msg;
		
        if (MyFileUtils.upload(file, imageDir, fileName)){
        	 Image wxImage=new Image();
             wxImage.setUrl(fileName);
             wxImage.setCreateUser(1);
             wxImage.setName(file.getOriginalFilename());
             wxImage.setCreateDate(new Date());
             imageMapper.insert(wxImage);
             return wxImage;

        }
        else {
        	return null;
        }
    }

	/**
	 * 获取微信的openid
	 * @throws IOException 
	 */
	@RequestMapping("/getImage/{id}")
	
	public ResponseEntity getWxSessionKey(@PathVariable("id")String id) throws IOException {
		System.out.println("id=="+id);
		Image image=imageMapper.selectByPrimaryKey(Integer.valueOf(id));
		File file = new File(imageDir+"/"+image.getUrl());// 你放的文件路径 // new String("线上消费记录".getBytes("GBK"),"iso-8859-1")
		HttpHeaders headers = new HttpHeaders();// 设置一个head
		headers.setContentDispositionFormData("attachment", image.getUrl());// 文件的属性，也就是文件叫什么吧
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);// 内容是字节流
		
		return new ResponseEntity<byte[]>(MyFileUtils.readFileToByteArray(file), headers, HttpStatus.OK);
	}

		
}