# spring-reactive-programming-study

## TLS 이슈 발생시
- ex : org.springframework.transaction.CannotCreateTransactionException: Could not open R2DBC Connection for transaction;
- 해결 방법 : yml DB 설정에 TLS 1.2 사용 처리
  -  eg, r2dbc:mysql://localhost:3306/Sample?**tlsVersion=TLSv1.2**
- 참고 : https://github.com/mirromutth/r2dbc-mysql/issues/182
