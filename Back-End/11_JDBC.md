# JDBC

> 부스트코스의 무료강의 중 웹 백엔드 강의를 수강하고 정리한 내용입니다.

[부스트코스 사이트](https://www.boostcourse.org/opencourse)

<br>

---

<br>

## **JDBC (Java Database Connectivity) 란?**

-   자바를 이용한 데이터베이스 접속과 SQL 문장의 실행, 실행 결과로 얻어진 데이터의 핸들링을 제공하는 방법과 절차에 관한 규약
    -   자바 프로그램 내에서 SQL문을 실행하기 위한 자바 API
    -   SQL과 프로그래밍 언어의 통합 접근 중 한 형태
-   JAVA는 표준 인터페이스인 JDBC API를 제공
-   데이터베이스 벤더, 또는 기타 써드파티에서는 JDBC 인터페이스를 구현한 드라이버(driver) 제공

<br>

#### **환경 구성**

1\. IntelliJ에서 Java Gradle Project 생성

2\. build.gradle 파일의 dependencies 항목에 아래 코드 추가

```java
runtimeOnly 'mysql:mysql-connector-java:8.0.28'
```

3\. 새로 추가한 dependency를 반영하기 위해 refresh

<br>

## **JDBC를 이용한 프로그래밍 방법**

1.  드라이버 로드
2.  Connection 객체 생성
3.  Statement 객체 생성 및 질의 수행
4.  SQL문에 결과물이 있다면 ResultSet 객체 생성
5.  모든 객체 close

<br>

#### **JDBC 클래스의 생성 관계**

1.  DriverManager를 이용해서 Connection 인스턴스를 얻는다.
2.  Connection을 이용해서 Statement 인스턴스를 얻는다.
3.  Statement를 이용해서 ResultSet 인스턴스를 얻는다.

<br>

**1\. DriverManager를 이용해서 Connection 객체를 얻는다.**

```java
public final class DatabaseConnection {

    private static final String SERVER = "localhost:3306";
    private static final String DATABASE = "chess";
    private static final String OPTION = "?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://" + SERVER + "/" + DATABASE + OPTION, USERNAME, PASSWORD);
        } catch (final SQLException e) {
            System.err.println("DB 연결 오류:" + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
```

<br>

**2\. Connection을 이용해서 Statement 객체를 얻는다.**

```java
Connection connection = getConnection();
Statement statement = connection.createStatement();
```

<br>

**3\. Statement를 이용해서 ResultSet 객체를 얻는다.**

```java
ResultSet resultSet = statement.executeQuery("SELECT no FROM user");

// ResultSet으로 결과 받기
while (resultSet.next()) {
    System.out.println(resultSet.getInt("no"));
}
```

<br>

**4\. 객체 close**

```java
// 생성한 역순으로 close 해줘야 한다.
resultSet.close();
statement.close();
connection.close();
```

침고) try-with-resources 를 사용하면 객체를 직접 close 하지 않아도 된다.

try-with-resources에 관한 내용은 [여기](https://yejinlife.tistory.com/entry/try-with-resources%EB%9E%80 "여기")에서 볼 수 있다.

<br>

**소스코드 예제**

```java
public class UserDao {
    private static final String SERVER = "localhost:3306"; // MySQL 서버 주소
    private static final String DATABASE = "chess"; // MySQL DATABASE 이름
    private static final String OPTION = "?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USERNAME = "root"; //  MySQL 서버 아이디
    private static final String PASSWORD = ""; // MySQL 서버 비밀번호

    public Connection getConnection() {
        // 드라이버 연결
        try {
            return DriverManager.getConnection("jdbc:mysql://" + SERVER + "/" + DATABASE + OPTION, USERNAME, PASSWORD);
        } catch (final SQLException e) {
            System.err.println("DB 연결 오류:" + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public void addUser(final User user) {
        final var query = "INSERT INTO user VALUES(?, ?)";
        try (final var connection = getConnection();
             final var preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.userId());
            preparedStatement.setString(2, user.name());
            preparedStatement.executeUpdate();
        } catch (final SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public User findByUserId(final String userId) {
        final var query = "SELECT * FROM user WHERE user_id = ?";
        try (final var connection = getConnection();
             final var preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, userId);

            final var resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return new User(
                        resultSet.getString("user_id"),
                        resultSet.getString("name")
                );
            }
        } catch (final SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public int update(final User user) {
        final var query = "UPDATE user SET name = ? WHERE user_id = ?";
        try (final var connection = getConnection();
             final var preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.name());
            preparedStatement.setString(2, user.userId());
            return preparedStatement.executeUpdate();
        } catch (final SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int delete(final User user) {
        final var query = "DELETE FROM user WHERE user_id = ?";
        try (final var connection = getConnection();
             final var preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, user.userId());
            return preparedStatement.executeUpdate();
        } catch (final SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
```

```java
public class User {

    private final String userId;
    private final String name;

    public User(final String userId, final String name) {
        this.userId = userId;
        this.name = name;
    }

    public String userId() {
        return userId;
    }

    public String name() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
```
