package thymeleaftest;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(path="/Hadir")
public class HadirController {
    @Autowired
    private HadirRepo HadirRepo;

    @GetMapping("/SetNamaHadir")
    public @ResponseBody String addNewHadir(@RequestParam String NamaHadir) {
        Hadir ListHadir = new Hadir();
        ListHadir.setNamaHadir(NamaHadir);
        HadirRepo.save(ListHadir);
        return "Saved";
    }

    @GetMapping("/DeleteNamaHadir")
    public @ResponseBody String deleteHadir(@RequestParam Integer id) {
        HadirRepo.deleteById(id);
        return "Deleted";
    }
}
