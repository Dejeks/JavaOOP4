Класс Calculator теперь инкапсулирует операции и работает с ними через методы.
Таким образом, мы применили принцип единственной ответственности (Single Responsibility Principle) - каждый класс имеет только одну причину для изменения. 
Calculator теперь отвечает только за координацию операций, а математические операции были вынесены в отдельный класс MathOperations.
Созданы MathOperations и BinaryConverter, которые отвечают только за выполнение математических операций и преобразование числа в двоичное представление соответсвенно.
