package com.springMvc.shopping;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CartController {
	@Autowired
	ProductBean productbean;
	
	//@Autowired
	ProductDetails productdetails;
	
	@RequestMapping(value="/products",method = RequestMethod.POST)
	public String selectedProductsubmit(Model model, @ModelAttribute("ProductBean") ProductBean productBean) {
		
		List<String> itemlist=productBean.getProducts();
		 model.addAttribute("list",productBean.getProducts());
		 return "products";
		}
	
	@RequestMapping(value="/removecart",method = RequestMethod.POST)
	public String addToCartProduct(Model model, @ModelAttribute("ProductBean") ProductBean productBean){
		
		List<String> itemlist=productBean.getProducts();
		
		
		model.addAttribute("finalList", itemlist);
		return "cart";
	}
	
}
