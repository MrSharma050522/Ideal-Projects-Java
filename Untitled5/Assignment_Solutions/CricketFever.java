package Assignment_Solutions;
/*
Sample Input:-
3
2 ^ 3 inputs = 8

There is one more twist, the supporters of the losing team will join the
supporters of the team which is going against the team who eliminated their team.

teams :      1 2 3 4 5 6 7 8
supporters : 2 3 4 1 3 5 6 8

1(2) vs 2(3) - 2 (3)
3(4) vs 4(1) - 3 (4)
5(3) vs 6(5) - 6(5)
7(6) vs 8(8) - 8(8)

2(3 + 1) vs 3(4 + 2) - 3(6)
6(5 + 6) vs 8(8 + 3) = 6(11)

3(6 + 11) vs 6(11 + 4) - 3rd (17)

supporrter of losig team will join the opposition

w1 vs w2 - w1
w3 vs w4 - w3

w1 vs w3 -> winner.

Sample Output:-
17

Explanation:-
1 vs 2:- 2(3)
3 vs 4:- 3(4)
5 vs 6:- 6(5)
7 vs 8:- 8(8)

2(3+1) vs 3(4+2):- 3(6)
6(5+6) vs 8(8+3):- 6(11)

3(6+11) vs 6(11+4):- 3(17)

Sample Input:-
3
4 1 2 3 4 3 2 1

Sample Output:-
11
 */


public class CricketFever {
}
