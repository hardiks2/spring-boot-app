package hello;

import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(Model model) {
       // return "<html><head><meta charset='UTF-8'><title>Birthday </title><meta name='viewport' content='width=device-width, initial-scale=1'></head><body><marquee><h1 style='font-size:5vw;'>HAPPY BIRTHDAY HARDIK</h1></marquee></body></html>";
       model.addAttribute("homepage");
        return "home";
    }

    @RequestMapping("/home")
    public String index1(@RequestParam(value="name") String name) {
        System.out.println("Name : "+name);

        LocalTime time = LocalTime.now();
     System.out.println("Current time of the day: " + time);

   Calendar cal = Calendar.getInstance();
   cal.add(Calendar.HOUR_OF_DAY, 5);
   cal.add(Calendar.MINUTE, 30);


        Date date=cal.getTime();
        DateFormat dateFormat = new SimpleDateFormat("HH");
     System.out.println("Current time now: "+ date);
        String formattedDate=dateFormat.format(date);
        System.out.println("Current time of the day using Calendar - 24 hour format: "+ formattedDate);
       if(Integer.valueOf(formattedDate) >= 0 && Integer.valueOf(formattedDate) < 12){
           return "Good Morning! " + name+ " !!!";
       }else if(Integer.valueOf(formattedDate) >= 12 && Integer.valueOf(formattedDate) < 16){
           return "Good Afternoon!!!! " + name+ " !!!";
       }else if(Integer.valueOf(formattedDate) >= 16 && Integer.valueOf(formattedDate) < 21){
           return "Good Evening! " + name+ " !!!";
       }else if(Integer.valueOf(formattedDate) >= 21 && Integer.valueOf(formattedDate) < 24){
           return "Good Night! " + name+ " !!!";
       }
        else{
           return "Hello " +name+ " you are in Space";
       }
    }

}
