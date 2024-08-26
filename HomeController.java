package users.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({"","/home"})
	public String home() {
		return "index";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	@GetMapping("/header")
	public String header() {
		return "header";
	}
   
	    @GetMapping("/course")
	    public String course() {
	        return "course";
	    }
	    @GetMapping("/aboutus")
	    public String aboutus() {
	        return "aboutus";
	    }
	    @GetMapping("/Student")
	    public String Student() {
	        return "Student";
	    }
	    @GetMapping("/Home")
	    public String Home() {
	        return "index";  
	    }       
	    @GetMapping("/history")
	    public String history() {
	        return "ReadMore/history";
	    }

	    @GetMapping("/polity")
	    public String polity() {
	        return "ReadMore/polity";
	        
	    }
	    @GetMapping("/hindi")
	    public String hindi() {
	        return "ReadMore/hindi";
	    }
	    @GetMapping("/economics")
	    public String economics() {
	        return "ReadMore/economics";
	    }
	    @GetMapping("/public administration")
	    public String publicadministration() {
	        return "ReadMore/public administration";
	    }
	    
	    @GetMapping("/chemistry")
	    public String chemistry() {
	        return "ReadMore/chemistry";
	    }
	    
	    @GetMapping("/physics")
	    public String physics() {
	        return "ReadMore/physics";
	    }
	    @GetMapping("/agriculture")
	    public String agriculture() {
	        return "ReadMore/agriculture";
	    }
	    
	    @GetMapping("/maths")
	    public String maths() {
	        return "ReadMore/maths";
	    }
	    @GetMapping("/biology")
	    public String biology() {
	        return "ReadMore/biology";
	    }
	    
	    
	    @GetMapping("/savecontct")
	    public String savecontact() {
	    	return "savecontact";
	    }
	    
	    	@GetMapping("/itimain")
	    	public String itimain() {
	    		return "ITI/itimain";
	    	}
	    		@GetMapping("/index")
	    		public String index() {
	    			return "index";
	    		}
	    		
	    		@GetMapping("/special")
	    		public String special() {
	    			return "ITI/special";
	    		}
	    		@GetMapping("/fitter")
	    		public String fitter() {
	    			return "ITI/all_trade/fitter/fitter";
	    		}

	    		@GetMapping("/take_quiz")
	    		public String take_quiz() {
	    			return "ITI/all_trade/fitter/take_quiz";
	    		}
	    		
	    				
	    		@GetMapping("/electronics")
	    		public String electronics() {
	    			return "ITI/all_trade/electronics/electronics";
	    		}
	    		@GetMapping("/test2")
	    		public String test2() {
	    			return "ITI/all_trade/electronics/test";
	    		}
	    		
	    		@GetMapping("/machinist")
	    		public String machinist() {
	    			return "ITI/all_trade/machinist/machinist";
	    		}
	    		@GetMapping("/electrician")
	    		public String electrician() {
	    			return "ITI/all_trade/electrician/electrician";
	    		}
	    		@GetMapping("/test")
	    		public String test1() {
	    			return "ITI/all_trade/electrician/test";
	    		}
	    		
	    		
	    		@GetMapping("/copa")
	    		public String copa() {
	    			return "ITI/all_trade/copa/copa";
	    		}
	    		@GetMapping("/copaquiz")
	    		public String copaquiz() {
	    			return "ITI/all_trade/copa/copaquiz";
	    		}
	    		
	    		@GetMapping("/networking")
	    		public String networking() {
	    			return "ITI/all_trade/Networking/networking";
	    		}
	    		@GetMapping("/welder")
	    		public String welder() {
	    			return "ITI/all_trade/welder/welder";
	    		}
	    		@GetMapping("/test4")
	    		public String test4() {
	    			return "ITI/all_trade/welder/test";
	    		}
	    		@GetMapping("/tarner")
	    		public String tarner() {
	    			return "ITI/all_trade/tarner/tarner";
	    		}
	    		@GetMapping("/test3")
	    		public String test3() {
	    			return "ITI/all_trade/tarner/test";
	    		}
	    		@GetMapping("/beautician")
	    		public String beautician() {
	    			return "ITI/all_trade/beautician/beautician";
	    		}
	    		@GetMapping("/carpenter")
	    		public String carpenter() {
	    			return "ITI/all_trade/carpenter/carpenter";
	    		}
	    		
	    @GetMapping("/Back to Topics")
	    public String BacktoTopics() {
	    return "ITI/itimain";
	    }
	    @GetMapping("/web_design")
	    public String web_design() {
	    return "IT_Topics/web_design";
	    }	
	    @GetMapping("/aws")
	    public String aws() {
	    return "IT_Topics/aws";
	    }	
	    @GetMapping("/python")
	    public String python() {
	    return "IT_Topics/python";
	    }
	    @GetMapping("/java")
	    public String java() {
	    return "IT_Topics/java";
	    }
	    @GetMapping("/php")
	    public String php() {
	    return "IT_Topics/php";
	    }
	    @GetMapping("/mysql")
	    public String mysql() {
	    return "IT_Topics/mysql";
	    }
	    @GetMapping("/excel")
	    public String excel() {
	    return "IT_Topics/excel";
	    }
	    
	    @GetMapping("/GovtMain")
	    public String GovtMain() {
	    return "govtmain";
	    }
	    @GetMapping("/UPSC_Civil_Services")
	    public String UPSC_Civil_Services() {
	    return "Govt.html/upsc_explore";
	    }
	    @GetMapping("/Banking_Exams_Preparation")
	    public String Banking_Exams_Preparation() {
	    return "Govt.html/bank_explore";
	    }
	    @GetMapping("/SSC_Exam_Preparation")
	    public String SSC_Exam_Preparation() {
	    return "Govt.html/ssc_explore";
	    }
	    @GetMapping("/Railways_Exam_Preparation")
	    public String Railways_Exam_Preparation() {
	    return "Govt.html/rail_explore";
	    }
	    @GetMapping("/State_PCS_Exam_Preparation")
	    public String State_PCS_Exam_Preparation() {
	    return "Govt.html/spcs_explore";
	    }
	    @GetMapping("/Defence_Exam_Preparation")
	    public String Defence_Exam_Preparation() {
	    return "Govt.html/defence_explore";
	    }
	}
	
	

