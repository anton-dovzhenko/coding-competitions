//Task 6.1
I: til 1000000;
sum {?[((floor I%1000) within y[1][0 2])&mod[I;1000] within y[1][1 3];y[0]@x;x]} over (1000000#0b;({1b};(489,959, 759,964));({0b};(427,423, 929,502));({not x};(756,965, 812,992)))
//Task 6.2
sum {?[((floor I%1000) within y[1][0 2])&mod[I;1000] within y[1][1 3];y[0]@x;x]} over (1000000#0;({x+1};489,959,759,964);({0|x-1};820,516,871,914);({x+2};120,314,745,489))

//Task 7.1
.aoc.toBinary: {`boolean$2 vs/:x};
.aoc.operations: ("NOT";"AND";"OR";"LSHIFT";"RSHIFT")!(
{((16-count x)#1b),not x}
;{s: neg min count each (x;y);(s#x)&s#y}
;{s: neg min count each (x;y);(s _ y),(s _ x),(s#x)|s#y}
;{x,$[1=type y;2 sv y;y]#0b}
;{(neg $[1=type y;2 sv y;y])_ x}
);
.aoc.getVal: {$[any y~/:key x;x@y;.aoc.toBinary "J"$ y]};

{x:1_x;([]first each key x;2 sv/:value x)}
{[x;y]
  y: " -> "vs y;
  s: " " vs y 0;    //statement
  v: y 1;           //variable
  x, enlist[v]!enlist
  $[1=count s
    ;.aoc.toBinary "J"$s 0
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



