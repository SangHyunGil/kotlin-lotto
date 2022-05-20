# kotlin-lotto

## Requirements for the step 2 로또 자동 
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

## Function list

- [X] 1~45 사이 숫자 중 6개를 랜덤하게 뽑아내어 로또를 만든다. - Lotto / LottoBuilder 
- [X] 1000원의 배수로 갯수 만큼 로또를 생성한다. - Lottos / LottoBuilder
- [X] 1~45 사이 숫자 중 6개 당첨 번호를 만들어 일치 갯수를 계산한다. - LottoBuilder
- [X] 일치 갯수에 따른 당청 종류 및 당첨 금액 를 판정한다 - enum clas Winning
  - [X] 0~2개 일치 낙첨 / 0원 
  - [X] 3개일치 5등 / 5_000 원
  - [X] 4개일치 4등 / 50_000 원
  - [X] 5개일치 3등 / 1_500_000 원
  - [X] 6개일치 1등 / 2000_000_000 원
- [X] 여러 로또 (lottos)를 한번에 판정할 수 있는 기능
- [X] 당첨 통계를 계산한다 -  Statistics
  - [X] 당첨 등급별 당첨 갯수를 계산한다  
  - [X] 수익률 계산   당청금액 / 구매금액
- [] View를 구현한다 
  - [X] 화면에 로또 리스트를 출력 한다 
  - [X] 화면에 로또 통계를 출력 한다
  - [X] 콘솔입력을 통해 금액을 입력 받는다
  - [X] 콘솔입력을 통해 당첨 번호( winning lotto)을 입력 받는다 
- [X] Controller 구현하여 각 모듈을 통합한다 
  

## Requirements for the step 1 StringAddCalculator

- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
- 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.


## Function list 
- [X] 빈 문자열 또는 null을 입력할 경우 0을 반환해야 한다. (예 : “” => 0, null => 0)
- [X] 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.(예 : “1”)
- [X] 숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다. (예 : “1,2”)
- [X] 구분자를 컴마(,) 이외에 콜론(:)을 사용할 수 있다. (예 : “1,2:3” => 6)
- [X] "//"와 "\n" 문자 사이에 커스텀 구분자를 지정할 수 있다. (예 : “//;\n1;2;3” => 6)
- [X] 음수를 전달할 경우 RuntimeException 예외가 발생해야 한다. (예 : “-1,2,3”)
- [X] blank 값을 입력할 경우 0을 반환해야 한다
