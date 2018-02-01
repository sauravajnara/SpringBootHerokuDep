import  org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
public class Demo
{
	
	@RequestMapping("/")
    String home()
	{
		return "Hello to GitHub with Heroku !";
	}
	
	public static void main(String [] args)throws Exception
	{
		SpringApplication.run(Demo.class,args);
	}
	
}
