package com.app.topdoc.pojo.doctorPojo;

import java.util.Date;

import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AwardsAndPublicationsRM {

	@Field(type = FieldType.Text, name = "awardName")
	private String awardName;

	@Field(type = FieldType.Date, format = DateFormat.basic_date, name = "date")
	private Date date;

	@Field(type = FieldType.Text, name = "place")
	private String place;
}
