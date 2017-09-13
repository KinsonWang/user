package org.lanqiao.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.lanqiao.entity.User;
import org.lanqiao.service.RegisterService;
import org.lanqiao.service.ShowUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@Autowired
	ShowUserService showUserService;
	@Autowired
	RegisterService registerService;
	
	@RequestMapping("showUser")
	public String showUser(String p,Model model) {
		int pageSize = 2;
		int pageNum = (p == null) ? 1 : Integer.parseInt(p);
		int maxPage = showUserService.getMaxPage(pageSize);
		List<User> list = showUserService.getList(pageNum, pageSize);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("list", list);
		return "showList";
	}
	
	@RequestMapping("index")
	public String index(){
		return "register";
	}
	
	@RequestMapping("register")
	public String register(String username,String password,String birthday,String age,String mail){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("asda");
		}
		User user = new User(username,password,Integer.parseInt(age),mail,date);
		registerService.insertUser(user);
		return "redirect:showUser";
	}
	
	@RequestMapping("checkUserAjax")
	@ResponseBody
	public User checkUserAjax(String username){
		return registerService.checkUser(username);
	}

}
