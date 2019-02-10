//------------------------------------
//Task 1
.aoc.d1.t1: {
    endBlock: {[x;y]
        dir: x 1;
        turn: `$y 0;
        dir: $[turn=`R;(`N`E`S`W!`E`S`W`N)dir;(`N`W`S`E!`W`S`E`N)dir];
        s: "J"$1_y;
        (x[0]+s * (`N`E`S`W!(1 0;0 1;-1 0;0 -1))dir; dir)
    }over enlist[(0 0;`N)],", "vs x;
    sum abs endBlock[0]
 };

.aoc.d1.t2: {
    dots: {[x;y]
        dir: x 1;
        turn: `$y 0;
        dir: $[turn=`R;(`N`E`S`W!`E`S`W`N)dir;(`N`W`S`E!`W`S`E`N)dir];
        s: "J"$1_y;
        (x[0]+s * (`N`E`S`W!(1 0;0 1;-1 0;0 -1))dir; dir)

    } scan enlist[(0 0;`N)],", "vs x;
    dots: dots[;0];
    lines: raze {1_{x cross y} . x+signum[y-x]*til each 1+abs y-x}'[-1 _ dots; 1 _ dots];
    lines: group lines;
    sum abs key[lines]@first where 1<count each value lines
 };