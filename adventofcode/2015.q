//Task 1.1
0 0 3 3 3 -1 -1 -3 -3~{sum("()"!1 -1)x}each("(())";"()()";"(((";"(()(()(";"))(((((";"())";"))(";")))";")())())")
//Task 1.2
1 5~{1+(sums("()"!1 -1)x)?-1}each(enlist")";"()())")


//Task 2.1
101~sum{(3*prd x 0 1)+2*x[2]*x[0]+ (x:asc"J"$"x"vs x)1}each("2x3x4";"1x1x10")
//Task 2.2
34 14 ~ {(2*sum x 0 1)+prd x:asc"J"$"x"vs x}each("2x3x4";"1x1x10")


//Task 3.1
2 4 2~{count distinct sums enlist[0 0],("^>v<"!(0 1;1 0;0 -1; -1 0))x}each(">";"^>v<";"^v^v^v^v^v")
//Task 3.2
{count distinct raze {sums enlist[0 0],("^>v<"!(0 1;1 0;0 -1; -1 0))x} each flip 2 cut x}"^v^v^v^v^v"


//Task 4.1 (inefficient approach)
{first where "00000"~/:5#'raze each string md5 each x,/:string til 1000000}"iwrupvqb"
//Task 4.2 (inefficient approach)
first where "000000"~/:6#'raze each string md5 each "iwrupvqb",/:string 9000000+til 1000000


//Task 6.1
I: til 1000000;
sum {?[((floor I%1000) within y[1][0 2])&mod[I;1000] within y[1][1 3];y[0]@x;x]} over (1000000#0b;({1b};(489,959, 759,964));({0b};(427,423, 929,502));({not x};(756,965, 812,992)))
//Task 6.2
sum {?[((floor I%1000) within y[1][0 2])&mod[I;1000] within y[1][1 3];y[0]@x;x]} over (1000000#0;({x+1};489,959,759,964);({0|x-1};820,516,871,914);({x+2};120,314,745,489))


//Task 7.1
.aoc.toBinary: {((16-count x)#0b),x:`boolean$2 vs/:"J"$x};
.aoc.operations: ("NOT";"AND";"OR";"LSHIFT";"RSHIFT")!(
  {not x}
  ;{x&y}
  ;{x|y}
  ;{x,$[1=type y;2 sv y;y]#0b}
  ;{(neg $[1=type y;2 sv y;y])_ x}
);
.aoc.getVal: {$[any y~/:key x;x@y;.aoc.toBinary y]};

{x:1_x;asc([]first each key x;2 sv/:value x)}
{[x;y]
  y: " -> "vs y;
  s: " " vs y 0;    //statement
  v: y 1;           //variable
  x, enlist[v]!enlist
  $[1=count s
    ;.aoc.toBinary s 0
    ; $[2=count s
      ; .aoc.operations["NOT"] .aoc.getVal[x;s 1]
      ; (.aoc.operations s 1) . .aoc.getVal[x]each s 0 2
    ]
  ]
}over({enlist[x]!x}enlist[::];"123 -> x";"456 -> y"
;"x AND y -> d"
;"x OR y -> e"
;"x LSHIFT 2 -> f"
;"y RSHIFT 2 -> g"
;"NOT x -> h"
;"NOT y -> i")


//Task 9.1
input: read0 hsym`$"2015_t9_p1.in";
input: {x, (reverse each key x)!value x} {x[0]!x 1}flip{x:" to " vs x; c0: `$x 0; x: " = " vs x 1; (c0,`$x 0;"J"$x 1)} each input;
cities: distinct raze key input;
permutations: {raze {[y;x] i:til 1+count x; ((i#\:x),'y),'i _\:x}[y]each x} over enlist[(cities 0 1;cities 1 0)],2_cities;
min{sum x@/: y,'next y}[input]each permutations
//Task 9.2
//same but take max in the end
max {sum x@/: y,'next y}[input]each permutations



//Task 10.1
encode: {
  d:where 0<>deltas x:"J"$/:x;
  "" sv string raze (1_deltas d,count x),'x@d
};
count {[x;y]encode x}over enlist["1113122113"], til 40
//Task 10.2 is same to //Task 10.1
encode0: {d:where 0<>deltas x; raze (1_deltas d,count x),'x@d};
count {[x;y]encode0 x}over enlist["J"$/:"1113122113"], til 50


//Task 12.1
6 3 0 0~{sum"J"$" "vs?[x in "\":,{}[]";" ";x]}each("{\"a\":2,\"b\":4}";"{\"a\":{\"b\":4},\"c\":-1}";"{\"a\":[-1,1]}";"[-1,{\"a\":1}]")
//Task 12.2 not efficient at all. Complexity must be O(n)
{sum"J"$" "vs?[x in "\":,{}[]";" ";x]}
{
  red: x ss ":\"red\"";
  if[0=count red;:x;];
  brackets: sums 0^("{}"!1 -1)x;
  excluded: distinct asc raze {[b;r]
    b: where b=-1+b@r;
    s: last b where r>b;
    e: first b where r<b;
    s+1+til e-s
  }[brackets]each red;
  x@(til count x)except  excluded
}


//Task 13.1
input: read0 hsym `$"C:/adovzhenko/kdb_scripts/aoc/2015_t13_p1.txt";
input: (!). flip{
    x:(" "vs x) 0 2 3 10;
    (`$(x 0;-1_x 3); $["gain"~x 1;1;-1]*"J"$x 2)
}each input;
attenders: distinct raze key input;

permutations: {raze {[y;x] i:til 1+count x; ((i#\:x),'y),'i _\:x}[y]each x} over enlist[(attenders 0 1;attenders 1 0)],2_attenders;
max{sum x@/: (reverse each y),y:(y,'(1_y),y 0)}[input]each permutations
//Task 13.2
input: read0 hsym `$"C:/adovzhenko/kdb_scripts/aoc/2015_t13_p2.txt";
input: (!). flip{
    x:(" "vs x) 0 2 3 10;
    (`$(x 0;-1_x 3); $["gain"~x 1;1;-1]*"J"$x 2)
}each input;
attenders: (distinct raze key input),`me;
permutations: {raze {[y;x] i:til 1+count x; ((i#\:x),'y),'i _\:x}[y]each x} over enlist[(attenders 0 1;attenders 1 0)],2_attenders;
max{sum x@/: (reverse each y),y:(y,'(1_y),y 0)}[input]each permutations


//------------------------------------
//Task 14
.aoc.d14.t1: {[x;time]
    x: "\n" vs x;
    x: {x: " " vs x; ("J"$x 3;"J"$x 6;"J"$x 13) } each x;
    max{[time;reideer]
        speed: reideer 0;
        fly: reideer 1;
        rest: reideer 2;
        cycles: floor time%fly+rest;
        travelled: cycles * fly;
        travelled+: fly&mod[time;fly+rest];
        travelled*: speed;
        travelled
    }[time]'[x]
 };


.aoc.d14.t2: {[x;time]
    x: "\n" vs x;
    x: flip `speed`fly`rest!flip {x: " " vs x; ("J"$x 3;"J"$x 6;"J"$x 13) } each x;
    x: update mode: 1b, timeLeft: fly, distance: 0, score: 0 from x;
    do[time; x: {
        //switch mode if neccessary
        x: update switch: 1b from x where timeLeft=0;
        x: update mode: not mode from x where switch;
        x: update timeLeft: ?[mode;fly;rest] from x where switch;
        x: delete switch from x;

        //update distance and scores
        x: update distance: distance+speed from x where mode;
        x[`timeLeft]-: 1;
        x: update score: score+1 from x where distance=max distance;
        x
    }x];
    max x`score
 };

//Faster functional form
.aoc.d14.t2: {[x;time]
    x: "\n" vs x;
    x: flip `speed`fly`rest!flip {x: " " vs x; ("J"$x 3;"J"$x 6;"J"$x 13) } each x;
    x: update mode: 1b, timeLeft: fly, distance: 0, score: 0 from x;
    do[time; x: {
        //switch mode if neccessary
        switch: 0=x`timeLeft;
        x[`mode]: ?[switch;not x`mode;x`mode];
        x[`timeLeft]: ?[switch;?[x`mode;x`fly;x`rest];x`timeLeft];

        //update distance and scores
        x[`distance]+: x[`mode]*x`speed;
        x[`timeLeft]-: 1;
        x[`score]+: x[`distance]=max x[`distance];
        x
    }x];
    max x`score
 };


//------------------------------------
//Task 15
// Brute-force
.aoc.d15.t1: {
    x: flip "J"${last each" " vs/:x}each "," vs/: "\n" vs x;
    x: -1 _ x;
    .tmp.max: 0;
    {[x;a;b;c;d] .tmp.max|: $[100=a+b+c+d;prd 0|sum each x*\:(a;b;c;d);0]}
        [x]'[til 101]'[til 101]'[til 101]'[til 101];
    .tmp.max
 };


.aoc.d15.t2: {
    x: flip "J"${last each" " vs/:x}each "," vs/: "\n" vs x;
    calories: last x;
    x: -1 _ x;
    .tmp.max: 0;
    {[x;cal;a;b;c;d] .tmp.max|: $[(100=a+b+c+d)&500=sum cal*(a;b;c;d);prd 0|sum each x*\:(a;b;c;d);0]}
        [x;calories]'[til 101]'[til 101]'[til 101]'[til 101];
    .tmp.max
 };