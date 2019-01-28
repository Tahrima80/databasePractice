package com.database.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@NonNull
	int Employee_ID;
	@NonNull
	String Employee_Name;
	@NonNull
	int Employee_Salary;
	@NonNull
	String Employee_Country;
	@NonNull
	String Employee_City;
	@NonNull
	String Employee_ZipCode;

	

}
