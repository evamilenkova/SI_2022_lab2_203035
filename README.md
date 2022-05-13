## Ева Миленкова 203035 - Втора лабoраториска вежба по Софтверско Инженерство


### Control Flow Graph
![CFG ](https://user-images.githubusercontent.com/86674681/168337204-535bcfe1-56fc-402f-968f-4ce5441ec50f.png)



### Цикломатска комплексност

Цикломатската комплексност може да се определи на 3 начини:
 - Број на региони на CFG -> во мојот случај тоа се 9
 - Број на предикатни јазли +1 -> во мојот случај тоа се 8 предикатни јазли +1 = 9
 - Број на ребра - број на јазли +2 -> во мојот случај 28-21+2=9


### Тест случаи според критериумот Every statement
   Потребни се 3 тест случаи за да се покрие секој statement во кодот, и тоа:
   
  1.list= empty list; - фрла исклучок со порака "List length should be greater than 0" statements: ( A B S )
 
  2.list={"0","#","0"} - фрла исклучок со порака "List length should be a perfect square" statements: ( A C D S )
 
  3.list={"#","0","#","0","#","#","0","0","#"} - поминува во сите останати statements ( A C E F1 F2 F3 G H I L K J N M O P Q R S )
 
 


### Тест случаи според критериумот Every branch
   Како и за Every statement така и за Every branch се потребни истите 3 тест случаи за да се
   поминат сите branches
   
    1.list=empty list; фрла исклучок со порака "List length should be greater than 0" ( A-B, B-S )
   
    2.list={"0","#","0"} - фрла исклучок со порака "List length should be a perfect square" ( A-C, C-D, D-S )
   
    3.list={"#","0","#","0","#","#","0","0","#"} - поминува во сите останати branches ( A-C, C-E, E-F1, F1-F2, F2-G, G-H, G-Q, H-I, H-L, I-J, I-K, J-L, K-L, L-M, L-N, M-N, N-O, N-P, 0-P, P-F3, Q-F3, F3-F2, F2-R, R-S )
   



### Објаснување на напишаните unit tests
 Unit тестовите се направени во SILab2Test класата во функцијата functionEveryStatementAndEveryBranch() со анотација @Test, 
 со помош на методите assertThrow за тестирање на случаите кога методот фрла исклучок, assertTrue за пораката од исклучокот
 ( дали е фрлен правилниот исклучок ), како и assertEquals за споредба на посакуваниот и добиениот резултат.
 После сите тестови се извршува тест методот со анотација AfterAll што означува дека сите тестови успешно се извршени.

