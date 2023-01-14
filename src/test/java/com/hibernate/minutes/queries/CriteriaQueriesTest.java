package com.hibernate.minutes.queries;

public class CriteriaQueriesTest 
{

/* JPQL 
 * "Select c from Course c"
 * 
 * Criteria Query (5 steps)
 * 
 * 1. Use criteria Builder -> returning the expected result
 * 
 * CriteriaBuilder cb = em.getCriteriaBuilder();
 * CriteriaQuery<Course> cq = cb.createQuery(Course.class);  //Expected result -> Course.class
 * 
 * 2. Define roots for tables which are invloved in query
 * 
 * Root<Course> courseRoot = cq.from(Course.class);
 * 
 * 3. Define Predicates etc using cb
 * 
 * 4. Add Predicates etc using cq
 * 
 * 5. TypedQuery<Course> course = em.createQuery
 *                      (cq.select (courseRoot));
 *                      
 *   List<Course> resultList = query.getResultList();
 *   logger.info("", resultList);
 */
}
