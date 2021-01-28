# board-sts
스프링부트로 구현한 게시판
> 커밋내역: https://github.com/haeun-shin/board-sts/commits

<br>

- 기본 구성
  - Spring Boot
  - Spring Tools 4 fro Eclipse
  - Gradle
  - java 1.8
  - Oracle 12c
  - Mybatis
  - Lombok
  - Thymeleaf

<br><br>

---

<br><br>

## 🔨 기능
### __게시물 작성__
  - `@GetMapping(value = "/board/write.do")`
  - `@PostMapping(value = "/board/register.do")`
### __게시물 목록 조회__
  - `@GetMapping(value = "/board/list.do")`


<br><br>

---

<br><br>

## 📄 TABLE
### __TB_BOARD (게시판)__
|NAME | DATA TYPE | NULLABLE | DATA DEFAULT | COMMENTS|
|----|----|:----:|:----:|----|
`IDX`         |	NUMBER(38,0)	    |   No	|       |번호(PK)
`TITLE`       |	VARCHAR2(100 BYTE)	|   No	|       |제목
`CONTENT`     |	VARCHAR2(3000 BYTE)	|   No	|       |내용
`WRITER`      |	VARCHAR2(20 BYTE)	|   No	|       |작성자
`VIEW_CNT`    |	NUMBER(38,0)	    |   Yes	|  0    |조회수
`NOTICE_YN`   |	CHAR(4 BYTE)	    |   Yes	|       |공지글 여부
`SECRET_YN`   |	CHAR(4 BYTE)	    |   Yes	|       |비밀글 여부
`DELETE_YN`   |	CHAR(4 BYTE)	    |   Yes	|       |삭제 여부
`INSERT_TIME` |	DATE	            |   Yes	|sysdate|등록일
`UPDATE_TIME` |	DATE	            |   Yes	|       |수정일
`DELETE_TIME` |	DATE	            |   Yes	|       |삭제일