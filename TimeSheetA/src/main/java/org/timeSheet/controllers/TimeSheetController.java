package org.timeSheet.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.timeSheet.ViewModels.TimeSheetViewModel;

@Controller
public class TimeSheetController {

	@GetMapping("/timesheet")
	public String tisheet(Model model) {
		

 
		return "views/timesheet";
	}

	@PostMapping("/timesheet")
	public String saveOrUpdate(List<TimeSheetViewModel> model) {

		return "views/timesheet";
	}

}
