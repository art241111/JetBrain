#Задача 1
## Размышления на тему задачи 1
*Имя Артем не корректно для этого задания, так как его можно писать по разному: artem/artyom. 
Поэтому в своем решение я вынес имя в отдельное поле, чтобы была возможность его поменять.

## Мысль при решении
Для того, чтобы имя Артем было в начале - его вес должен быть меньше всех букв в порядке возрастания.
Единственный способ это делать, добавить имя Артем в самое начало. Дальше остался вопрос о том, 
есть ли комбинация меньше. 

## Расчет веса имени
Расчет имени происходил также как в любой позиционной системе счисления. Только само имя было перевенуто
для того, чтобы первая буква весила больше всего. А так как у нас бывает разный размер слова, начинать
нужно с максимального индекса. 

 96 | 97 | 98 | 99 | 100 |
--- |--- |--- |--- |---  |
 М  | Е  |  Т | Р  |  А  |
 
 Формула для расчета веса:  
(индекс буквы в алфавите) * (количество букв в алфавите) ^ (индекса буквы)

## Оптимизация
Как было сказано в предыдущем пункте, отчет начинается с самого большого индекса. 
Для решения есть два варианта.
 * Первый основывается на исходных данных, где сказано, что слово меньше, чем 100 букв.  
 * Второй способ получить все имена, посмотреть размер самого длинного имени и затем 
 заново пройти по списку и рассчитать вес для каждого элемента заново.   
 
С одно стороны, я добавил дополнительный линейный проход по списку, но с другой стороны, нам не приходиться
постоянно возводить в степень 100. 