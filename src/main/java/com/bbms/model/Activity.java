package com.bbms.model;


import com.bbms.dto.TaskDto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Activity {

	private Long id;
	private String name;
	private boolean isChecked;
	private TaskDto task;
	
}
