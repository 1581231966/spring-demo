package com.terence.springdemo.entities;


import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Document(indexName = "terence", type = "user")
public class BaseUser {

	@Id
	private String name;

	private String sex;

	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "BaseUser{" +
				"name='" + this.name + '\'' +
				", sex='" + this.sex + '\'' +
				", age='" + this.age + '\'' +
				'}';
	}
}
