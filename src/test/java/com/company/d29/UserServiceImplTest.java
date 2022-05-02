//package com.company.d29;
//
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.query.FluentQuery;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//
//class UserServiceImplTest {
//    private UserService testSubject;
//
//
//    @Test
//    void testCreate() {
//        testSubject = new UserServiceImpl(new UserRepository() {
//            @Override
//            public Optional<User> findById(Long aLong) {
//                return Optional.empty();
//            }
//
//            @Override
//            public Optional<User> findByUsername(String username) {
//                return Optional.empty();
//            }
//
//            @Override
//            public List<User> findAll() {
//                return null;
//            }
//
//            @Override
//            public List<User> findAll(Sort sort) {
//                return null;
//            }
//
//            @Override
//            public List<User> findAllById(Iterable<Long> longs) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> List<S> saveAll(Iterable<S> entities) {
//                return null;
//            }
//
//            @Override
//            public void flush() {
//
//            }
//
//            @Override
//            public <S extends User> S saveAndFlush(S entity) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
//                return null;
//            }
//
//            @Override
//            public void deleteAllInBatch(Iterable<User> entities) {
//
//            }
//
//            @Override
//            public void deleteAllByIdInBatch(Iterable<Long> longs) {
//
//            }
//
//            @Override
//            public void deleteAllInBatch() {
//
//            }
//
//            @Override
//            public User getOne(Long aLong) {
//                return null;
//            }
//
//            @Override
//            public User getById(Long aLong) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> List<S> findAll(Example<S> example) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
//                return null;
//            }
//
//            @Override
//            public Page<User> findAll(Pageable pageable) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> S save(S entity) {
//                return null;
//            }
//
//            @Override
//            public boolean existsById(Long aLong) {
//                return false;
//            }
//
//            @Override
//            public long count() {
//                return 0;
//            }
//
//            @Override
//            public void deleteById(Long aLong) {
//
//            }
//
//            @Override
//            public void delete(User entity) {
//
//            }
//
//            @Override
//            public void deleteAllById(Iterable<? extends Long> longs) {
//
//            }
//
//            @Override
//            public void deleteAll(Iterable<? extends User> entities) {
//
//            }
//
//            @Override
//            public void deleteAll() {
//
//            }
//
//            @Override
//            public <S extends User> Optional<S> findOne(Example<S> example) {
//                return Optional.empty();
//            }
//
//            @Override
//            public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> long count(Example<S> example) {
//                return 0;
//            }
//
//            @Override
//            public <S extends User> boolean exists(Example<S> example) {
//                return false;
//            }
//
//            @Override
//            public <S extends User, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//                return null;
//            }
//        });
//        Assertions.assertThatThrownBy(() -> testSubject.create(null)).isExactlyInstanceOf(IllegalArgumentException.class);
//    }
//
//    @Test
//    void testGetByUsernameWhenNull() {
//        Assertions.assertThatThrownBy(() -> testSubject.getByUserName("   ")).isExactlyInstanceOf(IllegalArgumentException.class);
//    }
//
//    @Test
//    void getByUserNameWhenUserFound() {
//        testSubject = new UserServiceImpl(new UserRepository() {
//            @Override
//            public Optional<User> findById(Long aLong) {
//                return Optional.empty();
//            }
//
//            @Override
//            public Optional<User> findByUsername(String username) {
//                if(!username.isBlank()) {
//                    return Optional.of(new User(username, "firstname1", "secondname1"));
//                }else {
//                    return Optional.empty();
//                }
//            }
//
//            @Override
//            public List<User> findAll() {
//                return null;
//            }
//
//            @Override
//            public List<User> findAll(Sort sort) {
//                return null;
//            }
//
//            @Override
//            public List<User> findAllById(Iterable<Long> longs) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> List<S> saveAll(Iterable<S> entities) {
//                return null;
//            }
//
//            @Override
//            public void flush() {
//
//            }
//
//            @Override
//            public <S extends User> S saveAndFlush(S entity) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
//                return null;
//            }
//
//            @Override
//            public void deleteAllInBatch(Iterable<User> entities) {
//
//            }
//
//            @Override
//            public void deleteAllByIdInBatch(Iterable<Long> longs) {
//
//            }
//
//            @Override
//            public void deleteAllInBatch() {
//
//            }
//
//            @Override
//            public User getOne(Long aLong) {
//                return null;
//            }
//
//            @Override
//            public User getById(Long aLong) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> List<S> findAll(Example<S> example) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
//                return null;
//            }
//
//            @Override
//            public Page<User> findAll(Pageable pageable) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> S save(S entity) {
//                return null;
//            }
//
//            @Override
//            public boolean existsById(Long aLong) {
//                return false;
//            }
//
//            @Override
//            public long count() {
//                return 0;
//            }
//
//            @Override
//            public void deleteById(Long aLong) {
//
//            }
//
//            @Override
//            public void delete(User entity) {
//
//            }
//
//            @Override
//            public void deleteAllById(Iterable<? extends Long> longs) {
//
//            }
//
//            @Override
//            public void deleteAll(Iterable<? extends User> entities) {
//
//            }
//
//            @Override
//            public void deleteAll() {
//
//            }
//
//            @Override
//            public <S extends User> Optional<S> findOne(Example<S> example) {
//                return Optional.empty();
//            }
//
//            @Override
//            public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> long count(Example<S> example) {
//                return 0;
//            }
//
//            @Override
//            public <S extends User> boolean exists(Example<S> example) {
//                return false;
//            }
//
//            @Override
//            public <S extends User, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//                return null;
//            }
//        });
//        User user = testSubject.getByUserName("username");
//        Assertions.assertThat(user).isEqualTo(new User("username1","firstname1", "secondname1"));
//
//    }
//    @Test
//    void getByUserNameWhenUserNotFound() {
//        testSubject = new UserServiceImpl(new UserRepository() {
//            @Override
//            public Optional<User> findById(Long aLong) {
//                return Optional.empty();
//            }
//
//            @Override
//            public Optional<User> findByUsername(String username) {
//                return Optional.empty();
//            }
//
//            @Override
//            public List<User> findAll() {
//                return null;
//            }
//
//            @Override
//            public List<User> findAll(Sort sort) {
//                return null;
//            }
//
//            @Override
//            public List<User> findAllById(Iterable<Long> longs) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> List<S> saveAll(Iterable<S> entities) {
//                return null;
//            }
//
//            @Override
//            public void flush() {
//
//            }
//
//            @Override
//            public <S extends User> S saveAndFlush(S entity) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> List<S> saveAllAndFlush(Iterable<S> entities) {
//                return null;
//            }
//
//            @Override
//            public void deleteAllInBatch(Iterable<User> entities) {
//
//            }
//
//            @Override
//            public void deleteAllByIdInBatch(Iterable<Long> longs) {
//
//            }
//
//            @Override
//            public void deleteAllInBatch() {
//
//            }
//
//            @Override
//            public User getOne(Long aLong) {
//                return null;
//            }
//
//            @Override
//            public User getById(Long aLong) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> List<S> findAll(Example<S> example) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
//                return null;
//            }
//
//            @Override
//            public Page<User> findAll(Pageable pageable) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> S save(S entity) {
//                return null;
//            }
//
//            @Override
//            public boolean existsById(Long aLong) {
//                return false;
//            }
//
//            @Override
//            public long count() {
//                return 0;
//            }
//
//            @Override
//            public void deleteById(Long aLong) {
//
//            }
//
//            @Override
//            public void delete(User entity) {
//
//            }
//
//            @Override
//            public void deleteAllById(Iterable<? extends Long> longs) {
//
//            }
//
//            @Override
//            public void deleteAll(Iterable<? extends User> entities) {
//
//            }
//
//            @Override
//            public void deleteAll() {
//
//            }
//
//            @Override
//            public <S extends User> Optional<S> findOne(Example<S> example) {
//                return Optional.empty();
//            }
//
//            @Override
//            public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
//                return null;
//            }
//
//            @Override
//            public <S extends User> long count(Example<S> example) {
//                return 0;
//            }
//
//            @Override
//            public <S extends User> boolean exists(Example<S> example) {
//                return false;
//            }
//
//            @Override
//            public <S extends User, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//                return null;
//            }
//        });
//
//        Assertions.assertThatThrownBy(() -> testSubject.getByUserName("user1")).isExactlyInstanceOf(UserNotFoundException.class);
//    }
//}