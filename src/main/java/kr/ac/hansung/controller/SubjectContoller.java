package kr.ac.hansung.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Subject;
import kr.ac.hansung.service.SubjectService;

@Controller
public class SubjectContoller {
	
	@Autowired
	private SubjectService subjectService;

	@RequestMapping("/subjects20161")
	public String showSubjects20161(Model model) {
		List<Subject> subjects = subjectService.getCurrent("2016","1");
		int total=0;
		for(Subject s : subjects) {
			total+=Integer.parseInt(s.getCredit());
		}
		model.addAttribute("totalCredit", total);
		model.addAttribute("subjects", subjects);
		
		return "subjects";
	}
	
	@RequestMapping("/subjects20162")
	public String showSubjects20162(Model model) {
		List<Subject> subjects = subjectService.getCurrent("2016","2");
		int total=0;
		for(Subject s : subjects) {
			total+=Integer.parseInt(s.getCredit());
		}
		model.addAttribute("totalCredit", total);
		model.addAttribute("subjects", subjects);
		
		return "subjects";
	}
	
	@RequestMapping("/subjects20171")
	public String showSubjects20171(Model model) {
		List<Subject> subjects = subjectService.getCurrent("2017","1");
		int total=0;
		for(Subject s : subjects) {
			total+=Integer.parseInt(s.getCredit());
		}
		model.addAttribute("totalCredit", total);
		model.addAttribute("subjects", subjects);
		
		return "subjects";
	}
	
	@RequestMapping("/subjects20172")
	public String showSubjects20172(Model model) {
		List<Subject> subjects = subjectService.getCurrent("2017","2");
		model.addAttribute("subjects", subjects);
		int total=0;
		for(Subject s : subjects) {
			total+=Integer.parseInt(s.getCredit());
		}
		model.addAttribute("totalCredit", total);
		return "subjects";
	}
	
	@RequestMapping("/subjects20181")
	public String showSubjects20181(Model model) {
		List<Subject> subjects = subjectService.getCurrent("2018","1");
		model.addAttribute("subjects", subjects);
		int total=0;
		for(Subject s : subjects) {
			total+=Integer.parseInt(s.getCredit());
		}
		model.addAttribute("totalCredit", total);
		return "subjects";
	}
	
	@RequestMapping("/subjects20182")
	public String showSubjects20182(Model model) {
		List<Subject> subjects = subjectService.getCurrent("2018","2");
		model.addAttribute("subjects", subjects);
		int total=0;
		for(Subject s : subjects) {
			total+=Integer.parseInt(s.getCredit());
		}
		model.addAttribute("totalCredit", total);
		return "subjects";
	}
	
	@RequestMapping("/subjects20191")
	public String showSubjects20191(Model model) {
		List<Subject> subjects = subjectService.getCurrent("2019","1");
		model.addAttribute("subjects", subjects);
		int total=0;
		for(Subject s : subjects) {
			total+=Integer.parseInt(s.getCredit());
		}
		model.addAttribute("totalCredit", total);
		return "subjects";
	}
	
	@RequestMapping("/createsubject")
	public String createOffer(Model model) {
		model.addAttribute("subject", new Subject());
		return "createsubject";
	}
	
	//DataBinding의 예: WebForm에서 입력받은 Subject가 착착착 입력됨
	@RequestMapping("/docreate")
	public String doCreate(Model model, @Valid Subject subject, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("===Form data does not validated");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error:errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "createsubject";
		}
		
		subjectService.insert(subject);
		return "subjectcreated";
	}
	
	@RequestMapping("/subjectsmenu")
	public String showSubjectMenu(Model model) {
		List<Integer> totals= new ArrayList<>();
		
		List<Subject> subjects = subjectService.getCurrent("2016","1");
		int total=0;
		for(Subject s : subjects) {
			total+=Integer.parseInt(s.getCredit());
		}
		totals.add(total);
		
		subjects.clear();
		subjects = subjectService.getCurrent("2016","2");
		total=0;
		for(Subject s : subjects) {
			total+=Integer.parseInt(s.getCredit());
		}
		totals.add(total);
		
		subjects.clear();
		subjects = subjectService.getCurrent("2017","1");
		total=0;
		for(Subject s : subjects) {
			total+=Integer.parseInt(s.getCredit());
		}
		totals.add(total);
		
		subjects.clear();
		subjects = subjectService.getCurrent("2017","2");
		total=0;
		for(Subject s : subjects) {
			total+=Integer.parseInt(s.getCredit());
		}
		totals.add(total);
		
		subjects.clear();
		subjects = subjectService.getCurrent("2018","1");
		total=0;
		for(Subject s : subjects) {
			total+=Integer.parseInt(s.getCredit());
		}
		totals.add(total);
		
		subjects.clear();
		subjects = subjectService.getCurrent("2018","2");
		total=0;
		for(Subject s : subjects) {
			total+=Integer.parseInt(s.getCredit());
		}
		totals.add(total);
		
		model.addAttribute("totals", totals);
		return "subjectsmenu";
	}
	
	
}
