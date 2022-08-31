package com.ll.exam.qsl.user.repository;

import com.ll.exam.qsl.user.entity.QSiteUser;
import com.ll.exam.qsl.user.entity.SiteUser;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;
    @Override
    public SiteUser getQslUser(Long id) {
        return jpaQueryFactory
                .select(QSiteUser.siteUser)
                .from(QSiteUser.siteUser)
                .where(QSiteUser.siteUser.id.eq(id))
                .fetchOne();
    }
}
