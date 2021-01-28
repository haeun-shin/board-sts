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
  - bootstrap

<br><br>

---

<br><br>

## 🚩TASK

| Task | URL | Method | Parameter | From | URL 이동| 비고 |
|------|-----|:------:|:---------:|:----:|---------|------|
게시물 등록        | `/board/write.do`   | GET   | idx(Long) |               | `board/write.html`        |
게시물 등록 처리   | `/board/register.do`| POST  | BoardDTO  | 입력화면 필요 | `redirect:/board/list.do`
게시물 목록 조회   | `/board/list.do`    | GET   |           |               | `board/list.html`
게시물 조회        | `/board/view.do`    | GET   | idx(Long) |               | `board/view.html`
게시물 수정        | `/board/write.do`   | GET   | idx(Long) |               | `board/write.html`        | idx가 존재할 경우, 게시물을 조회하여 나온 값을 가지고 수정폼(=등록폼)으로 이동
게시물 수정        | `/board/register.do`| POST  | BoardDTO  | 입력화면 필요 | `redirect:/board/list.do` | idx 값의 여부에 따라, UPDATE 실행.<br> 존재하지 않을 경우 INSERT(등록 처리) 실행. 


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