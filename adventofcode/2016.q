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


//------------------------------------
//Task 2
.aoc.d2.t1: {
    x,: "\n";
    x: {[x;y]
        point: x 0;
        if[y~"\n";:(point; x[1], enlist point);];
        nextPoint: point + ("RLUD"!(0 1;0 -1;-1 0;1 0))y;
        $[all nextPoint within 0 2
            ; (nextPoint;x 1)
            ; (point; x 1)
        ]
    } over enlist[(1 1;())], x;
    raze string sum each (0 1) +/: x[1] * \: (3 1)
 };


.aoc.d2.t2: {
    x,: "\n";
    x: {[x;y]
        point: x 0;
        if[y~"\n";:(point; x[1], enlist point);];
        nextPoint: point + ("RLUD"!(0 1;0 -1;-1 0;1 0))y;
        $[nextPoint in (0 2; 1 1; 1 2; 1 3; 2 0; 2 1; 2 2; 2 3; 2 4; 3 1; 3 2; 3 3; 4 2)
            ; (nextPoint;x 1)
            ; (point; x 1)
        ]
    } over enlist[(2 0;())], x;
    ((0 2; 1 1; 1 2; 1 3; 2 0; 2 1; 2 2; 2 3; 2 4; 3 1; 3 2; 3 3; 4 2)!"123456789ABCD")x 1
 };


//------------------------------------
//Task 3
.aoc.d3.parseInput: {
 -1_{x where not null x} each "J"$"  " vs/: "\n" vs x
 };


.aoc.d3.t1: {
    x: .aoc.d3.parseInput x;
    sum {x: asc x; x[2]<x[0]+x[1]} each x
 };


.aoc.d3.t2: {
    x: .aoc.d3.parseInput x;
    sum {x: asc x; x[2]<x[0]+x[1]} each raze flip each 3 cut x
 };

//------------------------------------
//Task 4
.aoc.d4.t1: {
    x: "\n" vs x;
    sum {
        x: "-" vs x;
        w: raze -1 _ x;
        ID: "J"$first "[" vs last x;
        checksum: -1_last "[" vs last x;
        w: {desc (key x)!((neg `long$key[x])+1000*count each value x)}group w;
        real: checksum~5#key w;
        real*ID
    } each x
 };


.aoc.d4.t2: {
    x: "\n" vs x;
    words: flip `w`ID ! flip {
        x: "-" vs x;
        w: raze -1 _ x;
        ID: "J"$first "[" vs last x;
        checksum: -1_last "[" vs last x;
        w: {desc (key x)!((neg `long$key[x])+1000*count each value x)}group w;
        real: checksum~5#key w;
        $[real
        ;[
            x: " " sv -1 _ x;
            x: {$[x=" ";x;`char$97+((-97+`long$x)+y) mod 26]}[;ID] each x;
            (x;ID)]
        ;("";0N)]
    } each x;
    select from words where not null ID, w like "northpole object storage"
 };

