package pl.michalmarciniec.loyalty.domain.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "bonus_categories")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
public class BonusCategory extends BaseEntity {

    @Builder
    private BonusCategory(BonusCategoryName name, Permission permission, Long pointsLimit, Long limitPeriodInDays, Long editPeriodInHours) {
        this.name = name;
        this.permission = permission;
        this.pointsLimit = pointsLimit;
        this.limitPeriodInDays = limitPeriodInDays;
        this.editPeriodInHours = editPeriodInHours;
    }

    @Column(name = "name", nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    BonusCategoryName name;

    @ManyToOne
    @JoinColumn(name = "permission_id")
    Permission permission;

    @Column(name = "points_limit", nullable = false)
    Long pointsLimit;

    @Column(name = "limit_period", nullable = false)
    Long limitPeriodInDays;

    @Column(name = "edit_period", nullable = false)
    Long editPeriodInHours;
}