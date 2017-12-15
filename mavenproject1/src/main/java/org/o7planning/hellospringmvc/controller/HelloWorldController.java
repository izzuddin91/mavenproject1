package org.o7planning.hellospringmvc.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

        private static final Logger LOG = Logger.getLogger(HelloWorldController.class.getName());
    
    
	@RequestMapping("/")
	public String hello(Model model) {
		
		
		System.out.println("asdasdas");
                LOG.info("adadsfldjf");
                String string = "";
                
                try{
                    
                 Process q = Runtime.getRuntime().exec("/usr/bin/python  /Users/LTEIBCE51055E/Desktop/hello_worldsss.py");
//                  Process q = Runtime.getRuntime().exec("/usr/bin/python /root/izzuddin/helloWorldSSS.py");
                    final int exitVal = q.waitFor();
                    BufferedReader stdInput = new BufferedReader(new InputStreamReader(q.getInputStream()));
      
                    string = stdInput.readLine();
                    
                }catch (Exception e){
                    string = e.getLocalizedMessage();
                }   
                
                model.addAttribute("greeting", string);
                
		return "helloworld";
		
	}
        
        
	@RequestMapping("/hello2" )
	public String hello2(Model model2, @RequestParam("no_of_motor_claims") Integer no_of_motor_claims,
        
        @RequestParam("no_of_windscreen_claims") Integer no_of_windscreen_claims,
        @RequestParam("ws_sum_insured") String ws_sum_insured,
        @RequestParam("market_price_for_ws_parts") String market_price_for_ws_parts,
        @RequestParam("type") String type,
        @RequestParam("date_of_accident") String date_of_accident,
        @RequestParam("date_of_policy_effective") String date_of_policy_effective,
        @RequestParam("date_of_expiry") String date_of_expiry,   
        @RequestParam("date_of_notification") String date_of_notification,
        @RequestParam("workshop_registered_state") String workshop_registered_state,
        @RequestParam("policy_holder_registered_state") String policy_holder_registered_state,        
        @RequestParam("accident_state") String accident_state  
                
                
        ) {
		
//		model2.addAttribute("greeting", "Helloddsad Spring MVC");
		System.out.println("asdasdas");
                
                
                
                Integer newNumber = no_of_motor_claims / no_of_windscreen_claims;
                model2.addAttribute("greeting", newNumber);
                
                if ( newNumber > 10){
                    model2.addAttribute("result", "score more than 5. manual process");
                }else{
                    model2.addAttribute("result", "score less than 5. auto process");
                }
                
//                model2.addAttribute("greeting2", no_of_windscreen_claims);
//                model2.addAttribute("greeting3", ws_sum_insured);
//                model2.addAttribute("greeting4", market_price_for_ws_parts);
		return "hello2";
		
	}        
        
        
        

}