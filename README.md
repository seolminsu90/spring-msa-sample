# spring-msa-sample
spring msa sample

공부용

### Spring MSA 샘플

Discovery (Eureka)
Gateway (Spring cloud gateway OR Netflex Zuul)
Authorization (Spring cloud security oauth2)
Service Sample (Spring boot)

- Spring cloud security oauth2 Resource Server가 Spring cloud gateway(Netty)와 연동하는게 아직 지원이 안되는 듯 함 (zuul로 하면 잘됨)

### Autuorization token 받기
```bash
curl auth_id:auth_secret@localhost:8095/oauth/token -d grant_type=password -d client_id=auth_id -d scope=read -d username=test -d password=1234
```
### 요청 테스트 (service2의 경우 권한 필요)
```bash
curl -XGET localhost:8090/api/second -H 'Authorization: bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1OTcwNzkzMjksInVzZXJfbmFtZSI6InRlc3QiLCJhdXRob3JpdGllcyI6WyJVU0VSIiwiQURNSU4iXSwianRpIjoiMzc2NDUzYTEtZmFkMC00ODVkLWJmMGItYjI4ZTA2ZWM3NDZkIiwiY2xpZW50X2lkIjoiYXV0aF9pZCIsInNjb3BlIjpbInJlYWQiXX0.2qdrso7SRtUImnkzqD_ydfZibh4N32bfZ87OH4jOabw'
```
### 더 생각할 것

- circuit breaker (netflex hystrix, reactive-resilience4j) netflex는 지원 종료라고 함. netty기반으로 구현할때 resilience4j 봐야할듯
- authorization 및 filter.. (실제 db연동해서 이래저래 하는거 안해봄
- logging (활용할만한 logging)
- gateway에 redis 활용 
- rabbitmq 등 연동한 service간 통신.. 보상 트랜젝션 등
- 추후 spring cloud security oauth2 가 netty 지원하면 spring cloud gateway랑 연동해보기

### 참조

https://taes-k.github.io/trick&basic.html
