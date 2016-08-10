package com.springMvc.login;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.springMvc.shopping.ProductBean;
import com.springMvc.shopping.ProductDetails;

@Controller
public class LoginController {

	@Autowired
	LoginBean loginBean;
	@Autowired
	LoginValidator loginValidator;
	

	
	@RequestMapping(value="/login",method = RequestMethod.GET)
    public String init(Model model) {
		//model.addAttribute("message","Please enter following details");
		model.addAttribute("LoginBean", new LoginBean());
	    return "login";
    }
//	@InitBinder
//	private void initBinder(WebDataBinder binder){
//		binder.setValidator(loginValidator);
//	}
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean , BindingResult result) {
		loginValidator.validate(loginBean, result);

		if(result.hasErrors()) return "login";
		else
			{
			model.addAttribute("message","Online shopping");
			model.addAttribute("ProductBean",new ProductBean());
			return "success";
			}
		 }
	
	
	 @ModelAttribute("itemlist")
	 public List<ProductDetails> populateWebFrameworkList() {

	
		List<ProductDetails> itemlist=new ArrayList<ProductDetails>();
		
		itemlist.add(new ProductDetails("Mobile Phone",20000.0,"white",1,5));
		itemlist.add(new ProductDetails("Laptop",40000.0,"black",1,4));
		itemlist.add(new ProductDetails("Television",70000.0,"black",1,4));
		itemlist.add(new ProductDetails("Tablet",10000.0,"black",1,3));
		itemlist.add(new ProductDetails("pendrive",400.0,"black",1,2));
		
	 	
	 	return itemlist;
	 }

}
