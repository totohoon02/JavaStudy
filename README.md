### JAVA_STUDY(2023-12-31)

- `src`: sourceFile 폴더
- `lib`: dependency 폴더
- `bin`: 빌드하면 바이너리 파일이 저장될 곳, 커스텀하고 싶으면 `setting.json` 수정하면 된다고 함

#### 자바 문법

- 출력 스니펫 `pln`
- 상수 키워드: `final`
- 참조 자료형: 기본 자료형이 아닌 모든 자료형, 클래스의 인스턴스, 배열도 참조 자료형이다.
- char의 연산은 아스키코드 값으로 들어간다.
- 인덱스 없는 반복문

  ```
    int[] numbers = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
          for (int number : numbers)
              System.err.print(number + " ");
  ```

- Java는 메소드도 소문자로 시작
- 상속 키워드: `extends`
- 프로퍼티에 키워드를 안쓰면 public
- 메소드 오버라이드 키워드: `@Override` 명확하게 나타내기 위해서 써야한다!
- 네임스페이스 키워드 `package`, 패키지 폴더명도 같아야 함
- .java 파일의 파일명과 내부 클래스의 이름은 동일해야 한다, 대소문자 포함
- 임포트 키워드 `import`
- `interface` 키워드 `implements`
