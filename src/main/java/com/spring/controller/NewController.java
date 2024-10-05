package com.spring.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.UserBean;
import com.spring.repository.LinkConnection;
import com.spring.repository.img;

@Controller
public class NewController<Img> {
	
	@RequestMapping(path = "/show",method = RequestMethod.GET)
	public String show() {
		return "redirect:index";
	}
	
	@GetMapping(value="/index1")
	public String showIndex(Model m) {
	m.addAttribute("msg","Spring MVC");
		return "index1";
	}
	
	@GetMapping(value="/showuserform")
	public ModelAndView showUser() {
		UserBean obj = new UserBean();
		obj.setGender("male");
		ModelAndView mv = new  ModelAndView("user","userObj",obj);
		return mv;
	}
	
	@PostMapping(value="/adduser")
	public  String addUser(Model m,@Validated @ModelAttribute("userObj")UserBean obj,BindingResult br) {
		
		if(br.hasErrors()) {
			return "user";
			
			
		}
		
		m.addAttribute("user", obj);
		return "userview";
	}
	@ModelAttribute("frameworks")
	public List<String> addFrameworks(){
		
		List<String> frameworks = new ArrayList<String>();
		frameworks.add("Spring");
		frameworks.add("JPA");
		frameworks.add("Hibernate");
		return frameworks;
		
	}
	
	
	@ModelAttribute("numList")
	
	public List<Integer>  addNumbers(){
		
		List<Integer> number = new ArrayList<Integer>();
		number.add(1);
		number.add(2);
		number.add(3);
		return number;
		
	}
	
	@ModelAttribute("list")
	public Map<String,String> countryList(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("US","United States");
		map.put("Jp","Japan");
		map.put("Sg","Singpore");
		return map;
	}	
	 @RequestMapping(value="/hi",method=RequestMethod.GET)
	    public String hi(OutputStream outputStream,HttpServletRequest request,HttpServletResponse response) throws SQLException, IOException {
	    img img = new img();
	          Blob blob = img.getimg(); // Fetch the blob from your database
	          if (blob != null) {
	              byte[] imageBytes = blob.getBytes(1, (int) blob.length());
//	              try {
	          outputStream.write(imageBytes);
//	        } catch (IOException e) {
//	          // TODO Auto-generated catch block
//	          e.printStackTrace();
//	        }
	             request.setAttribute("img", imageBytes);
//	              System.out.println("hi");
//	              response.setContentType("text/html");
	          }else {
	            System.out.println("No data");
	          }
	      return "index";
	    }
	

}
