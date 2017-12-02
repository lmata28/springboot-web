package pe.edu.tecsup.springmvc.controller.showcases;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("model")
public class ModelController {

    @RequestMapping("simple")
    public String simple(Model model) {

        model.addAttribute("title", "Este es el titulo");
        model.addAttribute("mensaje", "Uso de Model de forma Simple jejeje");
        return "model/model";
    }

    @RequestMapping("complex")
    public ModelAndView complex() {

        Map<String, String> model = new HashMap();
        model.put("titulo", "Simple Model");
        model.put("mensaje", "Uso de Model de forma Complicada");
        return new ModelAndView("model/model", model);
    }

    @ModelAttribute
    public void elementos(Model model) {
        model.addAttribute("tituloEspecial", "Model Attribute");
        model.addAttribute("mensajeEspecial", "Prueba de Model Attribute Variable local");
    }

    @RequestMapping("modelattribute")
    public String modelattribute() {
        return "model/modelattribute";
    }
}
