package rs.drVladimir.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController
{
    @GetMapping
    public String defaultView()
    {
        return "index";
    }

    @GetMapping("/about")
    public String aboutView()
    {
        return "about";
    }

    @GetMapping("/services")
    public String servicesView()
    {
        return "services";
    }

    @GetMapping("/contact")
    public String contactView()
    {
        return "contact";
    }

    @GetMapping("/experience")
    public String experienceView()
    {
        return "experience";
    }

    @GetMapping("/equipment")
    public String equipmentView()
    {
        return "equipment";
    }
}
