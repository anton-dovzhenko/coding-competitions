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


//------------------------------------
//Task 5
.aoc.d5.t1: {
    password: "";
    i: 0;
    while[8>count password;
        if[(md: raze string md5 phrase,string i) like "00000*"; password,: md 5];
        i+:1
    ];
    password
 };


.aoc.d5.t2: {
    password: 8#" ";
    i: 0;
    while[0<sum password=" ";
        if[(md: raze string md5 x,string i) like "00000*";
            if[md[5] in "01234567";
                if[" "=password@"J"$md[5]; password["J"$md 5]: md 6]]];
        i+:1
        ];
    password
 };


//------------------------------------
//Task 6
.aoc.d6.t1: {
    raze {key[x] where min[i]=i:count each value x}each group each flip"\n" vs x
 };

.aoc.d6.t2: {
    raze {key[x] where max[i]=i:count each value x}each group each flip"\n" vs x
 };


//------------------------------------
//Task 7
.aoc.d7.t1: {
    x: "\n" vs x;
    sum {
        x: raze"]" vs/:"[" vs x;
        x: where {any {(x[y]=x[y+3])&(x[y+1]=x[y+2])&(x[y]<>x[y+1])}[x] each til 0|-3+count x} each x;
        (any mod[x;2]=0)& not any mod[x;2]=1
    } each x
 };


.aoc.d7.t2: {
    x: "\n" vs x;
    sum {
        x: raze"]" vs/:"[" vs x;
        x1: x@2*til `long$0.5*count x;
        x2: x@1+2*til `long$0.5*count x;
        aba: {where ((-2_x)=2_x)&(-2_x)<>1_-1_x};
        x1: raze {[aba;x] i:aba x; (x@i),'x@i+1}[aba]each x1;
        x2: raze {[aba;x] i:aba x; (x@i+1),'x@i}[aba]each x2;
        0<count x1 inter x2
    } each x
 };