package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ToasterController {

	@RequestMapping(path="/toaster")						// says map this method to the path com.techelevator.toaster
	public String index(ModelMap modelHolder) {				// ModelMap allows us to reutrn data to our JSP
		//ToasterDAO = new JDBCToasterDAO(); 				// <--This would be if we were pulling from a database
		List<ToasterModel> toasters = new ArrayList<>();
		
		toasters.add(new ToasterModel(2, "Oster", new BigDecimal("28.99")));
		toasters.add(new ToasterModel(2, "Amazon Basic", new BigDecimal("22.99")));
		toasters.add(new ToasterModel(2, "Breville", new BigDecimal("177.49")));
		toasters.add(new ToasterModel(2, "Smeg", new BigDecimal("159.99")));
		
		modelHolder.put("toasters", toasters);				// "toasters" is the key that will give arrayList in JSP
		
		
		
		return "index";  									// this says go to the index.jsp file
	}
	
}
