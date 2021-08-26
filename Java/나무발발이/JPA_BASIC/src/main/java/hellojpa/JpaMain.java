package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{
            Member member = new Member();

            member.setUsername("C");

            em.persist(member);

            tx.commit();
        } catch(Exception e){
            tx.rollback();
        } finally {
            em.close(); // entitymanager는 마지막에는 꼭 닫아줘야된다.
        }

//        try{


            // commit
//            Member findMember = em.find(Member.class, 1L); // JPA에서 Commit하는 시점에서 바로 업데이트 쿼리를 날려서 업데이트 해준다.
//            findMember.setName("HelloJPA");


            // modify
//            List<Member> result = em.createQuery("select m from Member as m", Member.class).getResultList();

//            for (Member member : result) {
//                System.out.println("member.name = " + member.getName());
//            }

            // 비영속
//            Member member = new Member();
//            member.setId(201L);
//            member.setName("HelloJPA");
//
//
//           // 영속(DB에 저장되지 않는다.)
//            System.out.println("============Before");
//            em.persist(member);
//
//            // 커밋 전에 미리 데이터베이스에 적용하고 싶을 때
//            em.flush(); // 강제로 플러시 호출출
//
//
//            // 준영속(컨텍스트 영속성에서 분리)
////            em.detach(member);
////            // 삭제
////            em.remove(member);
//            System.out.println("============After");
//
//            Member findMember = em.find(Member.class, 101L);
//
//
//            System.out.println("findMember.id = " + findMember.getId());
//            System.out.println("findMember.name = " +  findMember.getName());
//
//
//            tx.commit();
//        } catch(Exception e){
//            tx.rollback();
//        } finally {
//            em.close(); // entitymanager는 마지막에는 꼭 닫아줘야된다.
//        }

//        Member member = new Member();
//
//        member.setId(2L);
//        member.setName("HelloB");
//
//        em.persist(member);
//
//        tx.commit();
//
//        //code
//        em.close();

        emf.close();
    }

}
