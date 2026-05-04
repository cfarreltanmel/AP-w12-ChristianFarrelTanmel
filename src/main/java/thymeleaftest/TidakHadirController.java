package thymeleaftest;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(path="/TidakHadir")
public class TidakHadirController {
    @Autowired
    private TidakHadirRepo TidakHadirRepo;

    @GetMapping("/SetNamaTidakHadir")
    public @ResponseBody String addNewTidakHadir(@RequestParam String NamaTidakHadir) {
        TidakHadir ListTidakHadir = new TidakHadir();
        ListTidakHadir.setNamaTidakHadir(NamaTidakHadir);
        TidakHadirRepo.save(ListTidakHadir);
        return "Saved";
    }

    @GetMapping("/DeleteNamaTidakHadir")
    public @ResponseBody String deleteTidakHadir(@RequestParam Integer id) {
        TidakHadirRepo.deleteById(id);
        return "Deleted";
    }
}

