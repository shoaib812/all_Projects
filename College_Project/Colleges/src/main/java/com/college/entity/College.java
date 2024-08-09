package com.college.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "College")
public class College {

    @Id
    @Column(name = "collegeId")
    private String collegeId;

    @Column(name = "collegeName")
    private String collegeName;

    @Column(name = "collegeAddress")
    private String collegeAddress;
}
