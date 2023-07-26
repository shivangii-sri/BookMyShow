package com.bookmyshow.entity.common;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.Instant;

@Data
@NoArgsConstructor
@MappedSuperclass
@Access(AccessType.FIELD)
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @CreatedDate
    @Column(name = "created_at" , updatable = false)
    private Instant createdAt;

    @LastModifiedDate
    @Column(name = "created_at" , updatable = false)
    private Instant updatedAt;

    @Column(name = "version")
    private Integer version = 0;

    @Column(name = "deleted_at")
    private Instant deletedAt;

    @PrePersist
    public void onPrePersist(){
        createdAt = Instant.now();
        updatedAt = Instant.now();
    }

    @PreUpdate
    public void onPreUpdate(){
        updatedAt = Instant.now();
    }

}
