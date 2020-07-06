package com.vb.mini1.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contact")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "contactId")
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long contactPhone;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name = "creationDate", updatable = false)
	private Date creationDate;
	
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name = "updateDate", insertable = false)
	private Date updateDate;
}
