package icu.agony.anyi.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author LiuYun
 * @version 1.0
 */
@Entity
@Table(name = "anyi_admin")
@Getter
@Setter
@ToString
public class AdminEntity {
    @Id
    @Column(length = 20)
    private String username;

    @NotNull
    private String password;
}
