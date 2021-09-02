package com.clicker.counter.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;


@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Entity
public class Clicker extends BaseEntity {
}
