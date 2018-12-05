//------------------------------------
//Task 1.1
sum"J"$read0 hsym`$input.dir,"2018_1.input"
//Task 1.2
{
    x: x, last[x]+y;
    g: group x;
    i: (key g)@where 2<=count each value g;
    r: i#g;
    $[0=count i; .z.s[x;y]; (key r)@where value r[;1]=min r[;1]]
}[0;sums "J"$read0 hsym`$input.dir,"2018_1.input"]


//------------------------------------
//Task 2.1
{prd sum {2 3 in count each group x}each x}("abcdef";"bababc";"abbcde";"abcccd";"aabcdd";"abcdee";"ababab")
//Task 2.2 (brute force, should be Trie)
{first raze{
  d:0=last deltas`int$x 0 1;
  $[1=sum not d; enlist(x 0)@where d;()]
}each{x cross x}enlist each x}("abcde";"fghij";"klmno";"pqrst";"fguij";"axcye";"wvxyz")


//------------------------------------
//Task 3.1, 3.2
.aoc.parse:{x:-2#" " vs x;"J"$(","vs -1_x 0), "x" vs x 1};
.aoc.size: {max{(x[0]+x[2];x[1]+x[3])} each x};
data: .aoc.parse each data;
size: .aoc.size data;
count where 1<count each group raze {{(x[0]*size 0)+x 1}each (x 0 1) +/: til[x 2] cross til[x 3]}each data
(til count data) except {distinct raze exec id from select from x where 1<count each id}select id by data from ungroup update id: i from ([]{{(x[0]*size 0)+x 1}each (x 0 1) +/: til[x 2] cross til[x 3]}each data)


//------------------------------------
//Task 4
.aoc.d4.prepare: {
  x: `time xasc update time: {"P"$(string 400+"J"$x[0 1 2 3]),".",x[5 6],".",x[8 9],"D",x[11 12 13 14 15]} each 1_'17#'payload from ([]payload: x);
  x: update ID: "J"$first each" " vs/:26_'payload from x where payload like "*Guard*";
  x: update fills ID from x;
  x: update sleep: payload like "*asleep*"from x;
  x: update period: next[time]-time from x;
  x
};

.aoc.d4.addMm: {[time;period]
  ((`hh$time)+`int$`minute$time)+til each `long$0^(`long$1e-9*period)%60
 };

.aoc.d4.getStrategy1: {
  sleepyID: exec first ID from`period xdesc select sum period by ID from x where sleep;
  x: select from data where ID=sleepyID, sleep;
  x: update mm: .aoc.d4.addMm[time;period] from x;
  sleepyID*{key[x]@first where max[c]=c:count each value x}group raze x`mm
 };

.aoc.d4.getStrategy2: {
  x: select mm: {c:count each value x;m:max c;(key[x]@first where c=m;m)}group raze .aoc.d4.addMm[time;period] by ID from data where sleep;
  exec first ID*mm[;0]from x where mm[;1]=max mm[;1]
 };

.aoc.d4.getStrategy1 .aoc.d4.prepare read0 hsym`$input.dir,"2018_5.input";
.aoc.d4.getStrategy2 .aoc.d4.prepare read0 hsym`$input.dir,"2018_5.input";


//------------------------------------
//Task 5.1
0 0 4 6 10 ~
  {-1+count{$[32=abs y-last x;-1_x;x,y]} over 0N,`int$x}
  each ("aA";"abBA";"abAB";"aabAAB";"dabAcCaCBAcCcaDA");
//Task 5.2
0 0 0 0 4 ~
  {min {-1+count{$[32=abs y-last x;-1_x;x,y]} over 0N,`int$x} each {x except y, upper y}[x]each distinct lower distinct x}
  each ("aA";"abBA";"abAB";"aabAAB";"dabAcCaCBAcCcaDA");