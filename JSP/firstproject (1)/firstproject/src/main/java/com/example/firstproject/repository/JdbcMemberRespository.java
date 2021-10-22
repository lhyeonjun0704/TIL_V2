//package com.example.firstproject.repository;
//
//
//import com.example.firstproject.domain.Member;
//
//import javax.sql.DataSource;
//import java.util.List;
//import java.util.Optional;
//
//public class JdbcMemberRespository implements MemberRepository {
//
//    private final DataSource dataSource;
//
//    public JdbcMemberRespository(DataSource dataSource) {
//        this.dataSource = dataSource;
//
//    }
//
//
//    @Override
//    public Member save(Member member) {
//        return null;
//    }
//
//    @Override
//    public Optional<Member> findById(Long id) {
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<Member> findByName(String name) {
//        return Optional.empty();
//    }
//
//    @Override
//    public List<Member> findAll() {
//        return null;
//    }
//}
