package com.spring.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.PhotoBean;
import com.spring.repository.PhotoRepo;

@Controller
public class PhotoController {
	 @GetMapping("/photo")
	  public ModelAndView go() {
	    PhotoBean photobean=new PhotoBean();
	    return new ModelAndView("photo","Photo",photobean);
	  }
	  
	  @PostMapping("/viewphoto")
	  public String addAndRead(@ModelAttribute  PhotoBean bean,Model model) throws IOException, SQLException {
	    byte[] photoByte=bean.getFile().getBytes();
	    PhotoRepo repo=new PhotoRepo();
	    int i=repo.addPhoto(photoByte);
	    if(i>0) {
	      System.out.println("Add photo success");
	    }else {
	      System.out.println("Add photo faile");
	    }
	    PhotoBean bean2=repo.viewPhoto();
	    model.addAttribute("PhotoBean", bean2);
	    return "viewphoto";
	  }
	  @RequestMapping(value="/home",method=RequestMethod.GET)
	  public String showTest() {
	  return "hi";
	
	  }
}
