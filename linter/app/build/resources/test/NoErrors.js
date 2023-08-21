
function add1(a,b) {
  overflow = and(a,b);
  sum = xor(a,b);
  return {sum, overflow};
}