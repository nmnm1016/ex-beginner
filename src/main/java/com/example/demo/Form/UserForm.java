package com.example.demo.Form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UserForm {

	@NotBlank(message = "名前は必須です")
	private String name;
	@NotBlank(message = "年齢は必須です")
	@Pattern(regexp = "^[0-9]+$", message = "数値を入力してください")
	private String age;
	@NotBlank(message = "コメントは必須です")
	private String comment;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public int getIntAge() {
		return Integer.parseInt(age);
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "UserForm [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}

}
