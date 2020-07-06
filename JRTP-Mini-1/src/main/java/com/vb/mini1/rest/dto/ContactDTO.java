package com.vb.mini1.rest.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ContactDTO {

	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long contactPhone;
	private Date creationDate;
	private Date updateDate;
}
