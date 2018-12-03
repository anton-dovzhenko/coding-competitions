//Task 1.1
sum"J"$read0 hsym`$input.dir,"2018_1_1.input"
//Task 1.2
{
    x: x, last[x]+y;
    g: group x;
    i: (key g)@where 2<=count each value g;
    r: i#g;
    $[0=count i; .z.s[x;y]; (key r)@where value r[;1]=min r[;1]]
}[0;sums "J"$read0 hsym`$input.dir,"2018_1_2.input"]


//Task 2.1
{prd sum {2 3 in count each group x}each x}("abcdef";"bababc";"abbcde";"abcccd";"aabcdd";"abcdee";"ababab")
//Task 2.2 (brute force, should be Trie)
{first raze{
  d:0=last deltas`int$x 0 1;
  $[1=sum not d; enlist(x 0)@where d;()]
}each{x cross x}enlist each x}("abcde";"fghij";"klmno";"pqrst";"fguij";"axcye";"wvxyz")

//Task 3.1, 3.2
.aoc.parse:{x:-2#" " vs x;"J"$(","vs -1_x 0), "x" vs x 1};
.aoc.size: {max{(x[0]+x[2];x[1]+x[3])} each x};
data: .aoc.parse each data;
size: .aoc.size data;
count where 1<count each group raze {{(x[0]*size 0)+x 1}each (x 0 1) +/: til[x 2] cross til[x 3]}each data
(til count data) except {distinct raze exec id from select from x where 1<count each id}select id by data from ungroup update id: i from ([]{{(x[0]*size 0)+x 1}each (x 0 1) +/: til[x 2] cross til[x 3]}each data)