package kr.ac.hansung.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString

public class Subject {
		
		private String year;
		
		private String semester;
		@NotEmpty(message="The code cannot be empty")
		private String code;
		@NotEmpty(message="The name cannot be empty")
		private String name;
		@NotEmpty(message="The division cannot be empty")
		private String division;
		@NotEmpty(message="The credit cannot be empty")
		private String credit;
		
}
