/**
 * @param {string} s
 * @return {string}
 */
var longestPrefix = function (s) {
  const len = s.length;
  let idx = len - 1,
    flag = true;
  while (flag) {
    if (idx === 0) return "";
    const prefix = s.slice(0, idx);
    const lstfix = s.slice(len - idx);
    if (prefix === lstfix) {
      return prefix;
    } else {
      idx--;
    }
  }
};
