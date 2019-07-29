package com.example.login.app.login;

import java.util.Collection;

import javax.inject.Inject;
import javax.validation.Valid;

import com.github.dozermapper.core.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.terasoluna.gfw.common.exception.BusinessException;
import org.terasoluna.gfw.common.message.ResultMessage;
import org.terasoluna.gfw.common.message.ResultMessages;

import com.example.login.domain.model.User;
import com.example.login.domain.service.login.UserService;




@Controller
@RequestMapping("login")
public class LoginController {
	
	@Inject
	Mapper beanMapper; 
	
	@Inject
	UserService userService;
	
	@ModelAttribute 
	public LoginForm setUpForm() {
		LoginForm form = new LoginForm();
		return form;
	}
	
	@GetMapping("create")
	public String create(Model model) {
		return "login/create"; 
	}
	
    @PostMapping("create")
    public String create(@Valid LoginForm loginForm, BindingResult bindingResult,
            Model model, RedirectAttributes attributes) {

        if (bindingResult.hasErrors()) {
            return create(model);
        }

        User user = beanMapper.map(loginForm, User.class);

        try {
            userService.create(user);
        } catch (BusinessException e) {
            model.addAttribute(e.getResultMessages());
            return create(model);
        }

        attributes.addFlashAttribute(ResultMessages.success().add(
                ResultMessage.fromText("Created successfully!")));
        return "redirect:/login/create";
    }
	

}
