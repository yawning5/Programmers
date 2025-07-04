function solution(s) {
    var answer = '';
    let max = -Infinity
    let min = Infinity
    const arr = s.split(" ");
    for (let i of arr) {
        max = Math.max(max, +i)
        min = Math.min(min, +i)
    }
    answer = `${min} ${max}`
    return answer;
}