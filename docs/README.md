# 3주차 요구사항
- 로또 번호의 숫자 범위는 1~45까지이다.
- 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.
- 당첨 번호 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.
- 당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.
    - 1등: 6개 번호 일치 / 2,000,000,000원
    - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
    - 3등: 5개 번호 일치 / 1,500,000원
    - 4등: 4개 번호 일치 / 50,000원
    - 5등: 3개 번호 일치 / 5,000원
      로또 구입 금액을 입력하면 구입 금액에 해당하는 만큼 로또를 발행해야 한다.
      로또 1장의 가격은 1,000원이다.
      당첨 번호와 보너스 번호를 입력받는다.
      사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다.
      사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
      Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.


## 구현 사항
- [x] 로또를 정상적으로 구매한다.
  - [x] 로또 금액에 문자열이 입력되면 예외처리
  - [x] 로또 금액이 1000원 단위로 입력되지 않으면 예외 처리
  - [x] 로또 금액에 0원이 입력되면 예외 처리
- [x] 구매한 만큼의 로또 리스트를 반환한다.
  - [x] 로또 리스트는 오름차순으로 정렬한다.
- [x] 당첨 번호를 콤마를 기준으로 입력받는다.
  - [x] 당첨 번호가 콤마 기준으로 입력되지 않을 경우 예외처리
  - [x] 정수가 아닌 값이 입력될 경우 예외처리
  - [x] 6자리 이상이 입력될 경우 예외처리
  - [x] 1부터 45 사이의 숫자가 아닐 경우 예외 처리
  - [x] 중복된 숫자가 입력될 경우 예외처리
- [x] 1~45 사이의 보너스 번호를 입력받는다.
  - [x] 정수가 아닌 값이 입력될 경우 예외처리
  - [x] 1부터 45 사이의 숫자가 아닐 경우 예외처리
  - [x] 당첨 번호와 중복된 값이 입력될 경우 예외처리
- [x] 로또와 당첨 번호, 보너스 번호를 통해 번호가 일치하는 로또의 개수를 파악한다.
  - [x] 일치하는 로또 번호 개수는 보너스 번호를 제외한다.
  - [x] 5개 당첨 번호와 보너스 번호가 맞을 경우에만 2등이 되도록 구현한다.
- [x] 총 수익률을 소수점 둘째 자리에서 반올림한다.
- [x] 로또 결과를 화면에 출력한다. 