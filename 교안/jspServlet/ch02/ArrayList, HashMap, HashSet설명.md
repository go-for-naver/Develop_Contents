<h3>ArrayList</h3>
ArrayList은 Java에서 제공하는 동적 배열 자료구조입니다.

<h4>특징:</h4>

크기가 가변적이며 동적으로 요소를 추가/삭제할 수 있는 배열 구조를 제공합니다.
순서(index)를 가지며, 중복 요소를 허용합니다.
배열의 크기를 조정할 필요가 없으므로 편리하게 요소를 관리할 수 있습니다.
<br>

사용법:

ArrayList 생성:
```
ArrayList<String> list = new ArrayList<>();
```

요소 추가:
```
list.add("항목 1");
list.add("항목 2");
```

요소 접근:
```
String item = list.get(0);
```

요소 삭제:
```
list.remove(1);
```

<h3>HashSet</h3>
HashSet은 Java에서 제공하는 집합(Set) 자료구조입니다. 다음은 HashSet에 대한 주요 특징과 사용법입니다:

<h4>특징:</h4>
중복 요소를 허용하지 않는 집합 자료구조입니다.
순서가 유지되지 않으며, 저장 순서와 출력 순서가 다를 수 있습니다.
빠른 검색과 삽입이 가능하며, 중복 요소를 자동으로 제거합니다.
<br>

사용법:

HashSet 생성:
```
HashSet<String> set = new HashSet<>();
```

요소 추가:
```
set.add("항목 1");
set.add("항목 2");
```

요소 검색:
```
boolean contains = set.contains("항목 1");
```

요소 삭제:
```
set.remove("항목 2");
```
<h3>HashMap</h3>
HashMap은 Java에서 제공하는 키-값 쌍을 저장하는 자료구조입니다. 다음은 HashMap에 대한 주요 특징과 사용법입니다:

<h4>특징:</h4>

키와 값으로 구성된 엔트리를 저장하는 자료구조로, 각 키는 고유해야 합니다.
키를 사용하여 값을 검색하고, 중복 키를 허용하지 않습니다.
순서가 유지되지 않으며, 키를 사용하여 빠르게 값을 검색할 수 있습니다.
<br>

사용법:

HashMap 생성:
```
HashMap<String, Integer> map = new HashMap<>();
```

엔트리 추가:
```
map.put("키 1", 100);
map.put("키 2", 200);
```

값 검색:
```
int value = map.get("키 1");
```

엔트리 삭제:
```
map.remove("키 2");
```