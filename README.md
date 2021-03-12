# 계산기 만들기 

## 📑기능 구현 목록
- 수식 입력 요구문 출력
- 사용자 입력
    - 비정상적인 입력 처리
        - 연산자나 숫자가 아닌 경우
        - 첫 번째 입력이 연산자인 경우
        - 마지막 입력이 연산자인 경우
        - 나누기 연산자 뒤에 0이 입력된 경우
        - 나머지 연산자 뒤에 0이 입력된 경우
        - 숫자나 연산자가 두 번 연속 입력된 경우
        - 한 단어에 숫자와 연산자가 같이 있을 경우
- 띄어쓰기 기준으로 수식 분리
- 수식 계산
- 재시작 여부 확인

## 💾클래스 및 메서드 분류
- Application
- Controller
    - run
- Calculator
    - calculate
    - judgeOperator
    - add
    - sub
    - mul
    - div
    - mod
- Operator
    - getOperator
- Operand
    - getOperand
- Receiver
    - receiveOperation
    - splitOperation  
    - validator
- Printer
    - printMessage 
- Message

## 🐬기능 요구사항
- 연산자는 +, -, *, /, % 를 구현한다.
- 입력은 문자열로 받는다.
- 연산자의 우선순위는 반영하지 않는다.
- 띄어쓰기 기준으로 나눈다.
- 계산이 끝난 후, 재시작 여부를 사용자에게 확인한다.

## 📺입출력 예시
```
수식을 입력하세여!
3 * 2 + 1
수식의 결과는 9 입니다.
재시작을 원하시면 1, 종료를 원하시면 2를 입력하세요!
1
수식을 입력하세여!
6 % 1 * 5
수식의 결과는 0 입니다.
재시작을 원하시면 1, 종료를 원하시면 2를 입력하세요!
2
종료되었습니다.
```

## 👔프로그래밍 요구사항
- 함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.
- 함수(또는 메서드)가 한가지 기능만 수행하도록 구현한다.
- else 예약어를 쓰지 않는다.
- switch/case문(door 아님)을 쓰지 않다.
- static 최대한 쓰지 않는다.

## 힌트
```
String value = scanner.nextLine();
String[] values = value.split(" "); 
```